package view;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;

public class AbilitiesTypes extends JPanel{
	JPanel grid;
	JTextArea area;
	public AbilitiesTypes() {
		setSize(800,800);
		setLayout(new BorderLayout());
		grid=new JPanel();
		grid.setLayout(new GridLayout(3,1));
		area=new JTextArea();
		area.setEditable(false);
		add(area,BorderLayout.EAST);
		add(grid,BorderLayout.CENTER);
	}
	public JPanel getGrid() {
		return grid;
	}
	public JTextArea getArea() {
		return area;
	}
}
