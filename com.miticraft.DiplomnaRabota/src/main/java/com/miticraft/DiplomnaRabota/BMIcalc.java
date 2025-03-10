package com.miticraft.DiplomnaRabota;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class BMIcalc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMIcalc frame = new BMIcalc();
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
	public static int LowerBound(int age,String sex){
		int lower=0;
		if(age>=19 ||age<=24)
		if(sex.equals("Mъж"))
		lower=20;
		else lower=19;
		else if(sex.equals("Мъж"))
		lower=21;
		else lower=20;
		return lower;
		}
		public static int UpperBound(int age,String sex){
		int upper=0;
		if(age>=19 ||age<=24)
		if(sex.equals("Мъж"))
		upper=25;
		else upper=24;
		else if(sex.equals("Мъж"))
		upper=26;

		else upper=25;
		return upper;
		}
	public BMIcalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Мъж", "Жена", "Друго"}));
		comboBox.setBounds(554, 252, 90, 21);
		contentPane.add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setEnabled(true);
		textArea.setBounds(554, 341, 90, 16);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEnabled(true);
		textArea_1.setEditable(false);
		textArea_1.setBounds(554, 388, 90, 16);
		contentPane.add(textArea_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dimitar\\Pictures\\384550242_1047039396495966_2789431813634766051_n.jpg"));
		lblNewLabel.setBounds(43, -1, 577, 203);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Пол:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(499, 255, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Индекс:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(488, 341, 56, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Резултат:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(488, 388, 56, 13);
		contentPane.add(lblNewLabel_4);
		
		JSlider HeightSlider = new JSlider();
		HeightSlider.setValue(110);
		HeightSlider.setMaximum(220);
		HeightSlider.setMajorTickSpacing(10);
		HeightSlider.setBackground(new Color(0, 128, 128));
		HeightSlider.setForeground(new Color(255, 255, 255));
		HeightSlider.setPaintLabels(true);
		HeightSlider.setPaintTicks(true);
		HeightSlider.setSnapToTicks(true);
		HeightSlider.setBounds(10, 236, 433, 44);
		contentPane.add(HeightSlider);
		
		JSlider WeightSlider = new JSlider();
		WeightSlider.setValue(100);
		WeightSlider.setSnapToTicks(true);
		WeightSlider.setPaintTicks(true);
		WeightSlider.setPaintLabels(true);
		WeightSlider.setMaximum(200);
		WeightSlider.setMajorTickSpacing(20);
		WeightSlider.setForeground(Color.WHITE);
		WeightSlider.setBackground(new Color(255, 215, 0));
		WeightSlider.setBounds(10, 315, 433, 44);
		contentPane.add(WeightSlider);
		
		JSlider AgeSlider = new JSlider();
		AgeSlider.setMinimum(18);
		AgeSlider.setValue(68);
		AgeSlider.setSnapToTicks(true);
		AgeSlider.setPaintTicks(true);
		AgeSlider.setPaintLabels(true);
		AgeSlider.setMaximum(120);
		AgeSlider.setMajorTickSpacing(6);
		AgeSlider.setForeground(Color.WHITE);
		AgeSlider.setBackground(new Color(220, 20, 60));
		AgeSlider.setBounds(10, 391, 433, 44);
		contentPane.add(AgeSlider);
		
		JButton btnNewButton = new JButton("Пресметни");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double h=(int)HeightSlider.getValue();
				double w=(int)WeightSlider.getValue();
				int age=(int)AgeSlider.getValue();
				String sex=comboBox.getSelectedItem().toString();
				String result;
				if(sex.equals("")) {
					JOptionPane.showMessageDialog(null, "Избери пол");
				}else {
				int l=LowerBound(age,sex);
				int u=UpperBound(age,sex);
				double hh=h/100.0;
				double bmi=w/(hh*hh);
				if(bmi<l) result="под норма";
				else if(bmi<u) result="в норма";
				else result="над норма";
				textArea.setText(String.format("%.3f",bmi));
				textArea_1.setText(result);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(542, 294, 102, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Височина");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 213, 67, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Маса");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(10, 297, 67, 13);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Възраст");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_1_1.setBounds(10, 369, 67, 13);
		contentPane.add(lblNewLabel_5_1_1);
		
		JButton btnNewButton_1 = new JButton("Изчисти");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBounds(559, 416, 85, 21);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			BMIcalc ob = new BMIcalc();
			ob.setVisible(true);
			dispose();
			}
		});
		contentPane.add(btnNewButton_1);
	}
}
