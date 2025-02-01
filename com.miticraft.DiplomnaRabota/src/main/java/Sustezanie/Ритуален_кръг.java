package Sustezanie;

import java.util.Scanner;

public class Ритуален_кръг {
	public static Scanner kb = new Scanner(System.in);
	public static long Factoriel(int number) {
		long i = 1;
		long j = 1;
		while (j <= number) {
			i = i * j;
			j++;
		}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,priqteli = 0;
		do {
			n = kb.nextInt();
		} while (n<0||n>20001);
		for (int i = 0; i < n; i++) {
			do {
				priqteli = kb.nextInt();
			} while (priqteli<0||priqteli> 1000001);
			System.out.println(Factoriel(priqteli-1));
		}
	}

}
