import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryconverter implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField textfield;
	
	
public static void main(String[] args) {
	new binaryconverter().createUI();
	
	
}
void createUI(){
	frame=new JFrame();
	panel=new JPanel();
	button=new JButton("convert");
	textfield =new JTextField(25);
	
	frame.add(panel);
	panel.add(textfield);
	panel.add(button);
	
	
	button.addActionListener(this);
	frame.pack();
	frame.setVisible(true);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	String a= textfield.getText();
	 String b = convert(a);
	 textfield.setText(b);
	 
	
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }

	
	
	
}
}
