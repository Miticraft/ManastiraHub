package com.miticraft.DiplomnaRabota;

import java.util.Scanner;

public class Snejnata_Durjava {
public static Scanner kb = new Scanner(System.in);
public static int Validate() {
	int n;
	do {
		System.out.println("Vuvedi chislo: ");
		n=kb.nextInt();
	} while (n<0);
	return n;
}
public static void Search(Kamion[] a) {
	System.out.println("Vuvedi Tursen Kamion: ");
	String x = kb.next();
	boolean flag = false;
	int index = 0;
	for (int i = 0; i < a.length; i++) { 
			if (a[i].Registraciq.equalsIgnoreCase(x)) {
				flag = true;
				index = i;
				
			}
	}
	if (flag == true) {
		System.out.println("Nameren e takuv Kamion: ");
		a[index].print();
	}
}
public static void SearchShofior(Kamion[] a) {
	System.out.println("Vuvedi Tursen Shofior: ");
	String x = kb.next();
	boolean flag = false;
	int indexi = 0;
	for (int i = 0; i < a.length; i++) { 
		for (int j = 0; j < a[i].razmer; j++) {
			if (a[i].arr[j].ime.equalsIgnoreCase(x)) {
				flag = true;
				indexi = i;
			}
		}
	}
	if (flag == true) {
		System.out.println("Nameren e takuv Kamion: ");
		a[indexi].print();
	}
}
public static void Max(Kamion a[]) {
	int max = 0;
	int indexj = 0;
	int indexi =0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].arr.length; j++) {
			if (a[i].arr[j].age > max) {
				max = a[i].arr[j].age;
				indexj = j;
				indexi = i;
			}
		}
	}
	System.out.println("Nai-vuzrasten shofior e: ");
	a[indexi].arr[indexj].print();
}
	public static void main(String[] args) {
		int n = Validate();
		Kamion arr1[] = new Kamion[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = new Kamion(Validate());
			arr1[i].Model = kb.next();
			arr1[i].Marka = kb.next();
			arr1[i].Registraciq = kb.next();
			arr1[i].Obekt();
			arr1[i].print();
		}
		Search(arr1);
		SearchShofior(arr1);
		Max(arr1);
	}
}
