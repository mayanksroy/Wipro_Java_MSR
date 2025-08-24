package com.wipro.array;

public class MissingElementArray {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 5, 6, 7, 8};
		
		int expected = 0;
		int actual = 0;
		
		for(int value: arr)
		{
			actual = actual + value;
		}
		
		for(int i = 1; i<=8; i++)
		{
			expected = expected + i;
		}
		
		System.out.println(actual);
		System.out.println(expected);
		System.out.println("Missing Num = " + (expected-actual));
	}
}
