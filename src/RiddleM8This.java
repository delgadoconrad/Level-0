import javax.swing.JOptionPane;

public class RiddleM8This {

		public static void main(String[] args) {
			
			String correct = "Very good m8. Very good.";
			String incorrect = "You may have possibly failed m8. Possibly. Failed. Possibly.";
			// 1. Make a variable to hold the score
			int score = 0;
			// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
			String riddler = JOptionPane.showInputDialog("What word in the dictionary is spelled incorrectly?!?!???");
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if (riddler.equals("They are all spelled correctly, DUHDUHDUH!")){
			JOptionPane.showMessageDialog(null, correct);
			score = score+1;
			}
			// 5. Otherwise, say "wrong" and tell them the answer
			else {
				JOptionPane.showMessageDialog(null, incorrect);
			}
			// 6. Add some more riddles

			// 2. Make a pop up to show the score.
			JOptionPane.showMessageDialog(null, score);
		}
	}

































