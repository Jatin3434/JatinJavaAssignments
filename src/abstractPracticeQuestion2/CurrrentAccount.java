package abstractPracticeQuestion2;

public class CurrrentAccount extends BankAccount 
{
	 double interestRate = 0.02;
	 
	 
	public CurrrentAccount(double balance) {
		super(balance);
		
	}

	
	public double calculateInterest() {
		
		return balance * interestRate;
	}


	

	
	
}
