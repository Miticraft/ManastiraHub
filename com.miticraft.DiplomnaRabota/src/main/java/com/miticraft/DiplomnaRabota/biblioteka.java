package com.miticraft.DiplomnaRabota;
import java.util.*;
public class biblioteka {
public static Scanner kb = new Scanner(System.in);
public static double Validate() {
	double a=0;
	do {
		System.out.println("Validirai int: ");
		a = kb.nextDouble();
	} while (a<0);
	return a;
}
public static void Search(Avtor[] a) {
	System.out.println("Vuvedi Tursena Kniga: ");
	String x = kb.next();
	boolean flag = false;
	int indexj = 0;
	int indexi = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].knigi.length; j++) {
			if (a[i].knigi[j].name.equals(x)) {
				flag = true;
				indexj = j;
				indexi = i;
				
			}
		}
	}
	if (flag == true) {
		System.out.println("Namerena e takava kniga: ");
		a[indexi].knigi[indexj].print();
	}
}
public static void Tiraj(Avtor a[]) {
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].knigi.length; j++) {
			if (a[i].knigi[j].tiraj > 100) {
				a[i].knigi[j].print();
			}
		}
	}
}
public static void Max(Avtor a[]) {
	int max = 0;
	int indexj = 0;
	int indexi =0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].knigi.length; j++) {
			if (a[i].knigi[j].size > max) {
				max = a[i].knigi[j].size;
				indexj = j;
				indexi = i;
			}
		}
	}
	a[indexi].knigi[indexj].print();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =(int) Validate();
		Avtor[] Avtori = new Avtor[n];
		for (int i = 0; i < Avtori.length; i++) {
			Avtori[i] = new Avtor((int) Validate());
			System.out.println("Vuvedi ime na avtor: ");
			Avtori[i].name = kb.next();
			System.out.println("Vuvedi adres na avtor: ");
			Avtori[i].adres = kb.next();
			Avtori[i].CreateBook();
			Avtori[i].print();
		}
		Search(Avtori);
		Tiraj(Avtori);
		Max(Avtori);
	}

}
