package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Names extends JPanel {
	JLabel l1;
	JLabel l2;
	public Names() {
		this.setSize(800,800);
		this.setLayout(null);
		l1=new JLabel();
		l1.setText("First Player's Name");
		l1.setBounds(10,20,300,25);
		this.add(l1);
		
		l2=new JLabel();
		l2.setText("Second Player's Name");
		l2.setBounds(10,60,300,25);
		this.add(l2);
		
		revalidate();
		repaint();
	}
}