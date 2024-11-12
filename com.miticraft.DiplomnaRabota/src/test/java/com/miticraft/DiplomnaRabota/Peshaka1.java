package com.miticraft.DiplomnaRabota;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Peshaka1 {

	@Test
	void test() {
		Example1 ob1 = new Example1();
		String result = ob1.conCad("Pesho e", " gei");
		assertEquals("Pesho e gei", result);
	}

}
