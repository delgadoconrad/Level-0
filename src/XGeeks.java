
	// Copyright Wintriss Technical Schools 2014
	import javax.swing.JOptionPane;

	/*
	 * Everyone has a superpower. Mine is writing recipes. This program will store
	 * the superpowers of all the people in the classroom. E.g. When I type "June",
	 * your program should say "June's superpower is writing recipies".
	 */
	public class XGeeks {
	public static void main(String[] args) {

			// 1. Save the superpower for each person in a variable.
		String conradPower = "super speed";
		String ariaPower = "Invisibility";
		String lucasPower = "ghost ability";
		String chloePower = "shapeshifting";
		String caseyPower = "doing nothing";
		String jamesPower = "James is a banana";
		String betsyPower = "drinking tea";
		String noNamenoPower = "This name is not real.  Illuminati.";
			// 2. Ask the user to enter a name. Store their answer in a variable.
	String name = JOptionPane.showInputDialog("Enter a name!!!");
	if (name.equals("conrad")){
	JOptionPane.showMessageDialog(null, conradPower);
	}
	else if (name.equals("aria")){
		JOptionPane.showMessageDialog(null, ariaPower);
	}
	else if (name.equals("lucas")){
		JOptionPane.showMessageDialog(null, lucasPower);
	}
	else if (name.equals("chloe")){
		JOptionPane.showMessageDialog(null, chloePower);
	}
	else if (name.equals("casey")){
		JOptionPane.showMessageDialog(null, caseyPower);
	}
	else if (name.equals("james")){
		JOptionPane.showMessageDialog(null, jamesPower);
	}
	else if (name.equals("betsy")){
		JOptionPane.showMessageDialog(null, betsyPower);
	}
	else{
		JOptionPane.showMessageDialog(null, noNamenoPower);
	}
			// 3. Show the superpower in a pop-up, depending on the name entered. 

		}
	}


