package com.miticraft.DiplomnaRabota;
import java.util.ArrayList;
import java.util.Scanner;
public class KoledenList {
	public static Scanner kb = new Scanner(System.in);
	public static double Validate() {
		double n;
		do {
			System.out.println("Vuvedi chislo: ");
			n = kb.nextDouble();
		} while (n<0);
		return n;
	}
	public static int Bought(ArrayList<Box> arr) {
		int count = 0;
		System.out.println("Nekupenite podaruci sa: ");
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getBought() == false ) {
				arr.get(i).print();
				count ++;
				System.out.println();
			}
		}
		return count;
	}
	public static int Search(ArrayList<Box> arr) {
		int index = 0;
		boolean flag = false;
		System.out.println("Zadai Tursen chovek: ");
		String x = kb.next();
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getBuyer().equalsIgnoreCase(x)) {
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
	public static double Max(ArrayList<Box> arr) {
		double max = 0;
		int index = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (max < arr.get(i).obem()) {
				max = arr.get(i).obem();
				index = i;
			}
		}
		return index;
	}
	public static double SumPrice(ArrayList<Box> arr) {
		double sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i).getPrice();
		}
		return sum;
	}
	public static void Menu() {
		System.out.println("1. Nekupeni");
		System.out.println("2. Search");
		System.out.println("3. Max");
		System.out.println("4. Suma");
		System.out.println("5. Exit");
		System.out.println("Vuvejdai: ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = (int) Validate();
		ArrayList<Box> arr = new ArrayList<Box>();
		for (int i = 0; i < n; i++) {
			Box ob = new Box();
			System.out.println("Vuvedi Razmerite X,Y,Z");
			ob.setX(Validate());
			ob.setY(Validate());
			ob.setZ(Validate());
			System.out.println("Vuvedi Tip na podaruka");
			ob.setType(kb.next());
			System.out.println("Vuvedi Kupuvach");
			ob.setBuyer(kb.next());
			System.out.println("Vuvedi Cena");
			ob.setPrice(kb.nextDouble());
			System.out.println("Vuvedi Zakupeno li e");
			ob.setBought(kb.nextBoolean());
			arr.add(ob);
		}
		int c = 0;
		do {
			Menu();
			c = kb.nextInt();
			switch (c) {
			case 1:
				System.out.println("Broq na nekupenite podaruci e: "+ Bought(arr));
				break;
			case 2:
				if (arr.get(Search(arr)) != null) {
					System.out.println("Nameren e takuv chovek:");
					arr.get(Search(arr)).print();
				}
				System.out.println();
				break;
			case 3:
				System.out.println("Nai-golemiq podaruk e: ");
				arr.get((int)Max(arr)).print();
				break;
			case 4:
				double sum = SumPrice(arr);
				System.out.println("Sumata e: "+sum);
				System.out.println();
				break;
			case 5:
				System.out.println("Bye Bye");
			default:
				break;
			}
		} while (c!=5);
	}

}
