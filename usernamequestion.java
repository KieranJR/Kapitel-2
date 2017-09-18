import javax.swing.*;


/* Vad? personen skriver sitt namn och ska visas
	Vem av? Kieran
	När? 17:e September 2017
*/

public class usernamequestion {
	public static void main (String[] arg) {
		String name;
		String welcome;
		name = JOptionPane.showInputDialog("What's your name?");
		welcome = "Welcome " + name;
		JOptionPane.showMessageDialog(null, welcome);
	}
}