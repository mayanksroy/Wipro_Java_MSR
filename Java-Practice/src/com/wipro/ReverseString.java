package com.wipro;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("======REVERSE STRING PROGRAM======");
		Scanner read = new Scanner(System.in);
		System.out.println("Enter Input String: ");
		String input = read.next();
//		String reverse = "";
//		for(int i = input.length() - 1;i >= 0;i--) {
//			reverse += input.charAt(i);
//		}
//		System.out.println("Reversed String: " + reverse);
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		System.out.println("Reversed String: " + sb);
		read.close();
	}
}
