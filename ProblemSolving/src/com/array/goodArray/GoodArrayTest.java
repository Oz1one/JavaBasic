package com.array.goodArray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.array.greaterThanItself.GreaterThanItself;

class GoodArrayTest {

	@Test
	void testSolveOne() {
		int[] A= new int[] {3, 1, 2};
		GoodArray ga= new GoodArray();
		
		int result=ga.solve(A,3);
		assertEquals(1, result);
	}
	
	@Test
	void testSolveTwo() {
		int[] A= new int[] {3, 1, 2};
		GoodArray ga= new GoodArray();
		
		int result=ga.solve(A,4);
		assertEquals(1, result);
	}
	
	@Test
	void testSolveThree() {
		int[] A= new int[] {1,2,3,4};
		GoodArray ga= new GoodArray();
		
		int result=ga.solve(A,7);
		assertEquals(1, result);
	}
	
	@Test
	void testSolveFour() {
		int[] A= new int[] {1,2,3,4};
		GoodArray ga= new GoodArray();
		
		int result=ga.solve(A,5);
		assertEquals(1, result);
	}
	
	@Test
	void testSolveFive	() {
		int[] A= new int[] {2, 1, 2};
		GoodArray ga= new GoodArray();
		
		int result=ga.solve(A,7);
		assertEquals(0, result);
	}

}
