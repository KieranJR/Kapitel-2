import javax.swing.*;

/* Vad? visar personens namn
	Vem av? Kieran
	När? 17:e September 2017
*/

public class usernamedisplay {
	public static void main (String[] arg) {
		String welcome;
		welcome = "Welcome";
		String message;
		message = welcome;
		message = message + " " + System.getProperty("user.name");
		JOptionPane.showMessageDialog(null, message);
	}
}