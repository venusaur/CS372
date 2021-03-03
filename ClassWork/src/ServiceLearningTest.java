import java.util.*;



public class ServiceLearningTest {
	
	private static void menu() {
		System.out.println("1. Day 1");
		System.out.println("2. Day 2");
		System.out.println("3. Day 3");
		System.out.println("4. Day 4");
		System.out.println("5. Day 5");
		System.out.println("----------");
		System.out.println("Enter your choice: ");
	}
	
	public static void choices(int choice) {
			switch(choice) {
				case 1: 
					System.out.println("Day 1 is cool");
					break; 
				case 2: 
					System.out.println("Day 2 is cool");
					break; 
				case 3:
					System.out.println("Day 3 is cool");
					break; 
				case 4:
					System.out.println("Day 4 is cool");
					break; 
				case 5:
					System.out.println("Day 5 is cool");
					break; 
			}
	}
	
	
	public static void main(String[] args) {
	
		Scanner menuInput = new Scanner(System.in); 
		int choice;
		choice = menuInput.nextInt(); 
		
		
		while(0 < choice && choice > 5) {
			menu(); 
			choices(choice);
		}
		
		
		
		menuInput.close();
	}
}
