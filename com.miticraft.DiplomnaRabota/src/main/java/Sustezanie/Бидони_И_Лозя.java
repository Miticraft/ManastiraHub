package Sustezanie;

import java.util.Scanner;

public class Бидони_И_Лозя {
	// Mnojestvenoto na loze e lozq.
	public static Scanner Input = new Scanner(System.in);

	public static int Bidoni(int a) {
		int num = a;
		int temp1 = (a / 3) * 2;
		int temp2 = (a / 2) * 1;
		int sum = temp1 + temp2;
		if (sum % 2 != 0) {
			sum -= 1;
		}
		num += (sum / 2);
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		do {
			count = Input.nextInt();
		} while (count < 0);
		int Lozq[] = new int[count];
		for (int i = 0; i < count; i++) {
			do {
				Lozq[i] = Input.nextInt();
			} while (Lozq[i] % 3 != 0 || Lozq[i] < 5 || Lozq[i] > 1000);
		}
		for (int i = 0; i < count; i++) {
			System.out.println(Bidoni(Lozq[i]));
		}
	}

}
