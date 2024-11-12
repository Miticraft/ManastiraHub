package com.miticraft.DiplomnaRabota;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

 class TestIfElse {
	@Test
	 void test6() {
		Mark ob1 = new Mark();
		int result = ob1.markMet(99);
		assertEquals(6, result);
	}

	@Test
	 void test5() {
		Mark ob1 = new Mark();
		int result = ob1.markMet(85);
		assertEquals(5, result);
	}

	@Test
	 void test4() {
		Mark ob1 = new Mark();
		int result = ob1.markMet(70);
		assertEquals(4, result);
	}

	@Test
	 void test3() {
		Mark ob1 = new Mark();
		int result = ob1.markMet(55);
		assertEquals(3, result);
	}

	@Test
	 void test2() {
		Mark ob1 = new Mark();
		int result = ob1.markMet(30);
		assertEquals(2, result);
	}
}
