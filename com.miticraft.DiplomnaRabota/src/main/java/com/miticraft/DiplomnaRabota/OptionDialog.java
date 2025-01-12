package com.miticraft.DiplomnaRabota;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.datatransfer.SystemFlavorMap;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class OptionDialog extends JDialog {
	public OptionDialog() {
	}

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String temp;
		int a,b,c,Opt =0;
		do {
			temp = JOptionPane.showInputDialog(null, "Input a:");
			a = Integer.parseInt(temp);
			temp = JOptionPane.showInputDialog(null, "Input b:");
			b = Integer.parseInt(temp);
			temp = JOptionPane.showInputDialog(null, "Input c: (to e i radius)");
			c = Integer.parseInt(temp);
		} while (a<=0|| b <= 0|| c <= 0);
		double d = (double) (a+b+c)/3;
		JOptionPane.showMessageDialog(null, "Average: " + String.format("%.2f", d));
		double e = (double) a*b;
		JOptionPane.showMessageDialog(null, "Proizvedenie na a*b: " + String.format("%.2f", e));
		while(Opt!=4){
			temp = JOptionPane.showInputDialog(null, "Input Izbor na figrura: \n1 = Rectangle, \n2 = Triangle, \n3 = Circle, \n4 = Exit");
			Opt = Integer.parseInt(temp);
			switch (Opt) {
			case 1:
				JOptionPane.showMessageDialog(null, "Liceto na Pravougulnik: " + String.format("%.2f", ((double)a*b)) );
				break;
			case 2:
				
				double sum = Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
				JOptionPane.showMessageDialog(null, "Liceto na Triugulnik " + String.format("%.2f", (double) sum));
				break;
			case 3:
				double area = Math.PI*c*c;
				JOptionPane.showMessageDialog(null, "Liceto na Okrujnost:" + String.format("%.2f", area));
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "CHAOOO");
				break;
			default:
				break;
			}
		}
		System.exit(0);
	}


}
