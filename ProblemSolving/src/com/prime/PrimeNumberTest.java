package com.prime;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.prime.PrimeNumber;

class PrimeNumberTest {

	@Test
	void testSolvePrime() {
		PrimeNumber isPrime=new PrimeNumber();
		int result=isPrime.solve((long) 11);
		assertEquals(1, result);
	}
	@Test
	void testSolveNonPrime() {
		PrimeNumber isPrime=new PrimeNumber();
		int result=isPrime.solve((long) 12);
		assertEquals(0, result);
	}
	@Test
	void testSolveEdgeCaseOne() {
		PrimeNumber isPrime=new PrimeNumber();
		int result=isPrime.solve((long) 1);
		assertEquals(0, result);
	}
	
	@Test
	void testSolveBigValue() {
		PrimeNumber isPrime=new PrimeNumber();
		int result=isPrime.solve((long) 857);
		assertEquals(1, result);
	}
}
