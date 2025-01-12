package Sustezanie;

import java.util.Scanner;

public class Събития {
	public static Scanner Input = new Scanner(System.in);

	public static long Factoriel(int number) {
		long i = 1;
		long j = 1;
		while (j <= number) {
			i = i * j;
			j++;
		}
		return i;
	}

	// Formula Combinacii:      n!
	//					 	---------
	// 						 n!-(n-r)!
	public static long Combinacii(int n, int r) {
		long Combinacia;
		Combinacia = Factoriel(n) / (Factoriel(r) * (Factoriel(n - r)));
		return Combinacia;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input:
		int count = 0;
		do {
			count = Input.nextInt();
		} while (count < 0 || count >= 20000);
		// Променливите се пазят в Масиви за да може да бачка програмата с няколко outputa:
		int P[] = new int[count], R[] = new int[count], N[] = new int[count], M[] = new int[count];
		for (int i = 0; i < count; i++) {
			do {
				P[i] = Input.nextInt();
				R[i] = Input.nextInt();
			} while (P[i] < 0 || P[i] >= 15 && R[i] < 0 || R[i] >= 15);
			do {
				N[i] = Input.nextInt();
				M[i] = Input.nextInt();
			} while (P[i] < 0 || P[i] >= 1000 && R[i] < 0 || R[i] >= 1000);
		}
		// Output:
		for (int i = 0; i < count; i++) {
			long sum = Combinacii(N[i], P[i]) * Combinacii(M[i], R[i]);
			System.out.println(sum);
		}
	}

}
