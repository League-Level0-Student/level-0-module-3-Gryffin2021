package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Welcome to choose_your_own_adventure_book.java!");
		JOptionPane.showMessageDialog(null,"In this you will choose 1 of _ options on each question");
		JOptionPane.showMessageDialog(null,"For example: Do you want to ____ (Option 1, Option 2)");
		JOptionPane.showMessageDialog(null,"Now, lets get started!");
		JOptionPane.showMessageDialog(null,"Wait! One more thing...");
		String name = JOptionPane.showInputDialog(null,"What is your name?");
		JOptionPane.showMessageDialog(null,"You are the impostor, " + name);
		JOptionPane.showMessageDialog(null,"Your mission is to kill the crewmates.");
		JOptionPane.showMessageDialog(null,"You can not fail.");
		JOptionPane.showMessageDialog(null,"Your people's survival depends on you, "+ name);
		JOptionPane.showMessageDialog(null,"You wake up from the evacution of the 'Document'. There is one crewmate still in storage, where everyone slept. Via his name tag you see his name is 'Blue'");
		String killblue = JOptionPane.showInputDialog(null,"What will you do? (kill, spare)");
		if(killblue.equals("kill")) {
			JOptionPane.showMessageDialog(null,"You kill Blue.");
			JOptionPane.showMessageDialog(null,"You decide it's time to get moving.");
			String local1 = JOptionPane.showInputDialog(null,"Where will you go? (Cafeteria, Security)");
		}
			if(killblue.equals("spare")) {
				JOptionPane.showMessageDialog(null,"You know it's dishonorable to kill an sleeping enemy. Besides, you can always kill him later.");
				JOptionPane.showMessageDialog(null,"You spare Blue.");
			}
	
		}
	}

