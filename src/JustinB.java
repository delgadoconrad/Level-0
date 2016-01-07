import javax.swing.JOptionPane;

public class JustinB {
	public static void main(String[] args) {
		for (int a = 0; a < 2; a++) {
			for (int i = 0; i < 3; i++) {
				JOptionPane.showMessageDialog(null, "Baby");
			}
			if (a == 0) {
				JOptionPane.showMessageDialog(null, "Oh!");
			}
			else if (a == 1) {
			JOptionPane.showMessageDialog(null, "No!");	
			}
		}
		JOptionPane.showMessageDialog(null, "Thought you'd always be mine!");
	}
}

