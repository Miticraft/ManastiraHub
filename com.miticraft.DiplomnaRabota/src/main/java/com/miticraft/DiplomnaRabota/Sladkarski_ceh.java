package com.miticraft.DiplomnaRabota;
import java.util.*;
public class Sladkarski_ceh {
public static Scanner kb = new Scanner(System.in);
	public static double Validate() {
		double n = 0;
		do {
			System.out.println("Vuvedi chislo: ");
			n = kb.nextDouble();
		} while (n < 0);
		return n;
	}
	public static void Dostaveno (Artikul a[]) {
		System.out.println("Ime? ");
		String x = kb.next();
		for (int i = 0; i < a.length; i++) {
			int j = 0;
			if(i%2 == 1) {
				j = 1;
			}else {
				 j = 0;
			}
			if(a[i].Dostavchici[j].name.equals(x)) {
				for (int j2 = 0; j2 < a.length; j2++) {
					if(j2%2 == j) {
						a[j2].print();
				}
				}
			}
		}
	}
	public static void ArtikulSearch(Artikul a[]) {
		System.out.println("Artikul?");
		String x = kb.next();
		for (int i = 0; i < a.length; i++) {
			if (a[i].name.equalsIgnoreCase(x)) {
				a[i].print();
				int j = 0;
				if(i%2 == 1) {
					j = 1;
				}else {
					 j = 0;
				}
				a[i].Dostavchici[j].print();
			}
		}
	}
	public static void Sum(Artikul a[]) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].price*a[i].count;
		}
		System.out.println("Oborota za dnes e: " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = (int) Validate();
		Artikul[] Artikuli = new Artikul[n];
		for (int i = 0; i < Artikuli.length; i++) {
			Artikuli[i] = new Artikul();
			System.out.println("Vuvedi Adres: ");
			Artikuli[i].adres = kb.next();
			System.out.println("Vuvedi Broika: ");
			Artikuli[i].count = (int) Validate();
			System.out.println("Vuvedi Gramaj: ");
			Artikuli[i].Grams = Validate();
			System.out.println("Vuvedi ime na Artikul: ");
			Artikuli[i].name = kb.next();
			System.out.println("Vuvedi Cena: ");
			Artikuli[i].price = Validate();
			Artikuli[i].print();
			int j = 0;
			if(i%2 == 1) {
				j = 1;
			}else {
				 j = 0;
			}
			Artikuli[i].Dostavchici[j].print();
		}
		Dostaveno(Artikuli);
		ArtikulSearch(Artikuli);
		Sum(Artikuli);
	}

}
