package com.miticraft.DiplomnaRabota;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sudoku_GUi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sudoku_GUi frame = new Sudoku_GUi();
					frame.setVisible(true);
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
		}for (int i = 0; i < 9; i++) {
			if (a[i][cols] == num) {
				return false;
			}
		}
		int startRow = rows - rows%3;
		int startCol = cols - cols%3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(a[i+startRow][j+startCol] == num) {
					return false;
				}
			}
		}
		return true;
	}
	public static void read(int[][]arr, JTextField[]arr2) {
		int row =0;
		for (int i = 0; i < 81; i++) {
			if (i%9==0 && i!=0) {
				row+=1;
			}
			arr[row][i%9] = Integer.valueOf(arr2[i].getText());
				
		}
	}
	public static void setSudoku(int[][]arr, JTextField[]arr2) {
		int row =0;
		for (int i = 0; i < 81; i++) {
			if (i%9==0 && i!=0) {
				row+=1;
			}
				arr2[i].setText(String.valueOf(arr[row][i%9]));
			}
	}
	public static boolean Solve(int a[][], int rows, int cols) {
		if(rows == 8 && cols == 8) {
			return true;
		}
		if(cols == 8) {
			cols = 0;
			rows++;
		}
		if(a[rows][cols] != 0) {
			return Solve(a, rows, cols+1);
		}
		for (int i = 1; i< 10; i++) {
			if (isSafe(a, rows, cols, i)) {
				a[rows][cols] = i;
				if (Solve(a, rows, cols+1)) {
					return true;
				}
				a[rows][cols] = 0;
			}
		}
		return false;
	}
	public Sudoku_GUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Solve");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField Zadacha[] = {
						textField, textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7,textField_8,
						textField_9, textField_10, textField_11, textField_12, textField_13, textField_14, textField_15, textField_16, textField_17,
						textField_18, textField_19, textField_20, textField_21, textField_22, textField_23, textField_24, textField_25, textField_26,
						textField_27, textField_28, textField_29, textField_30, textField_31, textField_32, textField_33, textField_34, textField_35,
						textField_36, textField_37, textField_38, textField_39, textField_40, textField_41, textField_42, textField_43, textField_44,
						textField_45, textField_46, textField_47, textField_48, textField_49, textField_50, textField_51, textField_52, textField_53,
						textField_54, textField_55, textField_56, textField_57, textField_58, textField_59, textField_60, textField_61, textField_62,
						textField_63, textField_64, textField_65, textField_66, textField_67, textField_68, textField_69, textField_70, textField_71,
						textField_72, textField_73, textField_74, textField_75, textField_76, textField_77, textField_78, textField_79, textField_80};
				int Sudoku[][] = new int[9][9];
				read(Sudoku, Zadacha);
				Solve(Sudoku, 0, 0);
				setSudoku(Sudoku, Zadacha);
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 46));
		btnNewButton.setBounds(147, 411, 181, 74);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField.setText("0");
		textField.setBounds(56, 54, 24, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(90, 54, 24, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(124, 54, 24, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(180, 54, 24, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(214, 54, 24, 24);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_5.setColumns(10);
		textField_5.setBounds(248, 54, 24, 24);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_6.setColumns(10);
		textField_6.setBounds(304, 54, 24, 24);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(338, 54, 24, 24);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("0");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(372, 54, 24, 24);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("0");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(56, 88, 24, 24);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("0");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_10.setColumns(10);
		textField_10.setBounds(90, 88, 24, 24);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("0");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_11.setColumns(10);
		textField_11.setBounds(124, 88, 24, 24);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("0");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_12.setColumns(10);
		textField_12.setBounds(180, 88, 24, 24);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("0");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_13.setColumns(10);
		textField_13.setBounds(214, 88, 24, 24);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("0");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_14.setColumns(10);
		textField_14.setBounds(248, 88, 24, 24);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("0");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_15.setColumns(10);
		textField_15.setBounds(304, 88, 24, 24);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("0");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_16.setColumns(10);
		textField_16.setBounds(338, 88, 24, 24);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("0");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_17.setColumns(10);
		textField_17.setBounds(372, 88, 24, 24);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("0");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_18.setColumns(10);
		textField_18.setBounds(56, 122, 24, 24);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("0");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_19.setColumns(10);
		textField_19.setBounds(90, 122, 24, 24);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("0");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_20.setColumns(10);
		textField_20.setBounds(124, 122, 24, 24);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setText("0");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_21.setColumns(10);
		textField_21.setBounds(180, 122, 24, 24);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setText("0");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_22.setColumns(10);
		textField_22.setBounds(214, 122, 24, 24);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("0");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_23.setColumns(10);
		textField_23.setBounds(248, 122, 24, 24);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText("0");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_24.setColumns(10);
		textField_24.setBounds(304, 122, 24, 24);
		contentPane.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setText("0");
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_25.setColumns(10);
		textField_25.setBounds(338, 122, 24, 24);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setText("0");
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_26.setColumns(10);
		textField_26.setBounds(372, 122, 24, 24);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setText("0");
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_27.setColumns(10);
		textField_27.setBounds(56, 170, 24, 24);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setText("0");
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_28.setColumns(10);
		textField_28.setBounds(90, 170, 24, 24);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setText("0");
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_29.setColumns(10);
		textField_29.setBounds(124, 170, 24, 24);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setText("0");
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_30.setColumns(10);
		textField_30.setBounds(180, 170, 24, 24);
		contentPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setText("0");
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_31.setColumns(10);
		textField_31.setBounds(214, 170, 24, 24);
		contentPane.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setText("0");
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_32.setColumns(10);
		textField_32.setBounds(248, 170, 24, 24);
		contentPane.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setText("0");
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_33.setColumns(10);
		textField_33.setBounds(304, 170, 24, 24);
		contentPane.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setText("0");
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_34.setColumns(10);
		textField_34.setBounds(338, 170, 24, 24);
		contentPane.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setText("0");
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_35.setColumns(10);
		textField_35.setBounds(372, 170, 24, 24);
		contentPane.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setText("0");
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_36.setColumns(10);
		textField_36.setBounds(56, 204, 24, 24);
		contentPane.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setText("0");
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_37.setColumns(10);
		textField_37.setBounds(90, 204, 24, 24);
		contentPane.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setText("0");
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_38.setColumns(10);
		textField_38.setBounds(124, 204, 24, 24);
		contentPane.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setText("0");
		textField_39.setHorizontalAlignment(SwingConstants.CENTER);
		textField_39.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_39.setColumns(10);
		textField_39.setBounds(180, 204, 24, 24);
		contentPane.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setText("0");
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_40.setColumns(10);
		textField_40.setBounds(214, 204, 24, 24);
		contentPane.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setText("0");
		textField_41.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_41.setColumns(10);
		textField_41.setBounds(248, 204, 24, 24);
		contentPane.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setText("0");
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_42.setColumns(10);
		textField_42.setBounds(304, 204, 24, 24);
		contentPane.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setText("0");
		textField_43.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_43.setColumns(10);
		textField_43.setBounds(338, 204, 24, 24);
		contentPane.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setText("0");
		textField_44.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_44.setColumns(10);
		textField_44.setBounds(372, 204, 24, 24);
		contentPane.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setText("0");
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_45.setColumns(10);
		textField_45.setBounds(56, 238, 24, 24);
		contentPane.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setText("0");
		textField_46.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_46.setColumns(10);
		textField_46.setBounds(90, 238, 24, 24);
		contentPane.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setText("0");
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_47.setColumns(10);
		textField_47.setBounds(124, 238, 24, 24);
		contentPane.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setText("0");
		textField_48.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_48.setColumns(10);
		textField_48.setBounds(180, 238, 24, 24);
		contentPane.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setText("0");
		textField_49.setHorizontalAlignment(SwingConstants.CENTER);
		textField_49.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_49.setColumns(10);
		textField_49.setBounds(214, 238, 24, 24);
		contentPane.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setText("0");
		textField_50.setHorizontalAlignment(SwingConstants.CENTER);
		textField_50.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_50.setColumns(10);
		textField_50.setBounds(248, 238, 24, 24);
		contentPane.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setText("0");
		textField_51.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_51.setColumns(10);
		textField_51.setBounds(304, 238, 24, 24);
		contentPane.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setText("0");
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_52.setColumns(10);
		textField_52.setBounds(338, 238, 24, 24);
		contentPane.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setText("0");
		textField_53.setHorizontalAlignment(SwingConstants.CENTER);
		textField_53.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_53.setColumns(10);
		textField_53.setBounds(372, 238, 24, 24);
		contentPane.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setText("0");
		textField_54.setHorizontalAlignment(SwingConstants.CENTER);
		textField_54.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_54.setColumns(10);
		textField_54.setBounds(56, 286, 24, 24);
		contentPane.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setText("0");
		textField_55.setHorizontalAlignment(SwingConstants.CENTER);
		textField_55.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_55.setColumns(10);
		textField_55.setBounds(90, 286, 24, 24);
		contentPane.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setText("0");
		textField_56.setHorizontalAlignment(SwingConstants.CENTER);
		textField_56.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_56.setColumns(10);
		textField_56.setBounds(124, 286, 24, 24);
		contentPane.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setText("0");
		textField_57.setHorizontalAlignment(SwingConstants.CENTER);
		textField_57.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_57.setColumns(10);
		textField_57.setBounds(180, 286, 24, 24);
		contentPane.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setText("0");
		textField_58.setHorizontalAlignment(SwingConstants.CENTER);
		textField_58.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_58.setColumns(10);
		textField_58.setBounds(214, 286, 24, 24);
		contentPane.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setText("0");
		textField_59.setHorizontalAlignment(SwingConstants.CENTER);
		textField_59.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_59.setColumns(10);
		textField_59.setBounds(248, 286, 24, 24);
		contentPane.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setText("0");
		textField_60.setHorizontalAlignment(SwingConstants.CENTER);
		textField_60.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_60.setColumns(10);
		textField_60.setBounds(304, 286, 24, 24);
		contentPane.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setText("0");
		textField_61.setHorizontalAlignment(SwingConstants.CENTER);
		textField_61.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_61.setColumns(10);
		textField_61.setBounds(338, 286, 24, 24);
		contentPane.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setText("0");
		textField_62.setHorizontalAlignment(SwingConstants.CENTER);
		textField_62.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_62.setColumns(10);
		textField_62.setBounds(372, 286, 24, 24);
		contentPane.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setText("0");
		textField_63.setHorizontalAlignment(SwingConstants.CENTER);
		textField_63.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_63.setColumns(10);
		textField_63.setBounds(56, 320, 24, 24);
		contentPane.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setText("0");
		textField_64.setHorizontalAlignment(SwingConstants.CENTER);
		textField_64.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_64.setColumns(10);
		textField_64.setBounds(90, 320, 24, 24);
		contentPane.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setText("0");
		textField_65.setHorizontalAlignment(SwingConstants.CENTER);
		textField_65.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_65.setColumns(10);
		textField_65.setBounds(124, 320, 24, 24);
		contentPane.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setText("0");
		textField_66.setHorizontalAlignment(SwingConstants.CENTER);
		textField_66.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_66.setColumns(10);
		textField_66.setBounds(180, 320, 24, 24);
		contentPane.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setText("0");
		textField_67.setHorizontalAlignment(SwingConstants.CENTER);
		textField_67.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_67.setColumns(10);
		textField_67.setBounds(214, 320, 24, 24);
		contentPane.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setText("0");
		textField_68.setHorizontalAlignment(SwingConstants.CENTER);
		textField_68.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_68.setColumns(10);
		textField_68.setBounds(248, 320, 24, 24);
		contentPane.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setText("0");
		textField_69.setHorizontalAlignment(SwingConstants.CENTER);
		textField_69.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_69.setColumns(10);
		textField_69.setBounds(304, 320, 24, 24);
		contentPane.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setText("0");
		textField_70.setHorizontalAlignment(SwingConstants.CENTER);
		textField_70.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_70.setColumns(10);
		textField_70.setBounds(338, 320, 24, 24);
		contentPane.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setText("0");
		textField_71.setHorizontalAlignment(SwingConstants.CENTER);
		textField_71.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_71.setColumns(10);
		textField_71.setBounds(372, 320, 24, 24);
		contentPane.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setText("0");
		textField_72.setHorizontalAlignment(SwingConstants.CENTER);
		textField_72.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_72.setColumns(10);
		textField_72.setBounds(56, 354, 24, 24);
		contentPane.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setText("0");
		textField_73.setHorizontalAlignment(SwingConstants.CENTER);
		textField_73.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_73.setColumns(10);
		textField_73.setBounds(90, 354, 24, 24);
		contentPane.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setText("0");
		textField_74.setHorizontalAlignment(SwingConstants.CENTER);
		textField_74.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_74.setColumns(10);
		textField_74.setBounds(124, 354, 24, 24);
		contentPane.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setText("0");
		textField_75.setHorizontalAlignment(SwingConstants.CENTER);
		textField_75.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_75.setColumns(10);
		textField_75.setBounds(180, 354, 24, 24);
		contentPane.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setText("0");
		textField_76.setHorizontalAlignment(SwingConstants.CENTER);
		textField_76.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_76.setColumns(10);
		textField_76.setBounds(214, 354, 24, 24);
		contentPane.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setText("0");
		textField_77.setHorizontalAlignment(SwingConstants.CENTER);
		textField_77.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_77.setColumns(10);
		textField_77.setBounds(248, 354, 24, 24);
		contentPane.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setText("0");
		textField_78.setHorizontalAlignment(SwingConstants.CENTER);
		textField_78.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_78.setColumns(10);
		textField_78.setBounds(304, 354, 24, 24);
		contentPane.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setText("0");
		textField_79.setHorizontalAlignment(SwingConstants.CENTER);
		textField_79.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_79.setColumns(10);
		textField_79.setBounds(338, 354, 24, 24);
		contentPane.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setText("0");
		textField_80.setHorizontalAlignment(SwingConstants.CENTER);
		textField_80.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		textField_80.setColumns(10);
		textField_80.setBounds(372, 354, 24, 24);
		contentPane.add(textField_80);
	

		}
	}

