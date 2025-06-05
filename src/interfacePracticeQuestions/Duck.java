package interfacePracticeQuestions;

public class Duck implements Flyable, Swimmable{

	@Override
	public void swim() {
	System.out.println("Duck swims");
		
	}

	@Override
	public void fly() {
		System.out.println("Duck fly");
	}
	
	
	
}
