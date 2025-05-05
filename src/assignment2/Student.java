package assignment2;

public class Student 
{

	static String schoolName= "Churchill Meadows Public School";
	String classTeacher= "Miss Singleton";

	
	int rollNumber;
	String name;
	
	public int totalMarks(int science, int socialscience, int maths) {
		
		return science + socialscience + maths;	
	
	}
	
	public String getStudentDetails(Student studentDetails) {
		
		String studentName= studentDetails.name;
		int studentRollNumber= studentDetails.rollNumber;
		String studentSchoolName= Student.schoolName; //studentDetails.schoolName;
		
		return "student details are: " + " " + studentName + " " + studentRollNumber + " " + studentSchoolName;
	}
	
	public String getName(String nameOfChild) {
		return "Test";
	}
	
	
}
