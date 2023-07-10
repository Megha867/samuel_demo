package com.sequenceCharacter;

public class FibonacciSeries {

	public String createFibonacciSeries(int number) {
		String output_series="";
		int first_number=0;
		int second_number=1;
		if(number==0 || number==1) 
			output_series+=String.valueOf(first_number);
		else
			output_series+=String.valueOf(first_number)+" "+String.valueOf(second_number);
		for(int count=2;count<number;count++) 
		{
			int next_number = first_number+second_number;
			output_series+=" "+String.valueOf(next_number);
			first_number=second_number;
			second_number=next_number;
		}
		return output_series;
	}

}
