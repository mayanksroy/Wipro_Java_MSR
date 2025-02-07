package wipro.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class lambda1 {
	
	public static void main(String[] args) {
		
/*		  A add = (i, j) -> i+j; 
		  System.out.println("Addition: " + add.operate(5, 6));
		  
		  A multiply = (i, j) -> i*j;
		  System.out.println("Multiplication: " + multiply.operate(5, 6));*/
		 
		List<String> names = new ArrayList<String>();
		
		Scanner read = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter String: ");
			String j = read.next();
			names.add(j);
		}
		
			names.sort(Comparator.naturalOrder());
			System.out.println("Natural Order: " + names);
			
			names.sort(Comparator.reverseOrder());
			System.out.println("Reverse Order: " + names);
				
		
		/*
		 * Scanner read = new Scanner(System.in); System.out.println("Input 1: ");
		 * String c = read.next(); System.out.println("Input 2: "); String d =
		 * read.next(); B obj1 = (a, b) -> System.out.println(a + " " + b); obj1.show(c,
		 * d); read.close();
		 */
		
		read.close();
	}
}
