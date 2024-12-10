package com.miticraft.DiplomnaRabota;

public class Point {
	public double Sistema(double a, double b) {
		double kvadrant;
		if (a == 0 || b == 0) {
			kvadrant = 0;
		} else if (a > 0 && b > 0) {
			kvadrant = 1;
		} else if (a < 0 && b < 0) {
			kvadrant = 3;
		} else if (a < 0 && b > 0) {
			kvadrant = 2;
		}else {
			kvadrant = 4;
		}
		System.out.println("x= "+a+ ", y= "+b+", kvadrata e: "+kvadrant);
		return kvadrant;
	}
}
