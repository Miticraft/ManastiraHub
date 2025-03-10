package com.miticraft.DiplomnaRabota;

public class SudokuSolver {

    public static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solve(int[][] board, int row, int col) {
        if (row == 9) return true;
        if (col == 9) return solve(board, row + 1, 0);
        if (board[row][col] != 0) return solve(board, row, col + 1);

        for (int num = 1; num <= 9; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (solve(board, row, col + 1)) return true;
                board[row][col] = 0; // Backtrack
            }
        }
        return false;
    }
}
