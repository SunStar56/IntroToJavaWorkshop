package day3;


	import java.applet.AudioClip;

	import javax.swing.JApplet;
	import javax.swing.JOptionPane;

	public class DontForgetTheLyrics {
		/*
		 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
		 * 
		 * 1. To record a sound clip, open Audacity and record your song.
		 * 
		 * 2. Click File -> Export Audio, and save your file on the Desktop.
		 * 
		 * 3. Drag your file from the Desktop into the "default package" under "src".
		 */
		
		public static void main(String[] args) {
			// 4. Make a pop-up to explain the game.
			JOptionPane.showMessageDialog(null, "In order to play, you have to guess the following lyrics after the song ends.  Wait until the song has finished before you submit your response.");

			// 5. Use the playSound method to play your song.
	playSound("Silento.wav");
		
			// 6. Make a pop-up for the player to type their answer.
		String answer = JOptionPane.showInputDialog("What is the next verse?");
		 if (answer.equalsIgnoreCase("Now watch me whip")){
			 
			 JOptionPane.showMessageDialog(null, "congratulations, you answered correctly!");
			 
		 }else{
			 
			 
			 JOptionPane.showMessageDialog(null, "sorry, thats incorrect. the correct answer was: Now watch me whip");
			 
			 
		 }
		 playSound("Pink FLuffy Unicorns Dancing on Rainbows.wav");
			
			// 6. Make a pop-up for the player to type their answer.
		String answer3 = JOptionPane.showInputDialog("What is the next verse?");
		 if (answer3.equalsIgnoreCase("Rainbows")){
			 
			 JOptionPane.showMessageDialog(null, "congratulations, you answered correctly!");
			 
		 }else{
			 
			 
			 JOptionPane.showMessageDialog(null, "sorry, thats incorrect. the correct answer was: Rainbows.");
		 }
		 playSound("Fox.wav");
			
			// 6. Make a pop-up for the player to type their answer.
		String answer2 = JOptionPane.showInputDialog("What is the next verse?");
		 if (answer2.equalsIgnoreCase("Dog goes woof")){
			 
			 JOptionPane.showMessageDialog(null, "congratulations, you answered correctly!");
			 
		 }else{
			 
			 
			 JOptionPane.showMessageDialog(null, "sorry, thats incorrect. the correct answer was: Dog goes woof.");
		 }
		 playSound("UF.wav");
			
			// 6. Make a pop-up for the player to type their answer.
		String answer4 = JOptionPane.showInputDialog("What is the next verse?");
		 if (answer4.equalsIgnoreCase("just watch")){
			 
			 JOptionPane.showMessageDialog(null, "congratulations, you answered correctly!");
			 
		 }else{
			 
			 
			 JOptionPane.showMessageDialog(null, "sorry, thats incorrect. the correct answer was: just watch.");
		 }
		 playSound("PWH.wav");
			
			// 6. Make a pop-up for the player to type their answer.
		String answer5 = JOptionPane.showInputDialog("What is the next verse?");
		 if (answer5.equalsIgnoreCase("roof")){
			 
			 JOptionPane.showMessageDialog(null, "congratulations, you answered correctly!");
			 
		 }else{
			 
			 
			 JOptionPane.showMessageDialog(null, "sorry, thats incorrect. the correct answer was: roof.");
		 }
		 JOptionPane.showMessageDialog(null, "Great job, you completed the test!  Now go outside and do something.");
		 }
			 
	

		public static void playSound(String fileName) {
			AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
			audioClip.play();
		}
	}



