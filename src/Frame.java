

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
	
	public Frame() {
		this.setTitle("Shapes");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setAlwaysOnTop(true);
		
		JPanel pan = new JPanel();
		
		
		
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
