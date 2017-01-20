package Guessinggame;

import javax.swing.JOptionPane;
/**
 * This class is use to show dialog box
 * @author Patcharapol Nirunpornputta
 *
 */
public class Dialog {
	private String message;
	private String title;
	private String type;
	String title = "Guessing Game";
	message = "Play again?";
	type = JOptionPane.YES_NO_OPTION;
	int opt = JOptionPane.showConfirmDialog(null, message, title, type);


}
