package com.sequenceCharacter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfDigitsTest {
	
	/*
	 * 
	 * Sum of digits

	Given a number
	then call getSumOfDigit()
	return sum of digit

	note:
	Given a 1
	then call calculateSum()
	return 1

	Given a 5
	then call calculateSum()
	return 5
	
	Given a 12
	then call calculateSum()
	return 3

	 */
	
	SumOfDigits sumOfDigit = new SumOfDigits();
	
	@Test
	void testGetSumOfDigit() {
		int result = sumOfDigit.getSumOfDigit(0);
		assertEquals(0, result);
	}
	
	

}
