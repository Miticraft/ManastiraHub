package com.miticraft.DiplomnaRabota;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Parsed;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class Trigulnik_Kalkulator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtR;
	private JTextField textField_4;
	private JTextField txtHa;
	private JTextField txtA_1;
	private JTextField txtHa_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trigulnik_Kalkulator frame = new Trigulnik_Kalkulator();
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
	public Trigulnik_Kalkulator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\Kvadrat.png"));
		lblNewLabel_1.setBounds(39, 111, 59, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\Triugulnik.png"));
		lblNewLabel.setBounds(16, 21, 82, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\Trapec.png"));
		lblNewLabel_2.setBounds(44, 173, 55, 57);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\Okrujnost.png"));
		lblNewLabel_3.setBounds(21, 252, 104, 89);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Изчисли");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnNewButton.setBounds(221, 40, 104, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Изчисли");

		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(221, 121, 104, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Изчисли");


		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(221, 191, 104, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Изчисли");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(221, 286, 104, 21);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setText("А");
		textField.setBounds(115, 41, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtA = new JTextField();
		txtA.setText("A");
		txtA.setColumns(10);
		txtA.setBounds(115, 122, 96, 19);
		contentPane.add(txtA);
		
		txtB = new JTextField();
		txtB.setText("B");
		txtB.setColumns(10);
		txtB.setBounds(115, 192, 96, 19);
		contentPane.add(txtB);
		
		txtR = new JTextField();
		txtR.setText("R");
		txtR.setColumns(10);
		txtR.setBounds(126, 287, 85, 19);
		contentPane.add(txtR);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(175, 341, 96, 19);
		contentPane.add(textField_4);
		
		JButton btnNewButton_4 = new JButton("Изчисти");

		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4.setBounds(40, 371, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Изход");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4_1.setBounds(307, 371, 85, 21);
		contentPane.add(btnNewButton_4_1);
		
		txtHa = new JTextField();
		txtHa.setText("Ha");
		txtHa.setColumns(10);
		txtHa.setBounds(115, 60, 96, 19);
		contentPane.add(txtHa);
		
		txtA_1 = new JTextField();
		txtA_1.setText("A");
		txtA_1.setColumns(10);
		txtA_1.setBounds(115, 173, 96, 19);
		contentPane.add(txtA_1);
		
		txtHa_1 = new JTextField();
		txtHa_1.setText("Ha");
		txtHa_1.setColumns(10);
		txtHa_1.setBounds(115, 211, 96, 19);
		contentPane.add(txtHa_1);
		
		JLabel lblNewLabel_4 = new JLabel("Rezultat");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(192, 318, 79, 13);
		contentPane.add(lblNewLabel_4);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				String ha = txtHa.getText();
				if(a.isEmpty() || ha.isEmpty()) {
					textField_4.setText("Imash Greshka");
				}else {
					double Sum = (Double.parseDouble(a) * Double.parseDouble(ha)) / 2;
					textField_4.setText(String.format("%.2f", Sum));
				}
			}
		});		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_4.setText("");
				txtA.setText("");
				txtA_1.setText("");
				txtB.setText("");
				txtHa.setText("");
				txtHa_1.setText("");
				txtR.setText("");
			}
		});		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtA.getText();
				if(a.isEmpty()) {
					textField_4.setText("Imash Greshka");
				}else {
					int sum = Integer.parseInt(a)*Integer.parseInt(a);
					String res = String.valueOf(sum);
					textField_4.setText(res);
				}
			}
		});		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtR.getText();
				if(a.isEmpty()) {
					textField_4.setText("Imash Greshka");
				}else {
					Double sum = Integer.parseInt(a)*Integer.parseInt(a)*Math.PI;
					textField_4.setText(String.format("%.2f", sum));
				}
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = txtA_1.getText();
				String b = txtB.getText();
				String ha = txtHa_1.getText();
				if(a.isEmpty() || ha.isEmpty()) {
					textField_4.setText("Imash Greshka");
				}else {
					double Sum = ((Double.parseDouble(a) + Double.parseDouble(b))*Double.parseDouble(ha)) / 2;
					textField_4.setText(String.format("%.2f", Sum));
				}
			}
		});	
	}
}
