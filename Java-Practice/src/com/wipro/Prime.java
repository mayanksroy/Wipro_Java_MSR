package com.wipro;
import java.util.Scanner;
public class Prime {
	public static boolean isPrime(int num) {
		if(num==1) {
			return false;
		}
		else if(num==2) {
			return true;
		}
		else {
			for(int i = 2;i<=num-1;i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		System.out.println("=====PRIME NUMBER PROGRAM=====");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = scanner.nextInt();
		if(isPrime(num)==true) {
			System.out.println(num + " is a Prime Number");
		}
		else {
			System.out.println(num + " is not a Prime Number");
		}
		scanner.close();
	}
}
