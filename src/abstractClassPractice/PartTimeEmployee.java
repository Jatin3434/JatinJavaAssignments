package abstractClassPractice;

public class PartTimeEmployee extends Employee {

	double hoursworked;
	double hourlyrate;
	
	
	public PartTimeEmployee(String name, int id, double hoursworked,double hourlyrate ) {
		super(name, id);
		this.hoursworked= hoursworked;
		this.hourlyrate= hourlyrate;
	}

	
	public double calculateSalary() {
		
		return hoursworked*hourlyrate;
	}

}
