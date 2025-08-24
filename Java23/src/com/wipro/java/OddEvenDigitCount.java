package com.wipro.java;

import java.util.Scanner;

public class OddEvenDigitCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = scan.nextInt();
//		int num = 2222277;
		int number = 0;
		int count=0;
		int countnum=0;
		while(num!=0)
		{
			number=num%10;
			if(number%2==0)
			{
				count++;
				number=0;
			}
			num=num/10;
			countnum++;
		}
		System.out.println("Even Digits: " + count);
		System.out.println("Odd Digits: " + (countnum-count));
		scan.close();
	}
}
