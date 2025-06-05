package interfacePracticeQuestions;

public class Car implements Vehicle{
	

	@Override
	public void start() {
		
		System.out.println("start implemented method from interface vehicle");
		
	}

	@Override
	public void stop() {
	
		System.out.println("stop implemented method from interface vehicle");
	}
	

}
