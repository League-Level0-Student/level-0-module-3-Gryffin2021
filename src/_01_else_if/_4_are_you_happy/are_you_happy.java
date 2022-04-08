package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {
	public static void main(String[] args) {

	String yesno = JOptionPane.showInputDialog(null,"Are you happy?");
	if(yesno.equals("yes")) {
		JOptionPane.showMessageDialog(null,"Keep doing what your doing");
		}else if(yesno.equals("no")) {
			String noyes = JOptionPane.showInputDialog(null,"Do you want to be happy?");
			if(noyes.equals("no")) {
				JOptionPane.showMessageDialog(null,"Keep doing what your doing");
			}else if(noyes.contentEquals("yes")) {
				JOptionPane.showMessageDialog(null,"Change something");
			}
		}
	}
}