package com.miticraft.DiplomnaRabota;

import java.util.Scanner;

public class Avtor {
public String name;
public String adres;
public int razmer;
public Scanner kba = new Scanner(System.in);
public Kniga[] knigi;
public void print() {
	System.out.println("Imeto na avtora: "+name);
	System.out.println("Adres na avtora: "+adres);
	System.out.println("Ima tezi knigi: ");
	for (int i = 0; i < razmer; i++) {
		knigi[i].print();
	}
}
public double Validate() {
	double a = 0;
	do {
		a = kba.nextDouble();
	} while (a<0);
	return a;
}
public void CreateBook() {
	for (int i = 0; i < knigi.length; i++) {
		knigi[i] = new Kniga();
		System.out.println("Vuvedi ime na kniga: ");
		knigi[i].name = kba.next();
		System.out.println("Vuvedi stranicite na kniga: ");
		knigi[i].size = (int)Validate();
		System.out.println("Vuvedi cena: ");
		knigi[i].price = Validate();
		System.out.println("Vuvedi tiraj: ");
		knigi[i].tiraj = (int) Validate();
	}
}
public Avtor(int razmer) {
	this.razmer = razmer;
	knigi = new Kniga[razmer];
}
}
