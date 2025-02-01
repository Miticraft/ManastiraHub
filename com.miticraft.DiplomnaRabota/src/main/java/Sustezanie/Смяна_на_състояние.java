package Sustezanie;

import java.util.Scanner;

public class Смяна_на_състояние {
	public static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n, x = 0, bit = 0;
		do {
			n = kb.nextInt();
		} while (n < 0 || n > 101);
		for (int i = 0; i < n; i++) {
			do {
				x = kb.nextLong();
			} while (x<=0|| x>=1000000000);
			do {
				bit = kb.nextLong();
			} while (bit<0||bit>3);
			System.out.println(x^1<<bit);
		}
		
	}

}
