package view;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JPanel;

public class Leaders extends JPanel {
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JLabel l1;
	JLabel l2;
	public Leaders() {
		setSize(800,800);
		this.setLayout(new BorderLayout());
		p1=new JPanel();
		this.add(p1,BorderLayout.WEST);
		p2=new JPanel();
		this.add(p2,BorderLayout.EAST);
		l1=new JLabel();
		l1.setSize(40,40);
		l1.setText("TEAM I");
		p1.add(l1);
		l2=new JLabel();
		l2.setSize(40,40);
		l2.setText("TEAM II");
		p2.add(l2);
		
		p3=new JPanel();
		this.add(p3,BorderLayout.CENTER);
	}
	public JPanel getP3() {
		return p3;
	}
	public void setP3(JPanel p3) {
		this.p3 = p3;
	}
	public JPanel getP1() {
		return p1;
	}
	public void setP1(JPanel p1) {
		this.p1 = p1;
	}
	public JPanel getP2() {
		return p2;
	}
	public void setP2(JPanel p2) {
		this.p2 = p2;
	}
}
