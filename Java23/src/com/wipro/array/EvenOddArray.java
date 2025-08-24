package com.wipro.array;

public class EvenOddArray {
	public static void main(String[] args) {
		int arr[] = {2, 4, 7, 1, 4, 5, 2};
		
		for(int value:arr)
		{
			if(value%2==0)
			{
				System.out.println("Even Number " + value);
			}
			else
			{
				System.out.println("Odd Number " + value);
			}
		}
	}
}
