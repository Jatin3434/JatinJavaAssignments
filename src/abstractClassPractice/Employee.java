package abstractClassPractice;

abstract class Employee {
	
	//Create an abstract class Employee with abstract method calculateSalary(). 
	//Create subclasses FullTimeEmployee and PartTimeEmployee that calculate salary differently.
	
	
	String name;
	int id;
	
	public Employee(String name, int id) {
		this.name= name;
		this.id= id;
	}
	
	
	
	public abstract double calculateSalary();
	
	
	public void displayinfo() {
		System.out.println("Employee name: " + name);
		System.out.println("Employee ID: " + id);
		
	}
}
