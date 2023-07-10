package com.example.demo.controllers;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	public String checkNumberIsPrimeOrNot(int number) {
		int count=0;
		if(number>1) {
			for(int index=1;index<=number;index++) {
				if(number%index==0) {
					count++;
				}
			}
			if(count>2) {
				return "Number is not prime";
			}
			else {
				return "Number is prime";
			}
		}
		else 
		{
			return "Number should be greater than 1";
		}
	}

	public String isNumberGreaterThan1(int number) {
		if(number<1) 
			return "Number should be greater than 1";
		return null;
	}
	
	public String isprime(int number) {
		int count=0;
		if(number>1) {
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					count++;
				}
			}
		}
		if(count>2) 
			return "Not Prime";
		else
			return "Prime";
	}
	
	

}
