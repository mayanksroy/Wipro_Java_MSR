package com.wipro.java;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
//		int rev = 0;
//		while(num!=0)
//		{
//			rev = rev*10 + num%10;
//			num/=10;
//		}
//		System.out.println(rev);
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
		scan.close();
	}

}
