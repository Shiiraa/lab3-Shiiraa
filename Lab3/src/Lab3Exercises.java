import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Alanis Y. Nazario");



		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(880, 380);
		myFrame.setSize(400, 180);
		myFrame.setVisible(true);


		MyPanelClass myPanel = new MyPanelClass();
		myFrame.getContentPane().add(myPanel);
	}
}
