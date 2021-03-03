import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloComponetTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("hello");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HelloComponent hc = new HelloComponent();
		frame.add(hc);
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
}

class HelloComponent extends javax.swing.JComponent implements MouseMotionListener, ActionListener{
	int x = 125, y = 95; 
	int colorIndex; 
	String msg; 
	
	
	static Color[] colors = {Color.black, Color.magenta, Color.green}; 
	
	JButton button; 
	JTextField txt; 
	
	
	HelloComponent(){
		button = new JButton("Change Color"); 
		setLayout(new FlowLayout()); 
		add(button); 
		
		msg = "CS372"; 
		txt = new JTextField(20); 
		add(txt); 
		
		button.addActionListener(this);
		addMouseMotionListener(this);
	}
	
	
	private Color currentColor() { return colors[colorIndex];}
	
	
	public void paintComponet(Graphics g) {
		setForeground(currentColor()); 
		g.drawString("Hehe", 125, 95);
	}
	
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
		repaint(); 
	}

	
	public void mouseMoved(MouseEvent e) {}
	
	public void actionPreformed(ActionEvent e) {
		if(e.getSource() == button) {
			if(txt.getText().length() > 0) {
				msg = txt.getText(); 
				
			}
			colorIndex = (colorIndex + 1) % colors.length;
			repaint(); 
		}
	}

}
