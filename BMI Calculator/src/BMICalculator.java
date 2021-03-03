import java.util.*;

public class BMICalculator {
	public static void main(String[] args) { 
		
		
		//Prompting and Inputting statistics for conversations
		
		System.out.println("Enter your weight in LB (pounds)");
		Scanner weightinput = new Scanner(System.in);
		double weight = weightinput.nextFloat(); 
		System.out.println("Enter your height in inches: ");
		Scanner heightinput = new Scanner(System.in);
		double height = heightinput.nextFloat(); 
		
		
		//Converting LB to KG
		double kg = weight * 0.45359237; 
		
		//Converting IN to M 
		double M = height * 0.0254; 
			
		
		//BMI = KG/m^2
		
		System.out.println("Your BMI is " + kg/((M)*(M)));
		
		weightinput.close();
		heightinput.close();
		
		
	}
}
