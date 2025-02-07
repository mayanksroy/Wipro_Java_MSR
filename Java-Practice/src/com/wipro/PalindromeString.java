package com.wipro;

import java.util.Scanner;

public class PalindromeString {
	public static boolean isPalindrome(String str) {
		for(int i=0;i<str.length()/2;i++) {
			int n = str.length();
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("=====PALINDROME STRING PROGRAM=====");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = scanner.next();
		if(isPalindrome(str)==true) {
			System.out.println(str + " is Palindrome");
		}
		else {
			System.out.println(str + " is not Palindrome");
		}
		scanner.close();
	}
}
