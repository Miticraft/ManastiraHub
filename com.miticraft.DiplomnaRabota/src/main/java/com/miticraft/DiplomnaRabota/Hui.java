package com.miticraft.DiplomnaRabota;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hui frame = new Hui();
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
	public Hui() {
		setTitle("Manhatan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("XA");
		lbl.setBounds(20, 53, 46, 14);
		contentPane.add(lbl);
		
		JLabel lbl1 = new JLabel("YB");
		lbl1.setBounds(20, 81, 46, 14);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("XB");
		lbl2.setBounds(20, 133, 46, 14);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("YB");
		lbl3.setBounds(20, 160, 46, 14);
		contentPane.add(lbl3);
		
		textField = new JTextField();
		textField.setBounds(51, 50, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(51, 78, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lbl4 = new JLabel("Raztoqnie s kola");
		lbl4.setBounds(10, 231, 86, 14);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("Raztoqnie s dron");
		lbl5.setBounds(10, 267, 86, 14);
		contentPane.add(lbl5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(51, 130, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(51, 157, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(96, 228, 177, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(96, 264, 177, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Az sum smotan");
		lblNewLabel.setBounds(151, 11, 150, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\Manhattan_distance.png"));
		lblNewLabel_1.setBounds(226, 53, 150, 150);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("Izchisli");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try{
			int XA = Integer.parseInt(textField.getText());
			int YA = Integer.parseInt(textField_1.getText());
			int XB = Integer.parseInt(textField_2.getText());
			int YB = Integer.parseInt(textField_3.getText());
			double sum =Math.sqrt((XA-XB)*(XA-XB)+(YA-YB)*(YA-YB));
			textField_5.setText(String.format("%.2f", sum));
			textField_4.setText(Double.toString(Math.abs(XA-XB)+Math.abs(YA-YB)));
			}catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Qj mi uq");
			}
			}
		});
		btn1.setBounds(10, 306, 89, 23);
		contentPane.add(btn1);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(149, 306, 89, 23);
		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
			}
		});
		contentPane.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(286, 306, 89, 23);
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(ABORT);
			}
		});
		contentPane.add(btnExit);
	}
}
