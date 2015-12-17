import javax.swing.JOptionPane;
import java.util.Random;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.print(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			// 1. ask the user for a guess using a pop-up window, and save their
			// response
			String guess = JOptionPane.showInputDialog("Guess a number between 1-100.");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int number = Integer.parseInt(guess);
			// 5. if the guess is correct
			// 6. win
			if (number == random) {
				JOptionPane.showMessageDialog(null, "You guessed correct!");
				System.exit(0);
			}
			// 7. if the guess is high
			// 8. tell them it's too high
			else if (number > random) {
				JOptionPane.showMessageDialog(null, "Your guess was too high.");
			}
			// 9. if the guess is low
			// 10. tell them it's too low
			else if (number < random) {
				JOptionPane.showMessageDialog(null, "Your guess was too low.");
			} else {
				JOptionPane.showMessageDialog(null, "No.");
			}

			// 12. tell them they lose
			if (i == 10) {
				JOptionPane.showMessageDialog(null, "You lose!");
			}
		}

	}
}
