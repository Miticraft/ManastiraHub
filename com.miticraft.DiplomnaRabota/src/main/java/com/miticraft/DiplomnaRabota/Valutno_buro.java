package com.miticraft.DiplomnaRabota;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Valutno_buro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private double Currency;
	private String Currency_Name;
	private double Suma;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Valutno_buro frame = new Valutno_buro();
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
	public Valutno_buro() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(10, 10, 267, 163);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Избери вид валута за обмяна");
		lblNewLabel.setBounds(59, 10, 146, 13);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_3 = new JLabel("Валутен курс за едно:");
		lblNewLabel_3.setBounds(32, 93, 129, 13);
		panel.add(lblNewLabel_3);

		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lbl.setBounds(42, 123, 119, 13);
		panel.add(lbl);
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = comboBox.getSelectedIndex();
				switch (x) {
				case 0:
					lbl.setText("EUR 1 = BGN 1.954");
					Currency = 1.954;
					Currency_Name = "EUR";
					break;
				case 1:
					lbl.setText("USD 1 = BGN 1.795");
					Currency = 1.795;
					Currency_Name = "USD";
					break;
				case 2:
					lbl.setText("TRY 1 = BGN 0,053");
					Currency = 0.053;
					Currency_Name = "TRY";
					break;
				case 3:
					lbl.setText("RUB 1 = BGN 0,019");
					Currency = 0.053;
					Currency_Name = "RUB";
					break;
				default:
					break;
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Euro", "Dollar", "Turkish Lirs", "Rubbles" }));
		comboBox.setBounds(59, 44, 129, 21);
		panel.add(comboBox);	


		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(287, 10, 267, 163);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Въведи сумата която искаш:");
		lblNewLabel_1.setBounds(39, 10, 172, 13);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_3_1 = new JLabel("Левова равностойност:");
		lblNewLabel_3_1.setBounds(39, 95, 129, 13);
		panel_1.add(lblNewLabel_3_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(46, 49, 96, 19);
		panel_1.add(textField_1);

		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(39, 118, 103, 13);
		panel_1.add(lblNewLabel_10);

		JButton btnNewButton = new JButton("Изчисли");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Suma = Integer.parseInt(textField_1.getText());
				lblNewLabel_10.setText(String.format("%.2f", Suma*Currency));
			}
		});
		btnNewButton.setBounds(158, 118, 85, 21);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_9 = new JLabel("лв.");
		lblNewLabel_9.setBounds(92, 118, 45, 13);
		panel_1.add(lblNewLabel_9);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(10, 181, 267, 163);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Платена сума на каса");
		lblNewLabel_2.setBounds(72, 10, 112, 13);
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("Ресто:");
		lblNewLabel_4.setBounds(42, 85, 45, 13);
		panel_2.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(103, 85, 45, 13);
		panel_2.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("лв.");
		lblNewLabel_6.setBounds(174, 85, 45, 13);
		panel_2.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Приятен ден <3");
		lblNewLabel_7.setBounds(42, 119, 142, 13);
		panel_2.add(lblNewLabel_7);

		textField = new JTextField();
		textField.setBounds(72, 44, 96, 19);
		panel_2.add(textField);
		textField.setColumns(10);

		JButton btnNewButton_1 = new JButton("Плати");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int Plateno = Integer.parseInt(textField.getText());
					if(Plateno>Suma) {
						lblNewLabel_5.setText(String.format("%.2f", Plateno - Suma));
					}else {
						JOptionPane.showMessageDialog(null, "Недостатъчни пари са платени.");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Имаш грешка в зададената сума.");
				}
			}
		});
		btnNewButton_1.setBounds(156, 115, 85, 21);
		panel_2.add(btnNewButton_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(288, 179, 267, 163);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_8 = new JLabel("Икона");
		lblNewLabel_8.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\Screenshots\\Screenshot 2025-02-06 210624.png"));
		lblNewLabel_8.setBounds(10, 15, 140, 132);
		panel_3.add(lblNewLabel_8);

		JButton btnNewButton_2 = new JButton("Изчисти");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Valutno_buro obj = new Valutno_buro();
				obj.setVisible(true);
				dispose();

			}
		});
		btnNewButton_2.setBounds(158, 34, 85, 21);
		panel_3.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Изход");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit?", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		btnNewButton_3.setBounds(158, 96, 85, 21);
		panel_3.add(btnNewButton_3);
	}
}
