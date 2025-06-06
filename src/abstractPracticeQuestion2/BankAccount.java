package abstractPracticeQuestion2;

abstract class BankAccount {
	
	//Create an abstract class BankAccount with methods deposit(), withdraw(), and an abstract method calculateInterest(). 
	//Create two classes SavingsAccount and CurrentAccount that provide their own implementation of calculateInterest().
	
	
	double balance;
	
	
	public BankAccount (double balance) {
		this.balance= balance;
		
	}
	
	public void deposit(double amount) {
		if(amount> 0) {
			balance= balance + amount;
			System.out.println("Deposite: $" + amount);
			
		}else {
			System.out.println("Invalid deposit amount.");
		}
		
	}
	
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance= balance - amount;
			System.out.println("Withdrwan: $" + amount);
			
		}else {
			System.out.println("Insufficient balance or invalid amount.");
			
		}
		
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	public abstract double calculateInterest();
	
}
