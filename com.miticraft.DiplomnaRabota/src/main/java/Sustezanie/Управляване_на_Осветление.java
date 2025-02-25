package Sustezanie;

import java.util.Scanner;

public class Управляване_на_Осветление {
	public static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = kb.nextInt();
		for(int i = 0; i<T; i++) {
			long N = kb.nextLong();
			int Q = kb.nextInt();
			for (int j = 0; j < Q; j++) {
				int P = kb.nextInt();
				N = N^1<<(P-1);
			}
			System.out.println(N);
		}
	}

}
