package com.example.demo.controllers;

import java.util.Scanner;

public class FloodFill 
{
	int row;
	int column;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows of matrix:");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns of matrix:");
		int columns = sc.nextInt();
		System.out.println("Enter matrix values:");
		int initialMatrix[][] = new int[rows][columns];
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<columns;j++)
			{
				initialMatrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter starting row coordinates:");
		int startingRCoordinate = sc.nextInt();
		System.out.println("Enter starting column coordinates:");
		int startingCCoordinate = sc.nextInt();
		System.out.println("Enter number to fill new color :");
		int newColor = sc.nextInt();
		FloodFill object = new FloodFill();
		object.updatedMatrix(initialMatrix,startingRCoordinate,startingCCoordinate,newColor);
	}
	
	public void updatedMatrix(int matrix[][],int row_co_ordinate, int column_co_oridinate, int newColor) {
		
		System.out.println("Final matrix:"+matrix.length);
		System.out.println("Final matrix:"+matrix[0].length);
		
		  for(int i=0;i<matrix.length;i++)
		  { 
			  for(int j=0;j<matrix[0].length;j++) 
			  {
				  if(i==row_co_ordinate && j==column_co_oridinate) {
					  if(matrix[i][j]!=newColor) {
						  matrix[i][j]=newColor;
					  }
					  else {
						  FloodFill object1 = new FloodFill();
							object1.updateWithNewColor(matrix,row_co_ordinate,column_co_oridinate,newColor);
					  }
				  }
			  System.out.print(matrix[i][j]+" ");
			  } 
			  System.out.println(); 
		  }
	}
	
	public void updateWithNewColor(int matrix[][],int row_co_ordinate,int column_co_oridinate, int newColor ) {
		 for(int i=0;i<matrix.length;i++)
		  { 
			  for(int j=0;j<matrix[0].length;j++) 
			  {
				  if(i==row_co_ordinate && j==column_co_oridinate) {
					  if(matrix[i][j]!=newColor) {
						  matrix[i][j]=newColor;
					  }
					  else {
						  FloodFill object1 = new FloodFill();
							object1.updateWithNewColor(matrix,row_co_ordinate,column_co_oridinate,newColor);
					  }
				  } 
			  }
		  }
			  
	
		updateWithNewColor(matrix,row_co_ordinate-1,column_co_oridinate,newColor);
		
	}

}
