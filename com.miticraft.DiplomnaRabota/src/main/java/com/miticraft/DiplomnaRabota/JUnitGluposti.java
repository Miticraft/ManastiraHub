package com.miticraft.DiplomnaRabota;
import java.util.Scanner;
public class JUnitGluposti {
public static Scanner kb = new Scanner(System.in);
public static int[] Vuvejdane(int n) {
	int a[] = new int[n];
	for (int i = 0; i < a.length; i++) {
		System.out.println("Vuvedi Stoinost");
		a[i] = kb.nextInt();
	}
	return a;
}
public static int Broi(int a[]) {
	int count = 0;
	for (int i = 0; i < a.length; i++) {
		if (a[i] < 0) {
			count++;
		}
	}
	System.out.println("Broq otricatelni chisla e: "+ count);
	return count;
}
public static int Sum(int a[]) {
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
		if (a[i]>0) {
			sum+=a[i];
		}
	}
	System.out.println("Sumata e: "+sum);
	return sum;
}
public static int Max(int a[]) {
	int max = a[0];
	int index = 0;
	for (int i = 0; i < a.length; i++) {
		if (a[i]>max) {
			max = a[i];
			index = i;
		}
	}
	System.out.println("Maxa e: "+ max);
	return index+1;
}
public static int BroiChetni(int a[]) {
	int count = 0;
	for (int i = 0; i < a.length; i++) {
		if (a[i]%2 == 0) {
			count++;
		}
	}
	System.out.println("Broq Chetni chisla e: "+ count);
	return count;
}
public static int Proiz(int a[]) {
	int sum = 1;
	for (int i = 0; i < a.length; i++) {
		if (a[i]>0) {
			sum*=a[i];
		}
	}
	System.out.println("Prozivedenieto e: "+sum);
	return sum;
}
public static int Min(int a[]) {
	int min = a[0];
	int index = 0;
	for (int i = 0; i < a.length; i++) {
		if (a[i]<min) {
			min = a[i];
			index = i;
		}
	}
	System.out.println("Mina e: "+ min);
	return index+1;
}
}
