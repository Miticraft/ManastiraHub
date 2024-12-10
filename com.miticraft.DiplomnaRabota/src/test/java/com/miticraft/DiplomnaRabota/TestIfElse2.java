package com.miticraft.DiplomnaRabota;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestIfElse2 {
	public Mark studentMark = new Mark();
	
	@Test
	public void test6() {
		int result = studentMark.markMet(99);
		assertEquals(6, result);
	}

	@Test
	public void test5() {
		int result = studentMark.markMet(85);
		assertEquals(5, result);
	}

	@Test
	public void test4() {
		int result = studentMark.markMet(70);
		assertEquals(4, result);
	}

	@Test
	public void test3() {
		int result = studentMark.markMet(55);
		assertEquals(3, result);
	}

	@Test
	public void test2() {
		int result = studentMark.markMet(30);
		assertEquals(2, result);
	}
}
