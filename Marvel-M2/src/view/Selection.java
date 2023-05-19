package view;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Selection extends JPanel{
	JTextArea text;
	JPanel p;
	JPanel p3;
	JPanel p4;
	JPanel p5;
	public Selection(String name1,String name2) {
		setSize(800,800); 
		this.setLayout(null);
		
		p=new JPanel();
		p.setBounds(0,0,600,600);
		p.setLayout(new GridLayout(4,5));
		this.add(p);

		text=new JTextArea();
		text.setBounds(600,0,200,600);
		text.setEditable(false);
		this.add(text);

		p3=new JPanel();
		p3.setBounds(0,600,400,100);
		this.add(p3);
		
		p4=new JPanel();
		p4.setBounds(400,600,400,100);
		this.add(p4);
		
		JLabel l1=new JLabel();
		l1.setSize(40,40);
		l1.setText(name1+" 's Team");
		p3.add(l1);
		
		JLabel l2=new JLabel();
		l2.setSize(40,40);
		l2.setText(name2+" 's Team");
		p4.add(l2);
		
		p5=new JPanel();
		p5.setBounds(0,700,800,100);
		this.add(p5);
	}
	public JPanel getP5() {
		return p5;
	}
	public void setText(JTextArea text) {
		this.text = text;
	}
	public JPanel getP3() {
		return p3;
	}
	public JPanel getP4() {
		return p4;
	}
	public JTextArea getText() {
		return text;
	}
	public JPanel getP() {
		return p;
	}
}
