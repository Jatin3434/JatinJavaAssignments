package javaConcepts;

public class ForLoop {

	public static void main(String[] args) {
		// loop- repeat lines of code when a condition is true;

		// for loop
		// while loop
		// do while loop
		
		
		//for loop
		
		//int num= 10;
		
		for(int i= 0; i<10; i++) {
			
			System.out.println("Number is : " + i);
			
			if(i ==5) {
				System.out.println("done now");
				//break;
				continue;
			}
		}
		
		System.out.println("=======================================");

		int j=0;
		
		
		while(j<10) {
			
			System.out.println("Number is: " + j);
			j++;
		}
		
		
		System.out.println("=======================================");
		
		
		int k=0;
		
		do {
			System.out.println("Number is :" + k);
			k++;
		} while(k<10);
	
		
		
		
	}

}
