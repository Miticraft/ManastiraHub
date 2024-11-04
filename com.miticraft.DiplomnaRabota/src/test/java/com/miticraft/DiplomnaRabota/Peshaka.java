package com.miticraft.DiplomnaRabota;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Peshaka {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Example1 ob1 = new Example1();
		int result = ob1.add(100, 200);
		assertEquals(300, result);
		
	}

}
