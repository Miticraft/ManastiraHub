package com.miticraft.DiplomnaRabota;
import java.util.*;
public class PutkaNaBK {
	public static Scanner kb = new Scanner(System.in);
	public static boolean Safe(char a[], char b) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				return false;
			}
		}
		return true;
	}
	public static char Chislo () {
		int b = (int) (Math.random()*10);	
		char a = (char) (b+'0');
		return a;
	}
public PutkaNaBK() {
	int n = 5;
	int count =0;
	char lol[] = new char[5];
	do {
		char a = Chislo();
		if (Safe(lol, a)) {
			lol[count] = a;
			count++;
		}
	} while (count != 5);
	//Poznavane
	String Num = new String(lol);
//	System.out.println(Num);
	n = 5;
	do {
		int bikove = 0;
		int kravi = 0;
		String x;
		boolean flag;
		do {
			x = kb.next();
			flag = false;
			for (int i = 0; i < x.length(); i++) {
				for (int j = 1; j < x.length(); j++) {
					if (x.charAt(i)==x.charAt(j)&&j!=i) {
						flag = true;
					}
				}
			}
			if (flag == true) {
				System.out.println("Probvai pak");
			}
		} while (flag == true);
		for (int i = 0; i < 5; i++) {
			if (x.charAt(i) == Num.charAt(i)) {
				bikove+=1;
			}
		}
		for (int i = 0; i < lol.length; i++) {
			for (int j = 1; j < lol.length; j++) {
				if (x.charAt(i)==Num.charAt(j)) {
					kravi+=1;
				}
			}
		}
		System.out.println("Bikove: "+bikove);
		System.out.println("Kravi: "+kravi);
		if (bikove == 5) {
			System.out.println("Bravo");
			break;
		}
	} while (n!=0);
}
}
