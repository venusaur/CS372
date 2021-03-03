import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.util.*;

//array list
public class QuoteMachine {

	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Quote Machine"); 
		Container c = new Container();
		frame.add(c); 

		frame.setVisible(true);
	}
	
	ArrayList<String> quotes = new ArrayList<String>();
	QuoteMachine(){
	    quotes.add("The best thinif you are wroby a bit. (Anonymous)");
	    quotes.add("(Louis Srygley)");
	    quotes.add("(Ralph Johnson)");
	    quotes.add("The best method  that boosts it by 9.8 m/s2. (Anonymous)");
	    quotes.add("ectory listing. (Oktal)");
	    quotes.add("If s, then the first wooroy civilization. (Gerald Weinberg)");
	    quotes.add("FordThere areonly the third one works. (Alan J. Perlis)");
	    quotes.add("Ready, fire, aim: the fast approach to software development. Ready, aim, aim, aim, aim: the slow approach to software development. (Anonymous)");
	    quotes.add("It’s not a bug - it’s an undocumented feature. (Anonymous)");
	    quotes.add("One man’s crappy  man’s full-time job. (Jessica Gaston)"); 
	
	}
public String QuoteReturn(int i) {
		return quotes.get(i); 
	}
}

