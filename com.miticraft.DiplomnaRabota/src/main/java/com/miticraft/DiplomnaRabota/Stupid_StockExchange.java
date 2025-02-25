package com.miticraft.DiplomnaRabota;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;

public class Stupid_StockExchange extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private double Currency;
	private String Currency_Name;
	private double sum;
	private double modifier = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stupid_StockExchange frame = new Stupid_StockExchange();
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
	public Stupid_StockExchange() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dimitar\\Pictures\\Niki.png"));
		setTitle("Stock Exchane - Mitified");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 711);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 10, 228, 175);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Валутен Курс");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(20, 10, 167, 13);
		panel.add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "EURUSD", "GBPUSD", "USDJPY", "USDCHF", "EURCAD" }));
		comboBox.setBounds(20, 33, 167, 21);

		panel.add(comboBox);

		JLabel lblNewLabel_5 = new JLabel("Стойност:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(48, 93, 101, 13);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(20, 120, 181, 13);
		panel.add(lblNewLabel_6);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(10, 216, 228, 175);
		contentPane.add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("Сума за инвестиране");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(28, 10, 167, 13);
		panel_1.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(64, 49, 96, 19);
		panel_1.add(textField);
		textField.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBackground(Color.GRAY);
		panel_3.setBounds(318, 216, 228, 175);
		contentPane.add(panel_3);

		JLabel lblNewLabel_3 = new JLabel("Печалба");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(28, 10, 167, 13);
		panel_3.add(lblNewLabel_3);

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(53, 146, 129, 19);
		panel_3.add(textPane);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(38, 33, 157, 103);
		panel_3.add(lblNewLabel_7);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\Screenshot 2025-02-13 090820.png"));
		lblNewLabel_4.setBounds(10, 401, 536, 263);
		contentPane.add(lblNewLabel_4);

		JButton btnNewButton_1 = new JButton("Изход");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit?",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		btnNewButton_1.setBounds(32, 643, 85, 21);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Изчисти");

		btnNewButton_2.setBounds(431, 643, 85, 21);
		contentPane.add(btnNewButton_2);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = comboBox.getSelectedIndex();
				switch (x) {
				case 0:

					Currency = 1.0421;
					Currency_Name = "EURUSD";
					lblNewLabel_6.setText("EUR 1 = USD 1.042");
					break;
				case 1:

					Currency = 1.2493;
					Currency_Name = "GBPUSD";
					lblNewLabel_6.setText("GBP 1 = USD 1.249");
					break;
				case 2:
					Currency = 154.28;
					lblNewLabel_6.setText("USD 1 = JPY 154.28");
					Currency_Name = "USDJPY";
					break;
				case 3:
					Currency = 0.9089;
					lblNewLabel_6.setText("USD 1 = CHF 0.909");
					Currency_Name = "USDCHF";
					break;
				case 4:
					Currency = 1.4879;
					lblNewLabel_6.setText("EUR 1 = CAD 1.488");
					Currency_Name = "EURCAD";
					break;
				default:
					break;
				}
			}
		});

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(318, 10, 228, 175);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBackground(Color.GRAY);

		JLabel lblNewLabel_2 = new JLabel("Модификации");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(20, 10, 167, 13);
		panel_2.add(lblNewLabel_2);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("BUY");


		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(19, 50, 59, 21);
		panel_2.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("SELL");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(19, 77, 59, 21);
		panel_2.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("SCRIPT");

		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(19, 105, 59, 21);
		panel_2.add(rdbtnNewRadioButton_2);

		JCheckBox chckbxNewCheckBox = new JCheckBox("ChatGPT");
		chckbxNewCheckBox.setBounds(108, 50, 93, 21);
		chckbxNewCheckBox.setEnabled(false);
		panel_2.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("DeepSeek");
		chckbxNewCheckBox_1.setBounds(108, 71, 93, 21);
		chckbxNewCheckBox_1.setEnabled(false);
		panel_2.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Gemini");
		chckbxNewCheckBox_2.setBounds(108, 92, 93, 21);
		chckbxNewCheckBox_2.setEnabled(false);
		panel_2.add(chckbxNewCheckBox_2);

		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Bling");
		chckbxNewCheckBox_3.setBounds(108, 113, 93, 21);
		chckbxNewCheckBox_3.setEnabled(false);
		panel_2.add(chckbxNewCheckBox_3);

		JButton btnNewButton = new JButton("INVEST!!!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double kurs = Currency;
				try {
					if(rdbtnNewRadioButton_1.isSelected()||rdbtnNewRadioButton.isSelected() && !rdbtnNewRadioButton_2.isSelected()) {
						sum = Double.parseDouble(textField.getText());
						sum*= Math.abs(Math.random()*10);
						sum*=modifier;
						if(Math.abs(Math.random()*10) > 5) {
							sum*=+1;
						}else {
							sum*=-1;
						}
						textPane.setText(String.format("%.2f", sum) + ".лв");
						if(sum>0) {
							lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\Victory.png"));
						}else {
							lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\Defeat.jpg"));

						}
					}else if(rdbtnNewRadioButton_2.isSelected()) {
						sum = Double.parseDouble(textField.getText());
						sum*= Math.abs(Math.random()*10);
						sum*=modifier;
						if(Math.abs(Math.random()*10) > 5) {
							sum*=+1;
						}else {
							sum*=-1;
						}
						textPane.setText(String.format("%.2f", sum) + ".лв");
						if(sum>0) {
							lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\Victory.png"));
						}else {
							lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\Defeat.jpg"));

						}
					}else if(!rdbtnNewRadioButton_1.isSelected() &&!rdbtnNewRadioButton.isSelected() && !rdbtnNewRadioButton_2.isSelected()) {
						JOptionPane.showMessageDialog(null, "Ne si izbral modifikator");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Въвели сте грешни стойности!");
				}
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(49, 95, 118, 21);
		panel_1.add(btnNewButton);

		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_2.isSelected()) {
					chckbxNewCheckBox.setEnabled(true);
					chckbxNewCheckBox_1.setEnabled(true);
					chckbxNewCheckBox_2.setEnabled(true);
					chckbxNewCheckBox_3.setEnabled(true);
					if (chckbxNewCheckBox.isSelected()) {
						modifier += 0.7;
					}
					if (chckbxNewCheckBox_1.isSelected()) {
						modifier += 0.5;
					}
					if (chckbxNewCheckBox_2.isSelected()) {
						modifier -= 0.3;
					}
					if (chckbxNewCheckBox_3.isSelected()) {
						modifier -= 1.2;
					}
				}
			}
		});
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox.setEnabled(false);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				chckbxNewCheckBox_3.setEnabled(false);
			}
		});
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox.setEnabled(false);
				chckbxNewCheckBox_1.setEnabled(false);
				chckbxNewCheckBox_2.setEnabled(false);
				chckbxNewCheckBox_3.setEnabled(false);
			}
		});	
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Stupid_StockExchange obj = new Stupid_StockExchange();
				obj.dispose();
				obj.setVisible(true);			
			}
		});
	}
}
