package classes;

import java.util.*;
import javax.swing.*;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range = 100;
        int maxAttempts = 10;
        int score = 0;
        
        Random rand = new Random();
        int numberToGuess = rand.nextInt(range) + 1;
                
        for (int i = 1; i <= maxAttempts; i++) {
            
            String guessString = JOptionPane.showInputDialog(null, "Guess the number (between 1 to " + range + ") " 
                                                             + "\n\n Attempts left: " + (maxAttempts - i + 1 + "\n\n"));
            int guess = Integer.parseInt(guessString);
            
            if (guess == numberToGuess) {
                JOptionPane.showMessageDialog(null, "Congratulations...\nYou guessed the number in " + i + " attempts!");
                score += (maxAttempts - i + 1); // add points based on the number of attempts
                break;
            } else if (guess < numberToGuess) {
                JOptionPane.showMessageDialog(null, "Your guess is too low.");
            } else {
                JOptionPane.showMessageDialog(null, "Your guess is too high.");
            }
        }
        
        JOptionPane.showMessageDialog(null, "Thank you for playing this game.\n\n          Your score is: " + score);
		
	}

}
