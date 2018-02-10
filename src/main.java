import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class main {

	public static void main(String[] args) {
		
		frame mainFrame = new frame();		
		JPanel leftPanel = new JPanel();

		mainFrame.getContentPane().setLayout(null);
			
		//Main Frame settings
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(1000,750);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setTitle("Hobbyist");
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
	
		//Left Panel settings
		leftPanel.setBackground(Color.BLACK);
		leftPanel.setBounds(10,10, 150, 200);
		leftPanel.setLocation(1000, 100);
		

	
		mainFrame.getContentPane().add(leftPanel);
		
	
	}

	
		
	
}
