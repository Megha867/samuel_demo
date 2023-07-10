package com.sequenceCharacter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciSeriesTest {
	FibonacciSeries fibonacci = new FibonacciSeries();
	
	/*
	 * Given a 1
	 * then call createFibonacciSeries()
	 * return 0
	 */
	
	/*
	 * Given a 2
	 * then call createFibonacciSeries()
	 * return 0 1
	 */
	
	/*
	 * Given a 3
	 * then call createFibonacciSeries()
	 * return 0 1 1
	 */



	@Test
	void testFibonacciSeriesForNumber() {
		String series = fibonacci.createFibonacciSeries(5);
		assertEquals("0 1 1 2 3",series);
		
	}

}
