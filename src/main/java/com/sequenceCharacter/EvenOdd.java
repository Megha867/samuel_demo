package com.sequenceCharacter;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int given_arr[] = new int[] {1,1,1,1,0};
		int first_arr[] = new int[5];
		int second_arr[] = new int[5];
		int initial_value_first_arr=0;
		int initial_value_second_arr=1;
		for(int i=0;i<given_arr.length;i++) {
			if(initial_value_first_arr==0) {
				if(i%2==0) 
					first_arr[i]=0;
				else 
					first_arr[i]=1;
			}
			if(initial_value_second_arr==1) 
			{
				if(i%2==0) 
					second_arr[i]=1;
				else 
					second_arr[i]=0;
			}
		}
		int first_arr_count=0;
		int second_arr_count=0;
		System.out.println("given_arr");
		for(int i=0;i<given_arr.length;i++) 
		{
			
			System.out.print(given_arr[i]);
		}
		System.out.println("first_arr");
		for(int i=0;i<given_arr.length;i++) 
		{
			if(given_arr[i]==first_arr[i])
				first_arr_count++;
			System.out.print(first_arr[i]);
		}
		System.out.println("second_arr");
		for(int i=0;i<given_arr.length;i++) 
		{
			if(given_arr[i]==second_arr[i])
				second_arr_count++;
			System.out.print(second_arr[i]);
		}
		System.out.println("Number of changes");
		if(first_arr_count<second_arr_count) {
			System.out.println(first_arr_count);
		}else {
			System.out.println(second_arr_count);
		}

	}

}
