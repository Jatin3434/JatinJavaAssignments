package inheritance;

public class TestClass {

	public static void main(String[] args) {
			
		
		
		Dog dog = new Dog(); 
		
		dog.eat();
		dog.smell();
		
		Animal ani1= new Dog(); // parent holding the child 
		
		ani1.sound();
		ani1.sleep();
		
		
	}

}
