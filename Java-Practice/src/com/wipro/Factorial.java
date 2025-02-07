package com.wipro;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("======FACTORIAL PROGRAM======");
		Scanner read = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = read.nextInt();
		long fact = 1;
		if(num==1) {
			System.out.println("Factorial of 1 is 1");
		}
		else if(num<1) {
			System.out.println("\nFactorial of Numbers below 1 is not possible!");
		}
		else {
			for(int i = 1;i<=num;i++) {
				fact *= i;	
			}
			System.out.println("\nFactorial of " + num + " is " + fact);
		}
		read.close();
	}
}
