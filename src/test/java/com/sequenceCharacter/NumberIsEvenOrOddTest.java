package com.sequenceCharacter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberIsEvenOrOddTest {
	
	NumberIsEvenOrOdd numberIsEvenOrOdd_object= new NumberIsEvenOrOdd();
	
	/*
	 * Given a even number
	 * then call checkIfNumberIsEvenOrOdd()
	 * return "Even" 
	 */

	@Test
	void testWhenNumberIsEven() {
		String result = numberIsEvenOrOdd_object.checkIfNumberIsEvenOrOdd(4);
		assertEquals("Even", result);
	}
	
	/*
	 * Given a odd number
	 * then call checkIfNumberIsEvenOrOdd()
	 * return "Odd" 
	 */
	
	@Test
	void testWhenNumberIsOdd() {
		String result = numberIsEvenOrOdd_object.checkIfNumberIsEvenOrOdd(3);
		assertEquals("Odd", result);
	}

}
