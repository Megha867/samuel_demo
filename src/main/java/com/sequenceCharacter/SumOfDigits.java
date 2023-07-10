package com.sequenceCharacter;

public class SumOfDigits {

	public int getSumOfDigit(int number) {
		int sum=0;
		while(number>0) 
		{
			int temp = number%10;
			sum=sum+temp;
			number=number/10;
		}
		return sum;
		
//		System.out.println("second_arr");
	}
	
	public static void main(String[] args) {
		
	}
}
