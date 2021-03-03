import java.util.Scanner;

public class evenodd {
    
    //Methods
    public static void main(String[] args) { 
    	
    //https://www.w3schools.com/java/java_try_catch.asp
    	try {
        System.out.println("Enter a number (10-100)"); 
        
        //type identifier = new type(); 
        Scanner  scanner = new Scanner(System.in); 
        int num = scanner.nextInt(); 
        
     for(int i = 0; i <= num; i++) {
    	if(i % 2 == 0) {
            System.out.println(i + " is even!");
        	}
        else {
            System.out.println(i + " is odd!");
        	}
     	}
     scanner.close();
    }
    	catch(Exception e) {
    		System.out.println("Invalid Entry");
    	}
    }
  }