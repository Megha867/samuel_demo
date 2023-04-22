package com.sequenceCharacter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SequenceTest {
	
	Sequence sequence = new Sequence();
	
	@Test
	public void testOddNumber() {
		char letter = sequence.getCharacterSequence(3);
		assertEquals('b', letter);
	}
	
	

}
