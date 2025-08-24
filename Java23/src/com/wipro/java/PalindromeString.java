package com.wipro.java;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		scan.close();
	}
}
