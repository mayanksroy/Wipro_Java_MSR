package com.wipro.array;

public class ArrayElementSum {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		
		int sum = 0;
		int sum1 = 0;
		
		for (int i = 0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
		
		for (int value: arr)
		{
			sum1=sum1+value;
		}
		
		System.out.println(sum1);
		
	}
}
