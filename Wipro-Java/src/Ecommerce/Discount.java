package Ecommerce;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Bill Amount: ");
		double price = read.nextDouble();
		Customer regularCustomer = new RegularCustomer();
	    Customer premiumCustomer = new PremiumCustomer();
	    Customer employee = new Employee();
	    
	    System.out.println("====================================");
	    System.out.println("Choose your Customer Type(1/2/3): ");
	    System.out.println("1. Regular");
	    System.out.println("2. Premium");
	    System.out.println("3. Employee");
	    int type = read.nextInt();
	    
	    System.out.println("=====================================");
	    if (type==1) {
	    	System.out.println("Your Discounted Bill: " + regularCustomer.calculateDiscount(price));
	    }
	    else if(type==2) {
	    	System.out.println("Your Discounted Bill: " + premiumCustomer.calculateDiscount(price));
	    }
	    else if(type==3) {
	    	System.out.println("Your Discounted Bill: " + employee.calculateDiscount(price));
	    }
	    else {
	    	System.out.println("Invalid Choice!! Try Again");
	    }
	    System.out.println("===========Happy Shopping!!===========");
	    read.close();
	}
}