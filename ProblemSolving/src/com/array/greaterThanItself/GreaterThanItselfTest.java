package com.array.greaterThanItself;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreaterThanItselfTest {

	@Test
	void testone() {
		int[] A= new int[] {1, 7, 2, 0, 5, 7, 0};
		GreaterThanItself gti= new GreaterThanItself();
		
		int result=gti.solve(A);
		assertEquals(5, result);
	}
	
	@Test
	void testtwo() {
		int[] A= new int[] {2, 3, 10, 7, 3, 2,10, 8};
		GreaterThanItself gti= new GreaterThanItself();
		
		int result=gti.solve(A);
		assertEquals(6, result);
	}
	
	@Test
	void testthree() {
		int[] A= new int[] {7,7,7,7,7,7,7};
		GreaterThanItself gti= new GreaterThanItself();
		
		int result=gti.solve(A);
		assertEquals(0, result);
	}
	
	@Test
	void testfour() {
		int[] A= new int[] {5, 5, 3};
		GreaterThanItself gti= new GreaterThanItself();
		
		int result=gti.solve(A);
		assertEquals(1, result);
	}
	
	@Test
	void testfive() {
		int[] A= new int[] {3, 1, 2};
		GreaterThanItself gti= new GreaterThanItself();
		
		int result=gti.solve(A);
		assertEquals(2, result);
	}

}
