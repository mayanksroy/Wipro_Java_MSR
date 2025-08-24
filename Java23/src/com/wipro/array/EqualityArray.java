package com.wipro.array;

import java.util.Arrays;

public class EqualityArray {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4};
		int arr2[] = {1, 2, 6, 4};
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are not Equal");
		}
	}
}
