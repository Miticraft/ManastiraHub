package com.miticraft.DiplomnaRabota;
import java.util.*;
public class Brokeri extends Imoti{
public Scanner kb = new Scanner (System.in);
public String Name;
public String adres;
private String EGN;
private String Telefon;
public ArrayList<Imoti> Arr = new ArrayList<Imoti>();
public String getEGN() {
	return EGN;
}
public void setEGN (String egn) {
	this.EGN = egn;
}
public String getTel() {
	return Telefon;
}
public void setTel(String Tel) {
	this.Telefon = Tel;
}
public void print() {
	System.out.println("Brokerska Informaciq");
	System.out.println(Name);
	System.out.println(adres);
	System.out.println(getEGN());
	System.out.println(getTel());
	System.out.println();
	System.out.println("Pritejava tezi imoti: ");
	for (int i = 0; i < Arr.size(); i++) {
		System.out.println("Broi "+ i);
		printI();
	}
}
public Brokeri() {
	for (int i = 0; i < razmer; i++) {
		Imoti a = new Imoti();
		Arr.add(a);
		System.out.println("Vuvedi Opisanie");
		Arr.get(i).Description = kb.next();
		System.out.println("Vuvedi Adres");
		Arr.set(i, adress = kb.next());
		
	}
	System.out.println("Vuvedi Kubatura");
	System.out.println("Vuvedi Cena");
	System.out.println("Vuvedi dali e za prodajba ili pokupka:  True == Kupuva, False == Prodava");
	printI();
	}
}
