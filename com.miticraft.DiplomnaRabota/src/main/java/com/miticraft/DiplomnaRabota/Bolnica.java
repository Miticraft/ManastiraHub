package com.miticraft.DiplomnaRabota;
import java.util.ArrayList;
import java.util.Scanner;
public class Bolnica {
	public static Scanner kb = new Scanner (System.in);
	public static void Menu() {
		System.out.println("1. Specialnost Search");
		System.out.println("2. Patient Search");
		System.out.println("3. Spravka");
		System.out.println("4. Suma");
		System.out.println("5. Exit");
		System.out.println("Vuvejdai: ");
	}
	public static double Validate() {
		double n;
		do {
			System.out.println("Vuvedi chislo: ");
			n = kb.nextDouble();
		} while (n<0);
		return n;
	}
	public static int Search(ArrayList<Patient> arr,String x) {
		int index = 0;
		boolean flag = false;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).name.equalsIgnoreCase(x)) {
				flag = true;
				index = i;
			}
		}
		if (flag == false) {
			System.out.println("Nema takuv chovechec");
			return (Integer) null;
		}
		return index;
	}
	public static int SearchSpecialnost(ArrayList<Doctors> arr,String x) {
		int index = 0;
		boolean flag = false;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).specialnost.equalsIgnoreCase(x)) {
				flag = true;
				index = i;
			}
		}
		if (flag == false) {
			System.out.println("Nema takuva specialnost");
			return (Integer) null;
		}
		return index;
	}
	public static int Max(ArrayList<Doctors> arr) {
		double max = 0;
		int index = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (max < arr.get(i).pay) {
				max = arr.get(i).pay;
				index = i;
			}
		}
		return index;
	}
	public static void SearchDiagnoza(ArrayList<Patient> arr,String x) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).Diagnozi.size(); j++) {
				if (arr.get(j).Diagnozi.get(i).equalsIgnoreCase(x)) {
					arr.get(i).print();
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vuvedi razmer na pacientite");
		int n = (int) Validate();
		
	}

}
