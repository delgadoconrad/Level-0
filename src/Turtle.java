//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Turtle {
	public static void main(String[] args) {
for (int i = 0; i < 1000; i++) {
	
		String color;
		//3. ask the user what color they would like the tortoise to draw
		color = JOptionPane.showInputDialog("Pick a color.");
		//4. use an if/else statement to set the pen color that the user requested
		if(color.equals("red")){
		Tortoise.setPenColor(Color.red);
		}
		else if(color.equals("blue")){
		Tortoise.setPenColor(Color.blue);
		}
		else if(color.equals("green")){
		Tortoise.setPenColor(Color.green);
		}
		else if(color.equals("black")){
		Tortoise.setPenColor(Color.black);
		}
		else if(color.equals("white")){
		Tortoise.setPenColor(Color.white);
		}
		else if(color.equals("yellow")){
		Tortoise.setPenColor(Color.yellow);
		}
		else if(color.equals("orange")){
		Tortoise.setPenColor(Color.orange);
		}
		else if(color.equals("pink")){
		Tortoise.setPenColor(Color.pink);
		}
		else if(color.equals("cyan")){
		Tortoise.setPenColor(Color.cyan);
		}
		else if(color.equals("magenta")){
		Tortoise.setPenColor(Color.magenta);
		}

//5. if the user doesn’t enter anything, choose a random color
		else{
		Tortoise.setPenColor(Colors.getRandomColor());
		}
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(10);
		Tortoise.setSpeed(10);
	//1. make the tortoise draw a shape (this will take more than one line of code)
	for (int a = 0; a < 360; a++) {	
	Tortoise.move(1);
	Tortoise.turn(1);
	}
	Tortoise.turn(360/4
			);
}
}
}
