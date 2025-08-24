package com.wipro.java;

public class FibbonacciSeries {
public static void main(String[] args) {
	int a = 0;
	int b = 1;
	System.out.println(a);
	System.out.println(b);
	int t = 10;
	int n = 0;
	int c = 0;
	while(t>n) {
		c = a + b;
		a = b;
		b = c;
		System.out.println(c);
		t--;
	}
	}
}
