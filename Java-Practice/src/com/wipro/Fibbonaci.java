package com.wipro;

import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {
		System.out.println("======FIBBONACI PROGRAM======");
		Scanner read = new Scanner(System.in);
		System.out.println("Enter Range from 1 to: ");
		Integer input = read.nextInt();
		
		int x = 0;
		int y = 1;
		System.out.println(x);
		System.out.println(y);
		while(input>0) {
			System.out.println(x+y);
			int z = x+y;
			x=y;
			y=z;
			input--;
		}
		read.close();
		
	}

}
