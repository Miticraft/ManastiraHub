package com.miticraft.DiplomnaRabota;
import java.util.*;
public class Gluposti_Na_koleleta {
	public static Scanner kb = new Scanner(System.in);
	public static void SearchP(Brokeri a[]) {
		System.out.println("Zadai Diapazon: ");
		double x = kb.nextDouble();
		double y = kb.nextDouble();
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			
		}
			if (flag == false) {
			System.out.println("Nqma nameren imot v tozi diapazon");
		}
	}
	public static void SearchO(Brokeri a[]) {
		
	}
	public static double Validate () {
		double n;
		do {
			System.out.println("Vuvedi Razmer");
			n = kb.nextDouble();
		} while (n<0);
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = (int) Validate();
		Brokeri a[] = new Brokeri [n];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Brokeri();
			a[i].razmer = (int) Validate();
			System.out.println("Vuvedi Ime");
			a[i].Name = kb.next();
			System.out.println("Vuvedi Adres");
			a[i].adres = kb.next();
			System.out.println("Vuvedi EGN");
			a[i].setEGN(kb.next());
			System.out.println("Vuvedi Telefon");
			a[i].setTel(kb.next());
			a[i].print();
		}
		
	}

}
