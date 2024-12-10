package com.miticraft.DiplomnaRabota;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class Mazna {
	Point ob;
	@Before
	public void setUp () {
		ob = new Point();
	}
	@Test
	public void test() {
		assertEquals(0, ob.Sistema(0, 0), 0);
	}

}
