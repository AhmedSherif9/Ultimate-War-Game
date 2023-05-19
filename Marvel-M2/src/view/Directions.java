package view;
import javax.swing.*;
import java.awt.*;
public class Directions extends JPanel {
   JPanel D;
   public Directions() {
	   super();
	   JLabel myLabel = new JLabel("CHOOSE YOUR DIRECTION"); 
	   myLabel.setFont(new Font("Verdana",Font.PLAIN, 18));
	   myLabel.setBounds(0,0,40,40);
	   add(myLabel);
   }
   public JPanel getDirection() {
	   return D;
   }
}
