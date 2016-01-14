import javax.swing.JOptionPane;

public class PotatoCounter {
	public static void main(String[] args) {
		for (int a = 0; a < 3; a++) {
			for (int i = 1; i < 8; i++) {
				JOptionPane.showMessageDialog(null, i);
				if (i == 4) {
				} else {
					JOptionPane.showMessageDialog(null, "Potato");
				}
				if (i == 7) {
					JOptionPane.showMessageDialog(null, "More!");
				}
			}
		}
	}
}

