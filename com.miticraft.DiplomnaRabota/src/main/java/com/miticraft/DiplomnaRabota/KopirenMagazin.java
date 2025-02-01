package com.miticraft.DiplomnaRabota;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class KopirenMagazin extends JFrame {
	
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KopirenMagazin frame = new KopirenMagazin();
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
	public KopirenMagazin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 389);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Razmer na Stranica", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 128)));
		panel.setBounds(21, 174, 119, 55);
		contentPane.add(panel);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u04103");
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u04104");
		buttonGroup.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0426\u0432\u044F\u0442 \u043D\u0430 \u043F\u0440\u0438\u043D\u0442", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 128)));
		panel_1.setBounds(21, 240, 119, 76);
		contentPane.add(panel_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("\u0427\u0435\u0440\u043D\u043E-\u0431\u044F\u043B\u043E");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		panel_1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\u0426\u0432\u0435\u0442\u043D\u043E");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0421\u0442\u0440\u0430\u043D\u043D\u043E\u0441\u0442", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 128)));
		panel_2.setBounds(268, 178, 119, 88);
		contentPane.add(panel_2);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("\u0415\u0434\u043D\u043E\u0441\u0442\u0440\u0430\u043D\u043D\u043E");
		buttonGroup_2.add(rdbtnNewRadioButton_5);
		panel_2.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("\u0414\u0432\u0443\u0441\u0442\u0440\u0430\u043D\u043D\u043E");
		buttonGroup_2.add(rdbtnNewRadioButton_4);
		panel_2.add(rdbtnNewRadioButton_4);
		
		JLabel lblNewLabel = new JLabel("\u0426\u0435\u043D\u0430:");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(227, 287, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(277, 284, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u043B\u0432.");
		lblNewLabel_1.setBounds(363, 287, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0414\u0430\u043D\u043D\u0438 \u0437\u0430 \u043F\u043E\u0440\u044A\u0447\u043A\u0430\u0442\u0430:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setBounds(141, 130, 164, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0411\u0440\u043E\u0439 \u0441\u0442\u0440\u0430\u043D\u0438\u0446\u0438:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setBounds(21, 149, 138, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 146, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\384550242_1047039396495966_2789431813634766051_n.jpg"));
		lblNewLabel_4.setBounds(0, -48, 436, 352);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Изчисли");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final double kopie = 0.10;
				double price = 0;
				int a = 0;
				try {
					a = Integer.parseInt(textField_1.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Bratme ne moesh da pishesh.");
				}
				price += kopie*a;
				if(rdbtnNewRadioButton_1.isSelected()) {
					price*=5;
				}else if(rdbtnNewRadioButton.isSelected()){
					price*=4;
				}
				if(rdbtnNewRadioButton_3.isSelected()) {
					price*=10;
				}else if(rdbtnNewRadioButton_2.isSelected()){
					price*=8;
					JOptionPane.showConfirmDialog(null, "Brat shte struva mnogo siguren li si che iskash da produljish?");
				}
				if(rdbtnNewRadioButton_5.isSelected()) {
					price*=1;
				}else if(rdbtnNewRadioButton_4.isSelected()){
					price*=2;
				}
				textField.setText(String.format("%.2f", price));
			}
		});
		btnNewButton.setBounds(42, 326, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Изчисти");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\384550242_1047039396495966_2789431813634766052_n.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				buttonGroup.clearSelection();
				buttonGroup_1.clearSelection();
				buttonGroup_2.clearSelection();
			}
		});
		btnNewButton_1.setBounds(63, 326, 175, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Изход");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnNewButton_2.setBounds(277, 326, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\384550242_1047039396495966_2789431813634766052_n.jpg"));
		lblNewLabel_5.setBounds(0, 256, 436, 178);
		contentPane.add(lblNewLabel_5);
	}
}
