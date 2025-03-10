package com.miticraft.DiplomnaRabota;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class Cafe_SchoolApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafe_SchoolApp frame = new Cafe_SchoolApp();
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
	public Cafe_SchoolApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1132, 816);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(187, 36, 80, 100);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(403, 33, 80, 100);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(630, 32, 80, 100);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(852, 29, 80, 100);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(187, 343, 80, 100);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBounds(403, 340, 80, 100);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(630, 339, 80, 100);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(852, 336, 80, 100);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5 = new JLabel("Price: 4.50");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(187, 142, 60, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Price: 4.50");
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(405, 142, 60, 13);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Price: 4.50");
		lblNewLabel_5_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5_2.setBounds(619, 142, 60, 13);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("Price: 4.50");
		lblNewLabel_5_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5_3.setBounds(842, 142, 60, 13);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Price: 4.50");
		lblNewLabel_5_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5_4.setBounds(183, 446, 60, 13);
		contentPane.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("Price: 4.50");
		lblNewLabel_5_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5_5.setBounds(401, 446, 60, 13);
		contentPane.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_5_6 = new JLabel("Price: 4.50");
		lblNewLabel_5_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5_6.setBounds(615, 446, 60, 13);
		contentPane.add(lblNewLabel_5_6);
		
		JLabel lblNewLabel_5_7 = new JLabel("Price: 4.50");
		lblNewLabel_5_7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_5_7.setBounds(838, 446, 60, 13);
		contentPane.add(lblNewLabel_5_7);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(277, 36, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("New label");
		lblNewLabel_6_1.setBounds(493, 36, 45, 13);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("New label");
		lblNewLabel_6_1_1.setBounds(720, 36, 45, 13);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("New label");
		lblNewLabel_6_1_2.setBounds(942, 36, 45, 13);
		contentPane.add(lblNewLabel_6_1_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("New label");
		lblNewLabel_6_2.setBounds(277, 343, 45, 13);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_1_3 = new JLabel("New label");
		lblNewLabel_6_1_3.setBounds(493, 343, 45, 13);
		contentPane.add(lblNewLabel_6_1_3);
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("New label");
		lblNewLabel_6_1_1_1.setBounds(720, 343, 45, 13);
		contentPane.add(lblNewLabel_6_1_1_1);
		
		JLabel lblNewLabel_6_1_2_1 = new JLabel("New label");
		lblNewLabel_6_1_2_1.setBounds(942, 343, 45, 13);
		contentPane.add(lblNewLabel_6_1_2_1);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(201, 232, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("New label");
		lblNewLabel_7_1.setBounds(402, 232, 45, 13);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("New label");
		lblNewLabel_7_2.setBounds(629, 232, 45, 13);
		contentPane.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("New label");
		lblNewLabel_7_3.setBounds(851, 232, 45, 13);
		contentPane.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_4 = new JLabel("New label");
		lblNewLabel_7_4.setBounds(207, 540, 45, 13);
		contentPane.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("New label");
		lblNewLabel_7_1_1.setBounds(408, 540, 45, 13);
		contentPane.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("New label");
		lblNewLabel_7_2_1.setBounds(635, 540, 45, 13);
		contentPane.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_7_3_1 = new JLabel("New label");
		lblNewLabel_7_3_1.setBounds(857, 540, 45, 13);
		contentPane.add(lblNewLabel_7_3_1);
		
		JLabel lblNewLabel_8 = new JLabel("Междинна Цена");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8.setBounds(470, 186, 121, 20);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Междинна Цена");
		lblNewLabel_8_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_8_1.setBounds(470, 496, 121, 20);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel Suma = new JLabel("New label");
		Suma.setHorizontalAlignment(SwingConstants.CENTER);
		Suma.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		Suma.setBounds(470, 672, 148, 34);
		contentPane.add(Suma);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(942, 680, 115, 46);
		contentPane.add(btnNewButton);
		
		JButton btnNewOrder = new JButton("New Order");
		btnNewOrder.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewOrder.setBounds(106, 680, 115, 46);
		contentPane.add(btnNewOrder);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(277, 59, 40, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("+");
		btnNewButton_1_1.setBounds(493, 59, 40, 30);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("+");
		btnNewButton_1_2.setBounds(720, 59, 40, 30);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("+");
		btnNewButton_1_3.setBounds(942, 59, 40, 30);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("+");
		btnNewButton_1_4.setBounds(277, 366, 40, 30);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("+");
		btnNewButton_1_5.setBounds(493, 366, 40, 30);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("+");
		btnNewButton_1_6.setBounds(720, 366, 40, 30);
		contentPane.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("+");
		btnNewButton_1_7.setBounds(942, 366, 40, 30);
		contentPane.add(btnNewButton_1_7);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setBounds(277, 99, 40, 30);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("-");
		btnNewButton_2_1.setBounds(493, 99, 40, 30);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("-");
		btnNewButton_2_2.setBounds(720, 99, 40, 30);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("-");
		btnNewButton_2_3.setBounds(942, 99, 40, 30);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("-");
		btnNewButton_2_4.setBounds(277, 406, 40, 30);
		contentPane.add(btnNewButton_2_4);
		
		JButton btnNewButton_2_5 = new JButton("-");
		btnNewButton_2_5.setBounds(493, 406, 40, 30);
		contentPane.add(btnNewButton_2_5);
		
		JButton btnNewButton_2_6 = new JButton("-");
		btnNewButton_2_6.setBounds(720, 406, 40, 30);
		contentPane.add(btnNewButton_2_6);
		
		JButton btnNewButton_2_7 = new JButton("-");
		btnNewButton_2_7.setBounds(942, 406, 40, 30);
		contentPane.add(btnNewButton_2_7);
	}
}
