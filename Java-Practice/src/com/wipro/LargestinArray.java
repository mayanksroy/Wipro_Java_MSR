package com.wipro;

public class LargestinArray {
	
	public static int largest(int arr[]) {
		int largest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	public static void main(String[] args) {
		int arr[] = {4, 5 ,7, 9, 3, 2};
		System.out.println("Largest in Array: " + largest(arr));
		
	}
}
