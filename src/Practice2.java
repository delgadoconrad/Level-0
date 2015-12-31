import java.net.URI;

import javax.swing.JOptionPane;
public class Practice2 {
	public static void main(String[] args) {
		String animal = JOptionPane.showInputDialog("What animal do you like?");
		if (animal.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Doge's go woofs!");
		}
		else if (animal.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Kittenz go meowz!");
		}
		else if (animal.equals("cow")) {
			JOptionPane.showMessageDialog(null, "Cowas go MOO!");
		}
		else if (animal.equals("magic")) {
			JOptionPane.showMessageDialog(null, "Magic = magic x3");
		}
		else {
			JOptionPane.showMessageDialog(null, "System error.  This computer will self destruct.  10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, BOOM!");
		}
		
	}
}