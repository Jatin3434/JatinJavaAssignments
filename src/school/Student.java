package school;

public class Student {
	
	
	//pascal & camel casing
	
	static String schoolName= "Churchil Meadows Public School";
	static String classTeacher= "Miss Singleton";
	
	int rollNumber;
	String name;
	
	public int totalMarks(int science, int socialscience, int maths) {
		
		
		return science + socialscience + maths;
	}
	
	public String getStudentDetails(Student studentDetails) {
		
		String studentName = studentDetails.name;
		int studentRollNumber= studentDetails.rollNumber;
		String studentSchoolName= studentDetails.schoolName;
		
		
		
		
		
		return "student details are: ";
		
	 }

}
