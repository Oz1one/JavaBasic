package com.rootNumber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RootNumberTest {

	@Test
	void testZero() {
		findRootNumber fn= new findRootNumber();
		int result=fn.solve(0);
		assertEquals(-1, result);
	}
	@Test
	void testOne() {
		findRootNumber fn= new findRootNumber();
		int result=fn.solve(1);
		assertEquals(1, result);
	}
	@Test
	void testPositive() {
		findRootNumber fn= new findRootNumber();
		int result=fn.solve(2025);
		assertEquals(45, result);
	}
	@Test
	void testNegative() {
		findRootNumber fn= new findRootNumber();
		int result=fn.solve(3333);
		assertEquals(-1, result);
	}
}
