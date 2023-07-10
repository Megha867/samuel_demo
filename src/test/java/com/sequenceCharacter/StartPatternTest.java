package com.sequenceCharacter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StartPatternTest {
	/*
	 * Given a number
		then call printPattern method
		return given number of star
		
		Given a 0 number
		then call printPattern method
		return ""
		
		Given a number
		then call printPattern method
		return string for given number of rows and stars to the respective column 
		
		note:
		Given a number is 2
		then call printPattern method
		return *\n**
		
		Given a number is 5
		then call printPattern method
		return *\n**\n***\n****\n*****
	 */
	StartPattern starPattern = new StartPattern();

	@Test
	void testStarForGivenNumber() {
		String stars = starPattern.printPattern(10);
		assertEquals("**********", stars);
	}
	
	@Test
	void testWhenNumberIsZero() {
		String empty_string = starPattern.printPattern(0);
		assertEquals("", empty_string);
	}
	
	@Test
	void testStarPatternForGivenNumber() {
		String star_pattern = starPattern.printPatternWithRowAndColumn(4);
		assertEquals("*\n**\n***\n****", star_pattern);
	}
	
	@Test
	void testStarPatternWhenNumberIsZero() {
		String empty_string  = starPattern.printPatternWithRowAndColumn(0);
		assertEquals("", empty_string);
	}


}
