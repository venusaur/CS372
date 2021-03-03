import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 


@SuppressWarnings("serial")
public class Container extends JFrame implements ActionListener {

	JPanel buttons = new JPanel(), labels = new JPanel(); 
	JButton bAdd = new JButton("Next");
	JButton bBack = new JButton("Back");
	
	QuoteMachine qm = new QuoteMachine(); 
	
	int index = 0; 
	
	public Container() {
	
		setSize(600,900); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout()); 
		buttons.setLayout(new FlowLayout());
		labels.setLayout(new FlowLayout()); 
		add(labels);
		add(buttons);
		buttons.add(bAdd); 
		buttons.add(bBack); 
		
		
		
		bAdd.addActionListener(this);
	
		this.setVisible(true);
	
	}
	
	
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == bAdd) {
		String quote = String.format(qm.QuoteReturn(index + 1));
		labels.add(new JLabel(quote));
	}
	else if(e.getSource() == bBack) {
		String quote = String.format(qm.QuoteReturn(index - 1));
		labels.add(new JLabel(quote));
	}
		revalidate();
		repaint();
		
	} 
}
