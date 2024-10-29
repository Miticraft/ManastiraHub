package com.miticraft.DiplomnaRabota;

public class Imoti {
public String Description;
public int kvadrati;
public String adress;
public double price;
public boolean SaleOrBuy;
public int razmer;
public String vupros() {
	String a;
	if (SaleOrBuy = true) {
		a = "Imota se kupuva";
	}else {
		a = "Imota se prodava";
	}
	return a;
}
public void printI() {
	System.out.println(Description);
	System.out.println(kvadrati);
	System.out.println(price);
	System.out.println(vupros());
	System.out.println();
}

}
