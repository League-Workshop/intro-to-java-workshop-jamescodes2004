package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score;
		score=0;
	String word;
	word=JOptionPane.showInputDialog("What is the capital of Washington?");
	
		// 2.  Ask the user a question 
		
		// 3.  Use an if statement to check if their answer is correct
		if(word.equalsIgnoreCase("Olympia")) {
			JOptionPane.showMessageDialog(null, "That is correct, you have earned one point.");}
		else {
			JOptionPane.showMessageDialog(null, "That is incorrect, you did not get the point");
		}
		// 4.  if the user's answer is correct
		if(word.equalsIgnoreCase("Olympia")) {
score=score+1;
		}
		String two;
		two=JOptionPane.showInputDialog("Who invented the modern electrical lightbulb?");
		
			// 2.  Ask the user a question 
			
			// 3.  Use an if statement to check if their answer is correct
			if(two.equalsIgnoreCase("Thomas Edison")) {
				JOptionPane.showMessageDialog(null, "Yep.");}
			else {
				JOptionPane.showMessageDialog(null, "No you dimwit!");
			}
			// 4.  if the user's answer is correct
			if(two.equalsIgnoreCase("Thomas Edison")) {
	score=score+1;
			}
			String three;
			three=JOptionPane.showInputDialog("Does Protein provide energy for your body?");
			
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				if(three.equalsIgnoreCase("No")) {
					JOptionPane.showMessageDialog(null, "Yes, great job.");}
				else {
					JOptionPane.showMessageDialog(null, "Not at all!");
				}
				// 4.  if the user's answer is correct
				if(three.equalsIgnoreCase("No")) {
		score=score+1;
				}
				String four;
				four=JOptionPane.showInputDialog("Which country was blamed for the first world war?");
				
					// 2.  Ask the user a question 
					
					// 3.  Use an if statement to check if their answer is correct
					if(four.equalsIgnoreCase("Germany")) {
						JOptionPane.showMessageDialog(null, "You are killing it!");}
					else {
						JOptionPane.showMessageDialog(null, "Common, don't be unintelligent.");
					}
					// 4.  if the user's answer is correct
					if(four.equalsIgnoreCase("Germany")) {
			score=score+1;
					}
	JOptionPane.showMessageDialog(null, "Your end score is " + score);
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
