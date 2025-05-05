package dummyPackage;

public class humanFace {
	
	String nose;
	String eyebrows;
	String eyes;
	String mouth;
	String ears;
	
	
	public void eat() {
		System.out.println("Human eat");
	}
	
	public void sleep() {
		System.out.println("Human sleep");
	}
	
	public void watch ()
	{
		System.out.println("Watch");
	}
	public void blink ()
	{
		System.out.println("blink");
	}
	public void hear ()
	{
		System.out.println("hear");
	}
	public void smell ()
	{
		System.out.println("smell");
	}
	
	public static void main(String[] args) {
		
		humanFace hf = new humanFace();//object
		hf.blink();
		
		
		
		
		
		
		
		
		
		
	}
		
}
