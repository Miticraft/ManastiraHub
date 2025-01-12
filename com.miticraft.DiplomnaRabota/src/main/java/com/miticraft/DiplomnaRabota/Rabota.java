package com.miticraft.DiplomnaRabota;

import java.util.ArrayList;
import java.util.Scanner;

public class Rabota {
	public static Scanner kb = new Scanner(System.in);
	public static double Validate() {
		double n;
		do {
			System.out.println("Vuvedi chislo: ");
			n = kb.nextDouble();
		} while (n<0);
		return n;
	}
	public static void SearchSpecialty(ArrayList<Rabotnik> arr) {
		int index = 0;
		boolean flag = false;
		System.out.println("Zadai Tursena specialnost: ");
		String x = kb.next();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).Specialty.equalsIgnoreCase(x)) {
				flag = true;
				index = i;
			}
		}
		if (flag == false) {
			System.out.println("Nema takuv chovechec");
		}else {
			arr.get(index).print();
		}
	}
	public static int Max (ArrayList<Rabotnik> arr, ArrayList<Shefove> arr2) {
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum+=arr.get(i).ZaplataPerHour*arr.get(i).MonthlyWorkTime();
		}
		for (int i = 0; i < arr2.size(); i++) {
			sum+=arr2.get(i).Zaplata;
		}
		return sum;
	}
	public static void SearchShef(ArrayList<Shefove> arr) {
		int index = 0;
		boolean flag = false;
		System.out.println("Zadai Turseno Otdelenie: ");
		String x = kb.next();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).otdelenie.equalsIgnoreCase(x)) {
				flag = true;
				index = i;
			}
		}
		if (flag == false) {
			System.out.println("Nema takuv chovechec");
		}else {
			arr.get(index).print();
		}
	}
	public static void Age(ArrayList<Rabotnik> arr) {
		int max = 0;
		int index = 0;
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i).age>max) {
				max = arr.get(i).age;
				index = i;
			}
		}
		System.out.println("Nai-stariqt rabotnik e: ");
		arr.get(index).print();
	}
	public static void Search(ArrayList<Rabotnik> arr, ArrayList<Shefove> arr2) {
		int index = 0;
		boolean flag = false;
		System.out.println("Zadai Tursen Chovek: ");
		String x = kb.next();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).name.equalsIgnoreCase(x)) {
				flag = true;
				index = i;
				arr.get(i).print();
			}
		}
		for (int i = 0; i < arr2.size(); i++) {
			if (arr2.get(i).name.equalsIgnoreCase(x)) {
				flag = true;
				index = i;
				arr2.get(i).print();
			}
		}
		if (flag == false) {
			System.out.println("Nema takuv chovechec");
		}
	}
	public static void Menu() {
		System.out.println("1. Rabotnik po specialnost");
		System.out.println("2. Mesechna zaplata na vsichki");
		System.out.println("3. Shef na turseno otdelenie");
		System.out.println("4. Nai-vurzasten");
		System.out.println("5. Tursim po ime");
		System.out.println("6. Exit");
		System.out.println("Vuvejdai: ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rabotnik> Rabotnici = new ArrayList<Rabotnik>();
		ArrayList<Shefove> Shefove = new ArrayList<Shefove>();
		System.out.println("Vuvedi razmer na rabotnicite: ");
		int size1 = (int) Validate();
		System.out.println("Vuvedi razmer na Shefovete: ");
		int size2 = (int) Validate();
		System.out.println("Rabotnicite: ");
		for (int i = 0; i < size1; i++) {
			Rabotnik ob = new Rabotnik();
			System.out.println("Vuvedi Ime: ");
			ob.name = kb.next();
			System.out.println("Vuvedi Vuzrast: ");
			ob.age = (int) Validate();
			System.out.println("Vuvedi Adres: ");
			ob.adres = kb.next();
			System.out.println("Vuvedi Specialnost: ");
			ob.Specialty = kb.next();
			System.out.println("Vuvedi Zaplata na chas: ");
			ob.ZaplataPerHour = (int) Validate();
			System.out.println("Vuvedi Rabotni Chasove na den: ");
			ob.DailyWorkTime = (int) Validate();
			ob.print();
			Rabotnici.add(ob);
		}
		System.out.println();
		System.out.println("Shefovete: ");
		for (int i = 0; i < size2; i++) {
			Shefove ob = new Shefove();
			System.out.println("Vuvedi Ime: ");
			ob.name = kb.next();
			System.out.println("Vuvedi Vuzrast: ");
			ob.age = (int) Validate();
			System.out.println("Vuvedi Adres: ");
			ob.adres = kb.next();
			System.out.println("Vuvedi Otdelenie: ");
			ob.otdelenie = kb.next();
			System.out.println("Vuvedi Mesechna Zaplata");
			ob.Zaplata = (int) Validate();
			Shefove.add(ob);
		}
		int c = 0;
		do {
			Menu();
			c = kb.nextInt();
			switch (c) {
			case 1:
				SearchSpecialty(Rabotnici);
				System.out.println();
				break;
			case 2:
				System.out.println(Max(Rabotnici, Shefove));
				break;
			case 3:
				SearchShef(Shefove);
				System.out.println();
				break;
			case 4:
				Age(Rabotnici);
				System.out.println();
				break;
			case 5:
				Search(Rabotnici, Shefove);
				System.out.println();
				break;
			case 6: 
				System.out.println("Bye bye");
			default:
				break;
			}
		} while (c!=6);
	}

}
