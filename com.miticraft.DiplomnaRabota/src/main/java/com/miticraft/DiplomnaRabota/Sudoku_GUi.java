package com.miticraft.DiplomnaRabota;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Sudoku_GUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private static int delay = 100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sudoku_GUi frame = new Sudoku_GUi();
					frame.setVisible(true);
					frame.setTitle("Sudoku Solver");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public static boolean isSafe(int a[][], int rows, int cols, int num) {
		for (int i = 0; i < 9; i++) {
			if (a[rows][i] == num) {
				return false;
			}
		}
		for (int i = 0; i < 9; i++) {
			if (a[i][cols] == num) {
				return false;
			}
		}
		int startRow = rows - rows % 3;
		int startCol = cols - cols % 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i + startRow][j + startCol] == num) {
					return false;
				}
			}
		}
		return true;
	}

	public static void read(int[][] arr, JTextField[] arr2) {
		int row = 0;
		for (int i = 0; i < 81; i++) {
			if (arr2[i].getText().isBlank()) {
				arr2[i].setText("0");
			}
			if (i % 9 == 0 && i != 0) {
				row += 1;
			}
			arr[row][i % 9] = Integer.valueOf(arr2[i].getText());

		}
	}

	public static void setSudoku(int[][] arr, JTextField[] arr2) {
		int row = 0;
		for (int i = 0; i < 81; i++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i % 9 == 0 && i != 0) {
				row += 1;
			}
			arr2[i].setText(String.valueOf(arr[row][i % 9]));
		}
	}

	public static boolean Solve(int a[][], int rows, int cols) {
		if (rows == 8 && cols == 8) {
			return true;
		}
		if (cols == 8) {
			cols = 0;
			rows++;
		}
		if (a[rows][cols] != 0) {
			return Solve(a, rows, cols + 1);
		}
		for (int i = 1; i < 10; i++) {
			if (isSafe(a, rows, cols, i)) {
				a[rows][cols] = i;
				if (Solve(a, rows, cols + 1)) {
					return true;
				}
				a[rows][cols] = 0;
			}
		}
		return false;
	}
	public static void Sudoku_Solve(JTextField Zadacha[]) {
		int Sudoku[][] = new int[9][9];
		read(Sudoku, Zadacha);
		if (Solve(Sudoku, 0, 0) == false) {
			JOptionPane.showMessageDialog(null, "Няма решение");
		}
		for (int j = 0; j < 9; j++) {
			for (int k = 1; k < 10; k++) {
				if (isSafe(Sudoku, j, 8, k)) {
					Sudoku[j][8] = k;
				}
			}
		}
		setSudoku(Sudoku, Zadacha);
		JOptionPane.showMessageDialog(null, "Судоко решено!");
	}
	public Sudoku_GUi() {
		setResizable(false);
		JTextField[] Zadacha = new JTextField[81];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < Zadacha.length; i++) {
					Zadacha[i].setText("");
				}
			}
		});
		btnNewButton_1.setBounds(359, 457, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\SudokuOutline.png"));
		lblNewLabel.setBounds(0, 0, 496, 524);
		contentPane.add(lblNewLabel);
		Timer timer = new Timer();
		
		int count = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 0; i < 9; i++) {
			a = 0;
			b = 0;
			if (i % 3 == 0) {
				c += 1;
				d = c * 24;
			}
			for (int j = 0; j < 9; j++) {
				if (j % 3 == 0) {
					a += 1;
					b = a * 22;
				}
				Zadacha[count] = new JTextField();
				Zadacha[count].setBounds(42 + (j * 34 + b), 24 + (i * 34 + d), 24, 24);
				Zadacha[count].setHorizontalAlignment(SwingConstants.CENTER);
				Zadacha[count].setFont(new Font("Comic Sans MS", Font.BOLD, 18));
				Zadacha[count].setColumns(10);
				Zadacha[count].setText("");
				Zadacha[count].setDocument(new Sudoku_Kurva(1));
				Zadacha[count].addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						char a = e.getKeyChar();
						if(a <'0'|| a>'9') {
							e.consume();
						}
					}
					
					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						if(e.getKeyCode() == KeyEvent.VK_KP_DOWN) {
							
						}
					}
				});
				contentPane.add(Zadacha[count]);
				count++;

			}
			JButton btnNewButton = new JButton("Solve");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new SwingWorker<Void, Void>() {
					    @Override
					    protected Void doInBackground() {
					        Sudoku_Solve(Zadacha);
					        return null;
					    }
					}.execute();

				}
			});
			btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 46));
			btnNewButton.setBounds(147, 420, 181, 74);
			contentPane.add(btnNewButton);

//			JLabel lblNewLabel = new JLabel("New label");
//			lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
//			lblNewLabel.setIcon(new ImageIcon(Sudoku_GUi.class.getResource(
//					"/com/miticraft/DiplomnaRabota/384550242_1047039396495966_2789431813634766052_n.jpg")));
//			lblNewLabel.setBounds(0, 262, 495, 260);
//			contentPane.add(lblNewLabel);
//
//			lblNewLabel_1 = new JLabel("New label");
//			lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
//			lblNewLabel_1.setIcon(new ImageIcon(Sudoku_GUi.class.getResource(
//					"/com/miticraft/DiplomnaRabota/384550242_1047039396495966_2789431813634766051_n.jpg")));
//			lblNewLabel_1.setBounds(0, 2, 495, 260);
//			contentPane.add(lblNewLabel_1);

		}
	}
}