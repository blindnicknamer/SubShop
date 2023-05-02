import javax.swing.*;

import java.awt.*;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.tools.Tool;

public class GUI extends JFrame {
	
	private ImageIcon image;
	private JLabel label, label2, label3;
	private JButton button;
	private JTextField text;
	private JTextArea area;
	
	public GUI() {
		
		setSize(1600,800);
		getContentPane().setBackground(Color.WHITE.darker());
		setTitle("High Rollers");
		setDefaultCloseOperation(EXIT_ON_CLOSE); //HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, DO_NOTHING_ON_CLOSE
		
		Container pane = this.getContentPane();
		
		//setIconImage(Toolkit.getDefaultToolkit().getImage()/images/hr_icon (1).png));
		
		image = new ImageIcon(getClass().getResource("/images/sub.png"));
		button = new JButton("Next");
		JCheckBox box = new JCheckBox("<html><font color='black'>White</font></html>");
		JCheckBox box2 = new JCheckBox("Wheat");
		
		label = new JLabel("");
		label3 = new JLabel("");
		label2 = new JLabel(image);
		
		label.setText("<html><font color='white'><br>High Rollers is played using a deck of cards and a 12-sided die.<br/>"
				+ "Operator will first ask for bets on if the roll of the die will be Higher, Lower, or the Same as the value of the card drawn<br/>"
				+ "(Aces are 1s, Kings are 13s).<br/>"
				+ "If a King is drawn, it is an automatic house win.<br/>"
				+ "If the values of the roll and the card are both 4 or fewer, it is an automatic player win if they bet on Higher or Lower.<br/>"
				+ "The game operator will roll the die, draw a playing card, and then determine the winners and losers of that round.<br/>"
				+ "It is a minimum bet of $10 for Higher or Lower and a minimum bet of $20 for Same.<br/>"
				+ "The payout for Higher or Lower is 1:1<br/>"
				+ "The payout for Same is 23:2</font></html>");
		label.setFont(new Font("Serif", Font.BOLD, 20));
		
		label3.setText("<html>. LT<html>");
		
		pane.setLayout(new FlowLayout());
		
		
		
		//pane.add(label,BorderLayout.NORTH);
		//pane.add(label2,BorderLayout.CENTER);
		//pane.add(label3,BorderLayout.SOUTH);
		
		pane.add(box);
		pane.add(box2);
		
		//button.setPreferredSize(new Dimension(50,50));
		
		pane.add(button);
		
		
		setVisible(true);
		
	}
	
	public String isChecked() {
		return "hi";
	}
	
	
	public static void main(String[]args) {
		
		Sandwich bob = new Sandwich("white", false, "ham", "chedder", "tomato", "UA");
		System.out.println(bob);
		
		GUI first = new GUI();
		
		//JOptionPane.showMessageDialog(first, "Welcome to High Rollers!\nBrought to you by Sam and Tyler");
		
		
		
		//JFrame frame = new JFrame("Input Dialog");
		
		//String name = JOptionPane.showInputDialog(frame, "Enter your name:");
		//JOptionPane.showMessageDialog(frame, "Hello "+name+"!");
		
		//int age = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter your age:"));
		//JOptionPane.showMessageDialog(frame, "You are "+age+"years old!");
	}
	
}