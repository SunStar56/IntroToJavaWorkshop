package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Hello, what's your name?");
	System.out.println("That's a good name, " + answer + ".  It has a nice ring to it.");
	JOptionPane.showMessageDialog(null), ("That's a good name, " + answer + "It has a nice ring to it.");
}
}
