package com.miticraft.DiplomnaRabota;

public class Dostavchik {
public String name;
public String adres;
public String magazin;
public Dostavchik (String Ime,String Adress,String Magazina) {
	this.name = Ime;
	this.adres = Adress;
	this.magazin = Magazina;
}
public void print() {
	System.out.println("Imeto na dostavchika e: "+ name);
	System.out.println("Adresa na dostavkata e: "+ adres);
	System.out.println("Magazina e: "+ magazin);
	System.out.println();
}
}
