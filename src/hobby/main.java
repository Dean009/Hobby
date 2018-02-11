package hobby;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class main extends JFrame implements ActionListener{
	
	private final static int WIDTH = 1200, HEIGHT = 850;
	
	public static void main(String[] args) {		
		createGUI();
	}
	
	public static void createGUI() {
		
		JFrame frame1 = new JFrame("Hobbyist");		
		frame1.setLayout(null);
		frame1.setSize(WIDTH, HEIGHT); 
		frame1.setResizable(false);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setBackground(Color.GRAY);
		frame1.setVisible(true);
				
		JPanel panelBot = new JPanel(new BorderLayout());	
		panelBot.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		panelBot.setPreferredSize(frame1.getSize());
		panelBot.setBackground(Color.GRAY.darker());		
		panelBot.setVisible(true);
			
		JButton homeButton = new JButton("Home");
		homeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panelBot.add(homeButton, BorderLayout.PAGE_START);
		
		
		
		frame1.setContentPane(panelBot);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}





}
