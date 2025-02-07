package wipro;

import java.util.*;

public class BankingApp {
	static double balance = 10000;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("");
			System.out.println("Banking Menu");
			System.out.println("Choose from options");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Transfer Money");
			System.out.println("5. Exit");
			
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				checkbalance();
				break;
			case 2:
				deposit(scanner);
				break;
			case 3:
				withdraw(scanner);
				break;
			case 4:
				transfer(scanner);
				break;
			case 5:
				System.out.println("Exiting Appication");
				break;
			default:
				System.out.println("Invalid Option");
			}
		}while (choice != 5);
		scanner.close();
	}
	
	public static void checkbalance() {
		System.out.println("Your Account Balance is " + balance);
	}
	
	public static void deposit(Scanner scanner) {
		System.out.println("Enter Deposit Amount: ");
		double amount = scanner.nextDouble();
		
		if (amount > 0) {
			balance+=amount;
			System.out.println("Total Balance after Deposit: " + balance);
		}
		else {
			System.out.println("Deposit Failed, Try Again");
		}
	}
	
	public static void withdraw(Scanner scanner) {
		System.out.println("Enter Withdraw Amount: ");
		double amount = scanner.nextDouble();
		
		if (amount>balance) {
			System.out.println("You Have low Balance, Try Again");
		}
		else {
			balance-=amount;
			System.out.println("Total Balance after Withdrawal: " + balance);
		}
	}
	
	public static void transfer(Scanner scanner) {
		System.out.println("Enter the Name of benificiary: ");
		scanner.nextLine();
		String Name = scanner.nextLine();
		System.out.println("Enter the Acc No of benificiary: ");
		long Acc = scanner.nextLong();
		System.out.println("Enter the Amount: ");
		double amount = scanner.nextDouble();

		
		
		if (amount>balance) {
			System.out.println("You Have low Balance, Try Again");
		}
		else {
			balance-=amount;
			System.out.println("Rs." + amount + " transferred to " + Name + " Account No: " + Acc);
			System.out.println("Total Balance after Transfer: " + balance);
		}
	}
}
