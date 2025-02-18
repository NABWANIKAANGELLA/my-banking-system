package bankingsystem;

public class Mybankingsystem {
	 	private String accountNumber;
	    private String accountHolderName;
	    private double balance;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mybankingsystem account1 = new Mybankingsystem("12334", "abc");
		account1.deposit(20000);

	}
	   
	public Mybankingsystem(String accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
	    this.accountHolderName = accountHolderName;
	    this.balance = 0.0;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
	        System.out.println("Deposited: $" + amount);
	    } else {
	        System.out.println("Deposit amount must be positive.");
	    }
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
	        System.out.println("Withdrew: $" + amount);
	    } else {
	        System.out.println("Invalid withdraw amount.");
	    }
	 }	

	   

}
