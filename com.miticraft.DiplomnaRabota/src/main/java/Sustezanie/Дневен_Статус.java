package Sustezanie;

import java.util.Scanner;

public class Дневен_Статус {
	public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		long n, day = 0, light = 0;
		do {
			n = kb.nextInt();
		} while (n < 0 || n > 101);
		for (int i = 0; i < n; i++) {
			light = kb.nextLong();
			day = kb.nextLong();
			day -= 1;
			if ((light & 1 << day) == 0) {
				System.out.println("Off");
			} else {
				System.out.println("Operational");
			}
		}

	}

}
