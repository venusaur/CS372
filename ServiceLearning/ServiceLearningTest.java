package stuff;

import java.util.Scanner;

public class ServiceLearningTest {
	
	private static void menu(ServiceLearning[] opps) {
		for (int i=0; i<opps.length; i++)
			System.out.printf("%d. %s (%x)\n", i+1, opps[i].toString(), opps[i].hashCode());

		System.out.println("==============================\n");
		System.out.print("Choose one: ");
	}
	
	public static void showExplanation(ServiceLearning sl) {
		System.out.printf("%s\n\n", sl.getExplanation());
	}

	public static void main(String[] args) {
		ServiceLearning[] opportunities = {
			new ServiceLearning("Hour of Code at Holmes", "Hour of code is a great way for kids to learn coding"),
			new ServiceLearning("Pack offices at Mobius Science Center", "We saw Sue, the T-Rex at Mobius"),
			new ServiceLearning("TA at Shadle Park HS", "There are great CS high school classes in Spokane, and getting students excited for coding is important"),
			new ServiceLearning("App for Toys for Tots", "Toys for Tots was having trouble managing their trucks")
		};
		int choice = 1;
		Scanner scan = new Scanner(System.in);
		while (choice > 0 && choice < opportunities.length) {
			menu(opportunities);
			choice = scan.nextInt();
			if (choice > 0 && choice <= opportunities.length)
				showExplanation(opportunities[choice-1]);
		}
		scan.close();
	}
}
