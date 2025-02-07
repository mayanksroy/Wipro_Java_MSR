package com.wipro.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void lengthtest() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		assertEquals(expectedLength, actualLength);
	}
	
	@Test
	void toUpperCase() {
		String str = "abcd";
		String str2 = str.toUpperCase();
		assertEquals("ABCD", str2);
	}
	
	@Test 
	void contains() {
//		String str = "abcdefg";
//		boolean result = str.contains("ijk");
//		assertEquals(false, result);

//		assertFalse(result);
//		assertTrue(result);
		
		assertFalse("abcdefg".contains("ijk"));
	}
	
	@Test
	void nullcheck() {
		String a = null;
		assertNull(a);
	}
	
	@Test
	void notnullcheck() {
		String a = "abc";
		assertNotNull(a);
	}
	
	@Test
	void split() {
		String str = "abc def ghi";
		String res[] = str.split(" ");
		String[] expected = new String[] {"abc", "def", "ghi"};
		assertArrayEquals(expected, res);
		
//		assertArrayEquals(new String[] {"abc", "def", "ghi"}, "abc def ghi".split(" "));
	}
}
