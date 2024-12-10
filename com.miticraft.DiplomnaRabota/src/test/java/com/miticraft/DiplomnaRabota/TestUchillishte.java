package com.miticraft.DiplomnaRabota;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUchillishte {
	Point ob;
	@BeforeEach
	void setUp() throws Exception {
		ob = new Point();
	}

	@Test
	void test() {
		assertEquals(0, ob.Sistema(0, 0));
		assertEquals(0, ob.Sistema(1, 0));
		assertEquals(0, ob.Sistema(0, 1));
		assertEquals(1, ob.Sistema(1, 1));
		assertEquals(2, ob.Sistema(-1, 1));
		assertEquals(3, ob.Sistema(-1, -1));
		assertEquals(4, ob.Sistema(1, -1));
	}

}
