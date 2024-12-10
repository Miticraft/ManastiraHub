package com.miticraft.DiplomnaRabota;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KoledenTest {
	static Scanner kb = new Scanner(System.in);
	static ArrayList<Box> arr;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 	arr = new ArrayList<Box>();
		for (int i = 0; i < 2; i++) {
			Box ob = new Box();
			System.out.println("Vuvedi Razmerite X,Y,Z");
			ob.setX(kb.nextDouble());
			ob.setY(kb.nextDouble());
			ob.setZ(kb.nextDouble());
			System.out.println("Vuvedi Tip na podaruka");
			ob.setType(kb.next());
			System.out.println("Vuvedi Kupuvach");
			ob.setBuyer(kb.next());
			System.out.println("Vuvedi Cena");
			ob.setPrice(kb.nextDouble());
			System.out.println("Vuvedi Zakupeno li e");
			ob.setBought(kb.nextBoolean());
			arr.add(ob);
		}
	}
	@Test
	void test1() {
		assertEquals(1,KoledenList.Bought(arr));
	}
	@Test
	void test2() {
		assertEquals(1, KoledenList.Search(arr));
	}
	@Test
	void test3() {
		assertEquals(0, KoledenList.Max(arr));
	}
	@Test
	void test4() {
		assertEquals(3000, KoledenList.SumPrice(arr));
	}

}
