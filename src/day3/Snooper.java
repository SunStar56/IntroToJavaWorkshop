package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String Name = JOptionPane.showInputDialog("Hi!  This is just a survey to see who uses our services.  If you continue, you have a chance of winning a prize!  Let's start.  What is your name?");
	String State = JOptionPane.showInputDialog("What state do you live in?");
	String City = JOptionPane.showInputDialog("What city/town do you live in?");
	String PN = JOptionPane.showInputDialog("What's your phone number?  This is to ensure that if you win our raffle, you will recieve a phone call to win your prize!");
    JOptionPane.showMessageDialog (null,"Hello, " + Name + ".  I know that you live in " + City + ", " + State + ".  Your phone number is " + PN + ".  We have been watching, and we will hunt you down.  The only way to stop us is to [ERROR]");			
}
}
