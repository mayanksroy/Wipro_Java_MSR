package com.wipro.array;

public class MaxMinArrayElement {
	public static void main(String[] args) {
		int arr[] = {40, 20, 70, 30, 10};
		int Max = arr[0];
		int Min = arr[0];
		
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i]>Max)
			{
				Max = arr[i];
			}
		}
		
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i]<Min)
			{
				Min = arr[i];
			}
		}
		System.out.println("Max Element is " + Max);
		System.out.println("Min Element is " + Min);
	}
}
