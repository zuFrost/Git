package tryit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HW extends JFrame {

	public HW() {
		setSize(200,300);
		setTitle("Hello World");
		setVisible(true);
		
		//adding a button
		JButton myButton = new JButton ("Click me");
		add(myButton);
		pack();

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HW();

	}

}
