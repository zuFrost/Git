package tryit;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;

public class Calculator {

    // Declare all calculator's components.
	JPanel windowContent, pan1, pan2, pan3, pan4, pan5;
	private JTextField displayField;
	JButton button0;
	JButton buttonNull;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonPoint;
	JButton buttonEqual;
//	JPanel windowContent;
	JButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide;

    public void setDisplayValue(String val){
        displayField.setText(val);
    }

    public String getDisplayValue() {
        return displayField.getText();
    } 
	
      // Constructor  creates the components
      // and adds the to the frame using combination of 
      // Borderlayout and Gridlayout

  Calculator(){

	  windowContent= new JPanel();

	 // Set the layout manager for this panel
	 BoxLayout yl = new BoxLayout(windowContent, BoxLayout.Y_AXIS);
	  
     windowContent.setLayout(yl);
     
       // Create the display field and place it in the   
       // From left to right

	  displayField = new JTextField(30);
	  displayField.setHorizontalAlignment(JTextField.RIGHT);
	  windowContent.add("North",displayField);

     // Create buttons using constructor of the  
     // class JButton that takes the label of the 
     // button as a parameter 

	  button0=new JButton("0");
	  buttonNull=new JButton("  ");
	  button1=new JButton("1");
	  button2=new JButton("2");
	  button3=new JButton("3");
	  button4=new JButton("4");
	  button5=new JButton("5");
	  button6=new JButton("6");
      button7=new JButton("7");
      button8=new JButton("8");
	  button9=new JButton("9");
	  buttonPoint = new JButton(".");
	  buttonEqual=new JButton("=");
	  buttonPlus = new JButton("+");
	  buttonMinus = new JButton("-");
	  buttonMultiply = new JButton("*");
	  buttonDivide = new JButton("/");
	  buttonEqual = new JButton("                    =                    ");

	 // Create the panel with the GridLayout with 12 buttons 
     //10 numeric ones, period, and the equal sign
	  // 1 2 3
	  // 4 5 6
	  // 7 8 9 
	  //   0 . 

	pan1 = new JPanel();  
	BoxLayout x1 = new BoxLayout(pan1, BoxLayout.X_AXIS);
	pan1.setLayout(x1);
	
	
	pan2 = new JPanel();  
	BoxLayout x2 = new BoxLayout(pan2, BoxLayout.X_AXIS);
	pan2.setLayout(x2);
	
	pan3 = new JPanel();  
	BoxLayout x3 = new BoxLayout(pan3, BoxLayout.X_AXIS);
	pan3.setLayout(x3);
	
	pan4 = new JPanel();  
	BoxLayout x4 = new BoxLayout(pan4, BoxLayout.X_AXIS);
	pan4.setLayout(x4);
	
	pan5 = new JPanel();  
	BoxLayout x5 = new BoxLayout(pan5, BoxLayout.X_AXIS);
	pan5.setLayout(x5);
	
	
	windowContent.add(pan1);
	windowContent.add(pan2);
	windowContent.add(pan3);
	windowContent.add(pan4);
	windowContent.add(pan5);
	

	 //  Add window controls to the panel p1
		pan1.add(button1);
		pan1.add(button2);
		pan1.add(button3);
		pan1.add(buttonDivide);
		pan2.add(button4);
		pan2.add(button5);
		pan2.add(button6);
		pan2.add(buttonMultiply);
		pan3.add(button7);
		pan3.add(button8);
		pan3.add(button9);
		pan3.add(buttonMinus);
		pan4.add(buttonNull);
		pan4.add(button0);
		pan4.add(buttonPoint);
		pan4.add(buttonPlus);
		
		//pan1.add(buttonNull);
		//pan2.add(buttonNull);
		//pan3.add(buttonNull);
		  
		  
		  
		  CalculatorEngine calcEngine = new CalculatorEngine(this);
		  button0.addActionListener(calcEngine);
		  button1.addActionListener(calcEngine);
		  button2.addActionListener(calcEngine);
		  button3.addActionListener(calcEngine);
		  button4.addActionListener(calcEngine);
		  button5.addActionListener(calcEngine);
		  button6.addActionListener(calcEngine);
		  button7.addActionListener(calcEngine);
		  button8.addActionListener(calcEngine);
		  button9.addActionListener(calcEngine);
		  buttonPoint.addActionListener(calcEngine);
		  buttonEqual.addActionListener(calcEngine);


	// Add the panel p1 to the center of the window				          
              // windowContent.add("Center",p1);
               
        // p2 = new JPanel();
        // GridLayout eastL =new GridLayout(4,1); 
		// p2.setLayout(gl);
		  
		 
		 
		 
		 
		 
		 
		 pan5.add(buttonEqual);
		 
		
		 
		 
		 
		 
		 buttonPlus.addActionListener(calcEngine);
		 buttonMinus.addActionListener(calcEngine);
		 buttonMultiply.addActionListener(calcEngine);
		 buttonDivide.addActionListener(calcEngine);
		 
		 //windowContent.add("East", p2);

	//Create the frame and set its content pane	               
       JFrame frame = new JFrame("Calculator");
	   frame.setContentPane(windowContent);

	 // Set the size of the window to be big enough to accommodate all controls 		
	   frame.pack(); 
	   
	  // enable the window's close button
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	  // Display the window
      frame.setVisible(true);
     }


     public static void main(String[] args) {

	  new Calculator();
     
     }
}
