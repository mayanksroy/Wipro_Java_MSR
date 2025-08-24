package com.wipro.array;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {4, 6, 2, 4, 9, 1, 0};
		int n = arr.length-1;
		
		System.out.println("Array before Sort: " + Arrays.toString(arr));
		
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array after Sort: " + Arrays.toString(arr));
	}
}
