
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int Bob = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(Bob);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Enter a question");
	// 5. If the random number is 0
if(Bob == 0){
	JOptionPane.showMessageDialog(null, "Yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if(Bob == 1){
	JOptionPane.showMessageDialog(null, "No");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if(Bob == 2){
	JOptionPane.showInputDialog("Maybe you should ask Google.");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if(Bob == 3){
	JOptionPane.showInputDialog("Stop talking please your hurting me!");
}
	// -- write your own answer

}}


