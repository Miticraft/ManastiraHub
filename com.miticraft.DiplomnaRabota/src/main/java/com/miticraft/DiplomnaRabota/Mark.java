package com.miticraft.DiplomnaRabota;

public class Mark {
	public int markMet(int n) {
		int mark;
		if(n<0||n>100) 
			mark = 0;
		else
		if (n <= 100 && n >= 92)
			mark = 6;
		else if (n >= 82)
			mark = 5;
		else if (n >= 65)
			mark = 4;
		else if (n >= 50)
			mark = 3;
		else if (n >=0)
			mark = 2;
		else
			mark = 0;
		System.out.println("точки=" + n);
		System.out.println("оценка=" + mark);
		return mark;
	}
	public int markMake(double n, double max) {
		double result =(n/max)*100;
		System.out.println(result);
		return markMet((int)result);
	}
	public static void main(String args[]) {
		Mark ob = new Mark();
		System.out.println(ob.markMake(30, 40));
		}
}
