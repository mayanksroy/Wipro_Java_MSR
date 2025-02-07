//package com.wipro;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Anagrams {
//	public static boolean Anagrams(String str1, String str2) {
//		str1 = str1.toLowerCase();
//		str2 = str2.toLowerCase();
//		
//		if (str1.length() != str2.length()) {
//			return false;
//		}
//		
//		char[] chararray1 = str1.toCharArray();
//		char[] chararray2 = str2.toCharArray();
//		
//		Arrays.sort(chararray1);
//		Arrays.sort(chararray2);
//		
//		return Arrays.equals(chararray1, chararray2);
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("=====ANAGRAMS PROGRAM=====");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter String 1: ");
//		String str1 = scanner.next();
//		System.out.println("Enter String 2: ");
//		String str2 = scanner.next();
//		
//		if(Anagrams(str1, str2)) {
//			System.out.println(str1 + " and " + str2 + " are Anagrams");
//		}
//		else {
//			System.out.println(str1 + " and " + str2 + " are not Anagrams");
//		}
//		scanner.close();
//	}
//}
