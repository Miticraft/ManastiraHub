package com.miticraft.DiplomnaRabota;

public class Kniga {
public String name;
public int size;
public double price;
public int tiraj;
public void print() {
	System.out.println("   Ime:"+name);
	System.out.println("   Razmer:"+size);
	System.out.println("   Cena:"+price);
	System.out.println("   Tiraj:"+tiraj);
	System.out.println();
}
}
