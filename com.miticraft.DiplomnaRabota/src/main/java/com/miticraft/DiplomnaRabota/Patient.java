package com.miticraft.DiplomnaRabota;

import java.util.ArrayList;

public class Patient extends People {
	public ArrayList<String> Diagnozi = new ArrayList<String>();
	public ArrayList<String> Alergii = new ArrayList<String>();

	public void print() {
		print();
		if (Diagnozi.isEmpty() && Alergii.isEmpty()) {
			System.out.println("Pacienta nqma diagnoza, nito alergii");
		} else if (Diagnozi.isEmpty()) {
			System.out.println("Pacientut nqma diagnoza, no e alergichen ot: ");
			for (int i = 0; i < Alergii.size(); i++) {
				System.out.println(Alergii.get(i));
			}
		} else if (Alergii.isEmpty()) {
			System.out.println("Pacientut nqma diagnoza, no e alergichen ot: ");
			for (int i = 0; i < Diagnozi.size(); i++) {
				System.out.println(Diagnozi.get(i));
			}
		} else {
			System.out.println("Diagnozata na pacienta e: ");
		}
	}
}