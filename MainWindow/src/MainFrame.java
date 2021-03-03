import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class MainFrame extends JComponent implements MouseMotionListener, ActionListener {
	private static final long serialVersionUID = 1L;
	
	int imageX, imageY; 
	Image image, imageField;
	
	
	JPanel _labels, _btns;
	JLabel _label;
	JButton _prev, _next;
	
	public MainFrame(Image iField) {
		imageField = iField; 
		addMouseMotionListener(this); 
	}


	public void mouseDragged(MouseEvent e) {
		imageX = e.getX();
		imageY = e.getY(); 
		repaint(); 
	}
	

	
	public void mouseMoved(MouseEvent e) {}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.drawImage(imageField, 0, 0, this);
		g2.drawImage(image, imageX, imageY, this); 
	}

	public static void main(String[] args) {
		String background = "background.jpg"; 
		Image imageBackground = Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource(background));
		JFrame frame = new JFrame("City"); 
		frame.add(new MainFrame(imageBackground)); 
		frame.setSize(642,542); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
		
	}

}