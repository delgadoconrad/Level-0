import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtracktoLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What moood are you in?.", "Moodometer2000", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "Mad", "Stressed" }, null);

		// 2. Their answer is stored in the userMood variable. Print it out.
		System.out.print(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a
		// calming song from YouTube.
		if (userMood == 2) { // Mad
			playVideo("https://www.youtube.com/watch?v=Sv0LwXYAVVg");
		}
		// 4. Play different songs for other moods.
		else if (userMood == 1) { // Sad
			playVideo("https://www.youtube.com/watch?v=hLQl3WQQoQ0");
		} 
		else if (userMood == 0) { // Happy
			playVideo("https://www.youtube.com/watch?v=y6Sxv-sUYtM");
		} 
		else if (userMood == 3) {
			playVideo("https://www.youtube.com/watch?v=CCaTi1Rf9uo");
		}
		// If you are seeing ads at the beginning of your videos, install
		// Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * If you can’t think of any, here are some you can use...
 * bit.ly/video-for-happy bit.ly/video-for-sad bit.ly/video-for-angry
 **/
