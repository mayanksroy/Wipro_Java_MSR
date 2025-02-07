package wipro.encapsulation;

public class BankingApplication {
	//private 
	
	private String AccountNumber;
	private double BalanceAmount;
	private String AccountHolderName;
	
	public BankingApplication(String accountNumber, double balanceAmount, String accountHolderName) {
		super();
		AccountNumber = accountNumber;
		BalanceAmount = balanceAmount;
		AccountHolderName = accountHolderName;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getBalanceAmount() {
		return BalanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		BalanceAmount = balanceAmount;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	
	//deposit
	
	public void deposit(double amount) {
		if(amount > 0 ) {
			BalanceAmount += amount;
			System.out.println(BalanceAmount);
		}
		else {
			System.out.println("Amount Not Valid" );
		}
	}
	
	//withdraw
	
	public void withdraw(double amount) {
		if (amount > BalanceAmount) {
			System.out.println("Insufficient Balance");
		}
		else {
			BalanceAmount-=amount;
			System.out.println("Withdrawal Successfull " + BalanceAmount);
			}
		}
	}

