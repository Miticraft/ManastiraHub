package com.miticraft.DiplomnaRabota;

public class Rabotnik extends People{
public String Specialty;
public int ZaplataPerHour;
public int DailyWorkTime;
public int MonthlyWorkTime() {
	return DailyWorkTime*30;
}
public void print() {
	super.print();
	System.out.println("Specialnost: "+Specialty);
	System.out.println("Zaplata za chas e: "+ ZaplataPerHour);
	System.out.println("Dnevno rabotno vreme: "+DailyWorkTime);
	System.out.println("Mesechno rabotno vreme: "+ MonthlyWorkTime());
}
}
