package abstractPracticeQuestion2;

public class BankAcciuntTest {

	public static void main(String[] args) {
		
		BankAccount savings = new SavingsAccount(1000);
		savings.deposit(500);
		savings.withdraw(200);
		
		System.out.println("Savings Account Balance: $" + savings.getBalance());
		System.out.println("Savings Account Interest: $" + savings.calculateInterest());
		
		System.out.println();
		
		  BankAccount current = new CurrrentAccount(2000);
	        current.deposit(1000);
	        current.withdraw(500);
	        System.out.println("Current Account Balance: $" + current.getBalance());
	        System.out.println("Current Account Interest: $" + current.calculateInterest());
		

	}

}
