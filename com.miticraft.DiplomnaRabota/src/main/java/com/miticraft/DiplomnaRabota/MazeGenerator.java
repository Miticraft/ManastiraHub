package com.miticraft.DiplomnaRabota;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class MazeGenerator extends JPanel {
    private final int rows = 20, cols = 20;
    private final int cellSize = 20;
    private final Cell[][] grid = new Cell[rows][cols];
    private boolean generating = false;
    private boolean solving = false;
    private JButton startButton, solveButton;

    public MazeGenerator() {
        setPreferredSize(new Dimension(cols * cellSize, rows * cellSize));
        setLayout(null);
        
        startButton = new JButton("Start");
        solveButton = new JButton("Solve");
        
        startButton.setBounds(10, rows * cellSize + 10, 80, 30);
        solveButton.setBounds(100, rows * cellSize + 10, 80, 30);
        
        startButton.addActionListener(e -> new Thread(this::generateMaze).start());
        solveButton.addActionListener(e -> new Thread(this::solveMaze).start());
        
        add(startButton);
        add(solveButton);
    }

    private void generateMaze() {
        generating = true;
        solving = false;
        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                grid[r][c] = new Cell(r, c);
            }
        }
        grid[0][0].Start(getGraphics(), 0, 0, cellSize);
        Stack<Cell> stack = new Stack<>();
        Cell current = grid[0][0];
        current.visited = true;
        stack.push(current);

        while (!stack.isEmpty()) {
            Cell next = getUnvisitedNeighbor(current);
            if (next != null) {
                removeWall(current, next);
                next.visited = true;
                stack.push(next);
                current = next;
            } else {
                current = stack.pop();
            }
            repaint();
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        generating = false;
    }

    private void solveMaze() {
        if (generating || solving) return;
        solving = true;
        Stack<Cell> path = new Stack<>();
        Cell start = grid[0][0];
        start.Start(getGraphics(), 0, 0, cellSize);
        Cell end = grid[rows - 1][cols - 1];
        boolean[][] visited = new boolean[rows][cols];
        
        path.push(start);
        visited[start.row][start.col] = true;
        
        while (!path.isEmpty()) {
            Cell current = path.peek();
            current.inPath = true;
            repaint();
            
            if (current == end) break;
            
            Cell next = getNextPath(current, visited);
            if (next != null) {
                visited[next.row][next.col] = true;
                path.push(next);
            } else {
                path.pop().inPath = false;
            }
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        solving = false;
        JOptionPane.showMessageDialog(null, "Лабиринт Решен");
    }

    private Cell getNextPath(Cell cell, boolean[][] visited) {
        int r = cell.row, c = cell.col;
        if (!cell.top && r > 0 && !visited[r - 1][c]) return grid[r - 1][c];
        if (!cell.right && c < cols - 1 && !visited[r][c + 1]) return grid[r][c + 1];
        if (!cell.bottom && r < rows - 1 && !visited[r + 1][c]) return grid[r + 1][c];
        if (!cell.left && c > 0 && !visited[r][c - 1]) return grid[r][c - 1];
        return null;
    }

    private Cell getUnvisitedNeighbor(Cell cell) {
        ArrayList<Cell> neighbors = new ArrayList<>();
        int r = cell.row, c = cell.col;
        if (r > 0 && !grid[r - 1][c].visited) neighbors.add(grid[r - 1][c]);
        if (r < rows - 1 && !grid[r + 1][c].visited) neighbors.add(grid[r + 1][c]);
        if (c > 0 && !grid[r][c - 1].visited) neighbors.add(grid[r][c - 1]);
        if (c < cols - 1 && !grid[r][c + 1].visited) neighbors.add(grid[r][c + 1]);
        if (neighbors.isEmpty()) return null;
        Collections.shuffle(neighbors);
        return neighbors.get(0);
    }

    private void removeWall(Cell a, Cell b) {
        if (a.row == b.row) {
            if (a.col > b.col) {
                a.left = false;
                b.right = false;
            } else {
                a.right = false;
                b.left = false;
            }
        } else {
            if (a.row > b.row) {
                a.top = false;
                b.bottom = false;
            } else {
                a.bottom = false;
                b.top = false;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        if (grid == null) return; // Ensure grid is initialized

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] != null) {  // Check if cell is initialized
                    grid[r][c].draw(g, c * cellSize, r * cellSize, cellSize);
                }
            }
        }
    }


    private static class Cell {
        int row, col;
        boolean visited = false, inPath = false;
        boolean top = true, right = true, bottom = true, left = true;

        Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
        void Start(Graphics g, int x, int y, int size) {
        	g.setColor(Color.BLUE);
        	g.fillRect(x, y, size-2, size-2);
        	g.setColor(Color.BLACK);
        }
        void draw(Graphics g, int x, int y, int size) {
            g.setColor(Color.BLACK);
            if (top) g.drawLine(x, y, x + size, y);
            if (right) g.drawLine(x + size, y, x + size, y + size);
            if (bottom) g.drawLine(x, y + size, x + size, y + size);
            if (left) g.drawLine(x, y, x, y + size);
            if (visited) {
                g.setColor(Color.WHITE);
                g.fillRect(x + 1, y + 1, size - 2, size - 2);
                g.setColor(Color.BLACK);
            }
            if (inPath) {
                g.setColor(Color.RED);
                g.fillRect(x + size / 4, y + size / 4, size / 2, size / 2);
                g.setColor(Color.BLACK);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Maze Generator & Solver");
            MazeGenerator maze = new MazeGenerator();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(maze);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setBounds(ALLBITS, ABORT, 414, 490);
            frame.setResizable(false);
        });
    }
}
