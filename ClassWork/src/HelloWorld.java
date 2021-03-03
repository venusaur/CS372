import javax.swing.*;

public class HelloWorld {
	public static void main(String [] args) {
		JFrame frame = new JFrame("hehe"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Hello World!", JLabel.CENTER); 
		frame.add(label); 
		frame.setSize(300, 600);
		frame.setVisible(true); 
		
		JButton b = new JButton("heheheehe"); 
		b.setBounds(130,100,100,40);
		frame.add(b); 
		
	}
}
