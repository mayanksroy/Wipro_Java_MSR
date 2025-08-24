package com.wipro.array;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int l=0;
//		int h=arr.length-1;
//		int target = 11;
//		boolean flag=false;
//		while(l<=h)
//		{
//			int m=l+h/2;
//			if(arr[m]==target)
//			{
//				System.out.println("Element Found at index " + m);
//				flag=true;
//				break;
//			}
//			if(arr[m]<target)
//			{
//				l=m+1;
//				
//			}
//			if(arr[m]>target)
//			{
//				h=m-1;
//			}
//		}
//		if(flag==false) 
//		{
//			System.out.println("Element Not Found");
//		}	
		
		int index = Arrays.binarySearch(arr, 10);
		System.out.println(index);
	}
}
