package abstractClassPractice;

public class EmployeeTestClass {

	public static void main(String[] args) {
		
		FullTimeEmployee ft= new FullTimeEmployee("Jatin", 100,  5000.0);
		PartTimeEmployee pt= new PartTimeEmployee("Ravi", 101, 25, 45);
		
		ft.displayinfo();
		System.out.println("full time salary: " + ft.calculateSalary());
		
		System.out.println();
		
		pt.displayinfo();
		System.out.println("part time salary: " + pt.calculateSalary());
		
		
	}

}
