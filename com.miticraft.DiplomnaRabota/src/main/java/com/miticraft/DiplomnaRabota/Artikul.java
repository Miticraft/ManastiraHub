package com.miticraft.DiplomnaRabota;

public class Artikul {
public String name;
public String adres;
public double Grams;
public double price;
public int count;
public Dostavchik[] Dostavchici = new Dostavchik[2];
public Artikul() {
		Dostavchici[0] = new Dostavchik("PepiR-u", "Nadejda", "Malina");
		Dostavchici[1] = new Dostavchik("Aleks", "Mladost", "Malina");
}
public void print() {
	System.out.println("Imeto na Artikuli e: " + name);
	System.out.println("Adresa e: " + adres);
	System.out.println("Gramaja e: " + Grams);
	System.out.println("Cenata e " + price);
	System.out.println("Broikata e: " + count);
	System.out.println();
}
}
