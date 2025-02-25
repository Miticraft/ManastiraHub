package com.miticraft.DiplomnaRabota;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Countries extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Countries frame = new Countries();
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
	public Countries() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();

		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "България", "Австрия", "Русия", "Унгария", "Германия", "Естония", "Латвия", "Нидерландия"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(74, 203, 131, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Избери държава");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(74, 175, 131, 21);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(286, 95, 331, 62);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(286, 156, 331, 62);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(286, 217, 331, 62);
		contentPane.add(panel_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(369, 315, 171, 19);
		contentPane.add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("Столица");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(389, 292, 137, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Флаговете и столиците на държави");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(102, 10, 424, 21);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("CLEAR");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Countries ob = new Countries();
				ob.dispose();
				ob.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 357, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit?",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(542, 357, 85, 21);
		contentPane.add(btnNewButton_1);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sel = comboBox.getSelectedIndex();
				switch (sel) {
				case 0:
					panel.setBackground(null);
					panel_1.setBackground(null);
					panel_2.setBackground(null);
					textPane.setText("");
					break;
				case 1:
					panel.setBackground(Color.WHITE);
					panel_1.setBackground(Color.GREEN);
					panel_2.setBackground(Color.RED);
					textPane.setText("София");
					break;
				case 2:
					panel.setBackground(Color.RED);
					panel_1.setBackground(Color.WHITE);
					panel_2.setBackground(Color.RED);
					textPane.setText("Виена");
					break;
				case 3:
					panel.setBackground(Color.WHITE);
					panel_1.setBackground(Color.BLUE);
					panel_2.setBackground(Color.RED);
					textPane.setText("Москва");
					break;
				case 4:
					panel.setBackground(Color.RED);
					panel_1.setBackground(Color.WHITE);
					panel_2.setBackground(Color.GREEN);
					textPane.setText("Букурещ");
					break;
				case 5:
					panel.setBackground(Color.BLACK);
					panel_1.setBackground(Color.YELLOW);
					panel_2.setBackground(Color.RED);
					textPane.setText("Берлин");
					break;
				case 6:
					panel.setBackground(Color.BLUE);
					panel_1.setBackground(Color.BLACK);
					panel_2.setBackground(Color.WHITE);
					textPane.setText("Талин");
					break;
				case 7:
					panel.setBackground(Color.RED);
					panel_1.setBackground(Color.WHITE);
					panel_2.setBackground(Color.RED);
					textPane.setText("Рига");
					break;
				case 8:
					panel.setBackground(Color.RED);
					panel_1.setBackground(Color.WHITE);
					panel_2.setBackground(Color.BLUE);
					textPane.setText("Амстердам");
					break;
				default:
					break;
				}
			}
		});
	}
}
