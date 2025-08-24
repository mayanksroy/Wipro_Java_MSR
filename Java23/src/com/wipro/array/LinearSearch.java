package com.wipro.array;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int target = 4;
		boolean flag = false;
		for(int i = 0; i<arr.length;i++)
		{
			if(arr[i]==target) 
			{
				System.out.println("Target Element Found at index " + i);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Element Not Found");
		}
	}
}
