package com.miticraft.DiplomnaRabota;

import static org.junit.jupiter.api.Assertions.*;

class Test {
	@org.junit.jupiter.api.Test
	void test() {
		Proiz ez = new Proiz();
		assertEquals(3, ez.Shef(new int[] {1,2,3,-8}));
		assertEquals(8, ez.Chief(new int[] {2,2,2}));
		assertEquals(8, ez.Max(new int[] {1,2,4,7,8}));
		assertEquals(9, ez.Uravneniq(-2));
	}

}
