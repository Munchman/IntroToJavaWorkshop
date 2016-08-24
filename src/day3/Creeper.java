package day3;

import javax.swing.JOptionPane;

public class Creeper {
public static void main(String[] args) {
	String creeper = JOptionPane.showInputDialog("What is your password?");
	String stalker = JOptionPane.showInputDialog("What is your name?"); 
String snooper = JOptionPane.showInputDialog("How old are you freind?");
JOptionPane.showMessageDialog(null, "I know your password is "+ creeper);
JOptionPane.showMessageDialog(null, "I know your name is "+ stalker);
JOptionPane.showMessageDialog(null, "I know your age is "+ snooper);





}
}
