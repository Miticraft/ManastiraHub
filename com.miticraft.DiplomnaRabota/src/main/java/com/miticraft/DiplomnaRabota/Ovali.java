package com.miticraft.DiplomnaRabota;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ovali extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField txt1;
	private static JTextField txt2;
	private static Canvas canvas;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ovali frame = new Ovali();
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
	public static void Draw() {
		try {
		Graphics g=canvas.getGraphics();
		int w=canvas.getWidth();
		int h=canvas.getHeight();
		int n1=Integer.parseInt(txt1.getText());
		int n2=Integer.parseInt(txt2.getText());
		double x=0;
		double y=0;
		double dx=(double)w-x;
		double dy=(double)h-y;
		int r=10,gg=210,b=10;
		for(int i=0;i<n1;i++){
		Color c1 = new Color(r,gg,b);
		g.setColor(c1);
		g.fillOval((int)x, (int)y, (int)dx,(int)dy);
		x+=n2;
		y+=n2;
		dx-=2*n2;
		dy-=2*n2;
		r+=10;
		gg-=10;
		b+=10;
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public Ovali() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		canvas = new Canvas();
		canvas.setBounds(282, 10, 454, 453);
		contentPane.add(canvas);
		
		JLabel lblNewLabel = new JLabel("Брой:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 35, 94, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Отстояние:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 77, 94, 20);
		contentPane.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setBounds(124, 38, 96, 19);
		contentPane.add(txt1);	
		
		txt2 = new JTextField();
		txt2.setBounds(124, 80, 96, 19);
		contentPane.add(txt2);
		
		btnNewButton = new JButton("Draw");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Draw();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Imash greshka.");
					Ovali obj = new Ovali();
					obj.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(90, 210, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ovali obj = new Ovali();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(90, 241, 85, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit?",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		btnNewButton_2.setBounds(90, 272, 85, 21);
		contentPane.add(btnNewButton_2);
	}
}
