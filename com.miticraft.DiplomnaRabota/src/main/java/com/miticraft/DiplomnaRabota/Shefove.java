package com.miticraft.DiplomnaRabota;

public class Shefove extends People{
public String otdelenie;
public int Zaplata;
public void print() {
	super.print();
	System.out.println("Otdelenie: "+ otdelenie);
	System.out.println("Zaplatata e: "+ Zaplata);
}
}
