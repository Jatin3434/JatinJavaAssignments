package assignment2;

public class TestStudent {

	public static void main(String[] args) {
		
		Student stu= new Student();
		stu.name = "Jatin";
		stu.rollNumber= 23;
		
		String result= stu.getStudentDetails(stu);
		System.out.println(result);
		
		int totalMarks= stu.totalMarks(20, 50, 60);
		System.out.println(totalMarks);
		
		Student stu2= new Student();
		//stu2.schoolName="JMK International School";
		stu2.name = "Hari";
		stu2.rollNumber= 56;
		
		String result2= stu2.getStudentDetails(stu2 );
		System.out.println(result2);
		
		totalMarks= stu2.totalMarks(20, 30, 60);
		System.out.println(totalMarks);
		
		System.out.println(Student.schoolName);//we overwrote the school name with object ref variable name therefore, static variable will be changed 
		
	}

}
