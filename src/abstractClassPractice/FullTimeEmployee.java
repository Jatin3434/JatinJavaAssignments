package abstractClassPractice;

public class FullTimeEmployee extends Employee{
	
	double monthlysalary;
	
	public FullTimeEmployee(String name, int id, double monthlysalary) {
		super(name, id);
		this.monthlysalary= monthlysalary;
	}

	
	public double calculateSalary() {
		
		return monthlysalary;
	}
	
	
	
	
	
}
