package com.miticraft.DiplomnaRabota;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Peshaka {
	Mark ob2;
	@BeforeEach
	void setUp() throws Exception {
		ob2= new Mark();
	}

	@Test
	void test6() {
		
		int result = ob2.markMake(39, 40);
		assertEquals(6, result);	
	}
	@Test
	void test5() {
		int result = ob2.markMake(50, 60);
		assertEquals(5, result);	
	}
	@Test
	void test4() {
		int result = ob2.markMake(30, 40);
		assertEquals(4, result);	
	}
	@Test
	void test3() {
		int result = ob2.markMake(20, 40);
		assertEquals(3, result);	
	}
	@Test
	void test2() {
		int result = ob2.markMake(19, 40);
		assertEquals(2, result);	
	}
	@Test
	void test() {
		int result = ob2.markMake(100,40);
		assertEquals(0, result);	
	}
}
