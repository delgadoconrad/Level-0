import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Animal {

	Animal() {
		/*
		 * 1. Ask the user which animal they want, then don't play the sound of that
		 * animal.
		 */
		for (int i = 0; i < 50; i++) {
		
		String animal;
		String nonono = "That animal isn't cool enough.  m8m8m8m8m8m8m8m8m8m8m8m8m8m8m8m8m8m8m8m8m8";

		animal = JOptionPane.showInputDialog("Type a certain animal's name.");
		
		if(animal.equals("cow")){
		playMoo();
		}
		else if(animal.equals("dog")){
		playWoof();
		}
		else if(animal.equals("llama")){
		playLlama();
		}
		else if (animal.equals("cat")){
		playMeow();
		}
		else if (animal.equals("duck")){
			playQuack();
			}
		else{
		JOptionPane.showMessageDialog(null, nonono);	
		}
	}
			
		/* 2. Make it so that the user can keep entering new animals. */
		
		
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playMeow() {
		playNoise(meowFile);
	}
	void playQuack() {
		playNoise(quackFile);
	}

	String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new Animal();
	}

}
