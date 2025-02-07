package com.wipro.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void test() {
		int a = Math.min(55, 23);
		int b = 23;
		assertEquals(b, a);
	}
	
	@Test
	void test2() {
		int x = Math.min(34, 11);
		int y = 11;
		assertEquals(x, y);
	}
}
