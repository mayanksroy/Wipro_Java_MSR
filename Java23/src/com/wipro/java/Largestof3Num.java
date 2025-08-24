package com.wipro.java;

public class Largestof3Num {
	public static void main(String[] args) {
		int a=22, b=15, c=20;
		if(a>b && a>c)
		{
			System.out.println("A is Largest");
		}
		else if (b>c && b>a)
		{
			System.out.println("B is Largest");
		}
		else
		{
			System.out.println("C is Largest");
		}
	}
}
