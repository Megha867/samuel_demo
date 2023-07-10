package com.example.demo.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Value;

class PrimeNumberTest {

	PrimeNumber is_prime = new PrimeNumber();
	

//	@ParameterizedTest
//	@ValueSource(ints = {2,3,5,7})
//	void test_WhenNumberIsPrime(int number) {
//		String result = is_prime.checkNumberIsPrimeOrNot(number);
//		assertEquals("Number is prime", result);
//	}
//	
//	@ParameterizedTest
//	@ValueSource(ints = {-1,0,1,4,6,8})
//	void test_WhenNumberIsNotPrime(int number) {
//		String result = is_prime.checkNumberIsPrimeOrNot(number);
//		
//			assertEquals("Number is not prime", result);
//	}
	
	
	@Test
	public void numberShouldBeGreaterThan1() {
		int number =5;
		String result = is_prime.isNumberGreaterThan1(number);
		assertEquals("Number should be greater than 1", result);
		
	}
	
	@Test
	public void is_prime() {
		int number=5;
		
		String result = is_prime.isprime(number);
		assertEquals("Prime", result);
	}
	
	

}
