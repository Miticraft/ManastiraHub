package com.miticraft.DiplomnaRabota;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static int result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(85, 68, 82, 27);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(324, 68, 82, 27);
		contentPane.add(textArea_1);
		
		JLabel lblNewLabel = new JLabel("Variable A");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(96, 45, 64, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblVariableB = new JLabel("Variable B ");
		lblVariableB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVariableB.setBounds(324, 45, 76, 13);
		contentPane.add(lblVariableB);
				
		JLabel lblNewLabel_1 = new JLabel("Резултат:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(154, 272, 171, 44);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Събиране");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aa = textArea.getText();
				int a = Integer.parseInt(aa);
				String bb = textArea_1.getText();
				int b = Integer.parseInt(bb);
				lblNewLabel_1.setText("Резултат: "+(a+b));
			}
		});
		btnNewButton.setBounds(111, 156, 100, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Изваждане");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aa = textArea.getText();
				int a = Integer.parseInt(aa);
				String bb = textArea_1.getText();
				int b = Integer.parseInt(bb);
				lblNewLabel_1.setText("Резултат: "+(a-b));
			}
		});
		btnNewButton_1.setBounds(111, 197, 100, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Умножение");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aa = textArea.getText();
				int a = Integer.parseInt(aa);
				String bb = textArea_1.getText();
				int b = Integer.parseInt(bb);
				lblNewLabel_1.setText("Резултат: "+(a*b));
			}
		});
		btnNewButton_2.setBounds(269, 156, 111, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Деление");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aa = textArea.getText();
				int a = Integer.parseInt(aa);
				String bb = textArea_1.getText();
				int b = Integer.parseInt(bb);
				lblNewLabel_1.setText("Резултат: "+(a/b));
			}
		});
		btnNewButton_3.setBounds(269, 197, 111, 21);
		contentPane.add(btnNewButton_3);

	}
}
