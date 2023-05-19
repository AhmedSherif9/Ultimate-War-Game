package view;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import engine.Game;
import javax.swing.*;
import java.awt.*;
public class GameF extends JPanel{
   JPanel E;
   JPanel B;
   JPanel C;
   JPanel queue;
   public GameF(String name1,String name2) {
	super();
	setVisible(true);
	setLayout(null);
	setSize(800,800);
	E = new JPanel();
    B = new JPanel();
    C = new JPanel();
    E.setLayout(new BorderLayout());
    E.setBounds(600,80,200,550);
    C.setBounds(20,80,550,550);
    C.setLayout(new GridLayout(5,5));
    add(E,BorderLayout.EAST);
    queue=new JPanel();
    queue.setLayout(new GridLayout(1,6));
    queue.setBounds(105,690,680,50);
    add(queue);
    add(C);
   }
   public JPanel getEast() {
	   return E;
   }
   public JPanel getActions() {
	   return B;
   }
   public JPanel getBoard() {
	   return C;
   }
   
}
