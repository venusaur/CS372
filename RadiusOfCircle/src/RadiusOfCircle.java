import java.util.*;


public class RadiusOfCircle {
	
	public static void main(String[] args) { 
		final double PI = 3.14; 
		
		System.out.println("Enter the Circle's Radius: ");
		Scanner radiusinput = new Scanner(System.in);
		float num = radiusinput.nextFloat(); 
		
		
		System.out.println("The Area of a Circle is: " + PI * num * num + " units"); 	
		
		radiusinput.close();
	}
	
}
