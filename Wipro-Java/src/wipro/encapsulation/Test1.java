package wipro.encapsulation;

public class Test1 {
	public static void main(String[] args) {
		BankingApplication account1 = new BankingApplication("123456", 10000.0, "Mayank Singh");
		BankingApplication account2 = new BankingApplication("876543", 20000.0, "Pradeep Kushwaha");
		
		account1.deposit(15000);
		account2.deposit(30000);
		account1.withdraw(2000);
		account2.withdraw(20000);
		
		System.out.println("Account Balance: " + account1.getBalanceAmount());
		System.out.println("Account Number: " + account1.getAccountNumber());
		System.out.println("Account Name: " + account1.getAccountHolderName());
		
		System.out.println("Account Balance: " + account2.getBalanceAmount());
		System.out.println("Account Number: " + account2.getAccountNumber());
		System.out.println("Account Name: " + account2.getAccountHolderName());
		
	}
}
