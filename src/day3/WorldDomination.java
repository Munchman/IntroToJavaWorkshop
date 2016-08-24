package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String Anser = JOptionPane.showInputDialog("Do you know how 2 write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (Anser.equals("Yes")) {
System.out.println("No you don't");
		}

		else {
			System.out.println("You will wash dishis the rest of your life");
		}

		// 3. Otherwise, wish them good luck washing dishes.

	}
}
