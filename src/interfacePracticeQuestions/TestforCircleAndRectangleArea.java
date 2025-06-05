package interfacePracticeQuestions;

public class TestforCircleAndRectangleArea {

	public static void main(String[] args) {
		
		
		Shape circle= new Circle(5);
		
		Shape rectangle= new Rectangle(7, 5);
		
		System.out.println("Area of Circle is " + circle.area());
		System.out.println("Area of Rectangle is " + rectangle.area());

	}

}
