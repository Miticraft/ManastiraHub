package com.miticraft.DiplomnaRabota;

public class Box {
private double x,y,z;
private String type;
private String Buyer;
private boolean Bought;
private double price;
public void print() {
	System.out.println("Razmera e. X= "+ x +", y = "+y+", z = "+z);
	System.out.println("Sudurjanieto e: "+type);
	System.out.println("Kupuvacha e: "+Buyer);
	System.out.println("Cena: "+price);
	System.out.println("Kupeno li e: "+Bought);
}
public double getX() {
	return x;
}
public double getY() {
	return y;
}
public double getZ() {
	return z;
}
public String getBuyer() {
	return Buyer;
}
public double getPrice() {
	return price;
}
public String getType() {
	return type;
}
public boolean getBought() {
	return Bought;
}
public void setBought(boolean bought) {
	Bought = bought;
}
public void setBuyer(String buyer) {
	Buyer = buyer;
}
public void setPrice(double price) {
	this.price = price;
}
public void setType(String type) {
	this.type = type;
}
public void setX(double x) {
	this.x = x;
}
public void setY(double y) {
	this.y = y;
}
public void setZ(double z) {
	this.z = z;
}
public double obem() {
	return x*y*z;
}
}
