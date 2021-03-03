import java.util.Scanner;

/*
 Write a Java program that asks the user for a number. 
 Store that input into a string. 
 If the input starts with a number, convert the string into an integer. 
 If not, tell the user that they did not input a number. 
 
 
 Note: write your own algorithm to convert from string to int. Do not use the Java library function.
*/

class StringToInt {

    public static int strToInt(String str){
        int i = 0;
        int num = 0;
  
        try {
        // Process each character of the string;
        while( i < str.length()) {
            num *= 10;
            num += str.charAt(i++) - '0'; // Minus the ASCII code of '0' to get the value of the charAt(i++).
        	}
        }
        catch(Exception e) {
    		System.out.println("Invalid Entry");
        }
    
        return num;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");

        String str = scan.nextLine();

        char c = str.charAt(0);

        if(c >= '0' && c<= '9') {
            int val = strToInt(str);


            System.out.println("Converted to Int, Value: " + val);
            
        }
        else {
            System.out.println("Did not enter number.");
        }
        
        scan.close();
    
    }
}