package Sustezanie;

import java.math.BigInteger;
import java.util.Scanner;

public class Противоположни_настроения {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(), x;
		for (int i = 0; i < n; i++) {
			BigInteger A = new BigInteger(kb.next());
			BigInteger B = new BigInteger(kb.next());
			x = A.xor(B).compareTo(BigInteger.ZERO);
			switch (x) {
			case -1:
				System.out.println("Opposite");
				break;
			case 0:
				System.out.println("Same");
				break;
			case 1:
				System.out.println("Same");
				break;
			default:
				break;
			}
		}

	}
}
