package com.miticraft.DiplomnaRabota;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class Kopiren_magazin extends JFrame {

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
					Kopiren_magazin frame = new Kopiren_magazin();
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
	public Kopiren_magazin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Razmer na Stranica", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(21, 174, 119, 55);
		contentPane.add(panel);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u04103");
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u04104");
		buttonGroup.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0426\u0432\u044F\u0442 \u043D\u0430 \u043F\u0440\u0438\u043D\u0442", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(21, 240, 119, 76);
		contentPane.add(panel_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("\u0427\u0435\u0440\u043D\u043E-\u0431\u044F\u043B\u043E");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		panel_1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\u0426\u0432\u0435\u0442\u043D\u043E");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u0421\u0442\u0440\u0430\u043D\u043D\u043E\u0441\u0442", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(268, 178, 119, 88);
		contentPane.add(panel_2);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("\u0415\u0434\u043D\u043E\u0441\u0442\u0440\u0430\u043D\u043D\u043E");
		buttonGroup_2.add(rdbtnNewRadioButton_5);
		panel_2.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("\u0414\u0432\u0443\u0441\u0442\u0440\u0430\u043D\u043D\u043E");
		buttonGroup_2.add(rdbtnNewRadioButton_4);
		panel_2.add(rdbtnNewRadioButton_4);
		
		JLabel lblNewLabel = new JLabel("\u0426\u0435\u043D\u0430:");
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
		lblNewLabel_2.setBounds(169, 130, 114, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0411\u0440\u043E\u0439 \u0441\u0442\u0440\u0430\u043D\u0438\u0446\u0438:");
		lblNewLabel_3.setBounds(73, 149, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 146, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(186, 49, 46, 14);
		contentPane.add(lblNewLabel_4);
	}
}
