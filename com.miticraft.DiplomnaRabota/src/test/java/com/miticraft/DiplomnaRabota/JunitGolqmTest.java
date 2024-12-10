package com.miticraft.DiplomnaRabota;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitGolqmTest {
int ap[];
int am[];
int as[];
	@BeforeEach
	void setUp() throws Exception {
		ap = JUnitGluposti.Vuvejdane(4);
		am = JUnitGluposti.Vuvejdane(4);
		as = JUnitGluposti.Vuvejdane(4);
	}
	//-1,-2,8,5
	//-1,-2,-3,-4
	//1,2,3,4
	@Test
	void test() {
		assertEquals(0, JUnitGluposti.Broi(ap));
		assertEquals(4, JUnitGluposti.Broi(am));
		assertEquals(2, JUnitGluposti.Broi(as));
	}
	@Test
	void test1() {
		assertEquals(10, JUnitGluposti.Sum(ap));
		assertEquals(0, JUnitGluposti.Sum(am));
		assertEquals(13, JUnitGluposti.Sum(as));
	}
	@Test
	void test2() {
		assertEquals(4, JUnitGluposti.Max(ap));
		assertEquals(1, JUnitGluposti.Max(am));
		assertEquals(3, JUnitGluposti.Max(as));
	}
	@Test
	void test3() {
		assertEquals(2, JUnitGluposti.BroiChetni(ap));
		assertEquals(2, JUnitGluposti.BroiChetni(am));
		assertEquals(2, JUnitGluposti.BroiChetni(as));
	}
	@Test
	void test4() {
		assertEquals(24, JUnitGluposti.Proiz(ap));
		assertEquals(1, JUnitGluposti.Proiz(am));
		assertEquals(40, JUnitGluposti.Proiz(as));
	}
	@Test
	void test5() {
		assertEquals(1, JUnitGluposti.Min(ap));
		assertEquals(4, JUnitGluposti.Min(am));
		assertEquals(2, JUnitGluposti.Min(as));
	}
	
}
