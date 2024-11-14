package com.miticraft.DiplomnaRabota;

import java.util.Scanner;

public class Kamion {
public String Model;
public String Registraciq;
public String Marka;
public Shofior[] arr;
public int razmer;
public Scanner kb;
public void print() {
	System.out.println("Modela na kamiona e: "+Model);
	System.out.println("Registraciqta mu e: "+Registraciq);
	System.out.println("Marka mu e"+ Marka);
	for (int i = 0; i < arr.length; i++) {
		System.out.println();
		arr[i].print();
	}
}
public void Obekt() {
	for (int i = 0; i < arr.length; i++) {
		arr[i] = new Shofior();
		kb = new Scanner(System.in);
		System.out.println("Vuvedi Ime: ");
		arr[i].ime = kb.next();
		System.out.println("Vuvedi vuzrast: ");
		arr[i].age = kb.nextInt();
		do {
			System.out.println("Vuvedi zaplata: ");
			arr[i].zaplata = kb.nextDouble();
		}while(arr[i].zaplata <0);
	}
}
public Kamion(int n) {
	this.razmer = n;
	arr = new Shofior[razmer];
}
}
