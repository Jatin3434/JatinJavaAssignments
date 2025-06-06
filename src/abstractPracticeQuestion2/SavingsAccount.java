package abstractPracticeQuestion2;

public class SavingsAccount extends BankAccount 
{
	double interestRate = 0.04;
	
	 public SavingsAccount(double balance) {
	        super(balance);
	    }

	 public double calculateInterest() 
	 {
	        
		 return balance * interestRate;
	  
	 }

	
	
	
}
