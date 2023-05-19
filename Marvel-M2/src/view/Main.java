package view;
import javax.swing.*;  
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import engine.Game;
import engine.Player;
import engine.PriorityQueue;
import exceptions.AbilityUseException;
import exceptions.ChampionDisarmedException;
import exceptions.InvalidTargetException;
import exceptions.LeaderAbilityAlreadyUsedException;
import exceptions.LeaderNotCurrentException;
import exceptions.NotEnoughResourcesException;
import exceptions.UnallowedMovementException;
import model.abilities.Ability;
import model.abilities.AreaOfEffect;
import model.world.Champion;
import model.world.Cover;
import model.world.Direction;
public class Main extends JFrame implements ActionListener{
	JButton viewbutton,next,championbutton,add,tmp,tmp2,chooseleader,letsstart;
	JButton button;
  	JButton button1;
  	JButton button2;
  	JButton button3;
  	JButton button4,select1,select2;
    JButton button5,a1,a0,a2;
    String WINNER="";
    boolean flagA;
   	JButton button6,buttonM,buttonCC,buttonA,buttonL,currentbutton,nextbutton;
	JPanel view,panel;
	Names view1;
	JButton Done;
	Coordinates view7;
	Ability a;
	ArrayList<Champion> champlist;
	ArrayList<JButton>maplist;
	JButton up ;
	JTextArea textArea;
	int x;
	int y;
	JPanel R;
	JButton down;
	JButton right;
	JButton left;
	Selection view2;
	boolean flag2;
	JButton c0,c1,c2,c3,c4,c00,c11,c22,c33,c44;
	Leaders view3;
	GameF view4;
	Directions view5;
	AbilitiesTypes view6;
	Champion c;
	WLF view9;
	JTextField text1,text2;
	String name1,name2;
	Game game;
	ArrayList<JButton> buttons,buttons1,buttons2,buttonAbilities;
	Champion cc;
	Player player1;
	Player player2;
	boolean Att=false;
	boolean mov = false;
	boolean cca=false;
	static int z=0;
    public Main(){
    	this.setLayout(new BorderLayout());
    	//this.setResizable(false);
    	this.setTitle("MARVEL");
    	this.setSize(800,800);
    	this.setVisible(true);
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	view=new JPanel();
    	view.setSize(800,800);
    	this.add(view);
    	viewbutton=new JButton();
    	viewbutton.setText("PRESS START");
    	viewbutton.addActionListener(this);
    	view.add(viewbutton);
    	view1=new Names();
    	text1=new JTextField();
    	text2=new JTextField();
    	next=new JButton();
    	buttons=new ArrayList<>();
    	add=new JButton();
    	tmp=new JButton();
    	textArea=new JTextArea();
    	cc=null;
    	flag2=true;
    	c0=new JButton();
    	c1=new JButton();
    	c2=new JButton();
    	c3=new JButton();
    	c4=new JButton();
    	c00=new JButton();
    	c11=new JButton();
    	c22=new JButton();
    	c33=new JButton();
    	c44=new JButton();
    	chooseleader=new JButton();
    	buttons1=new ArrayList<>();
    	buttons2=new ArrayList<>();
    	letsstart=new JButton();
    	panel=new JPanel();
    	Done = new JButton("DONE");
    	Done.setBackground(Color.CYAN);
    	view4 = new GameF(name1,name2);
    	maplist=new ArrayList<>();
    	currentbutton=new JButton();
    	nextbutton=new JButton();
    	view6=new AbilitiesTypes();
    	a1=new JButton();
    	a0=new JButton();
    	buttonAbilities=new ArrayList<>();
    	a2=new JButton();
    	c=null;
    	a=null;
    	champlist=new ArrayList<>();
    	x=0;y=0;
    	c0.setText("0");
		c0.setBackground(Color.BLUE);
		c0.addActionListener(this);
		c1.setText("1");
		c1.setBackground(Color.BLUE);
		c1.addActionListener(this);
		c2.setText("2");
		c2.setBackground(Color.BLUE);
		c2.addActionListener(this);
		c3.setText("3");
		c3.setBackground(Color.BLUE);
		c3.addActionListener(this);
		c4.setText("4");
		flagA=false;
		c4.setBackground(Color.BLUE);
		c4.addActionListener(this);
		c00.setText("0");
		c00.setBackground(Color.RED);
		c00.addActionListener(this);
		c11.setText("1");
		c11.setBackground(Color.RED);
		c11.addActionListener(this);
		c22.setText("2");
		c22.setBackground(Color.RED);
		c22.addActionListener(this);
		c33.setText("3");
		c33.setBackground(Color.RED);
		c33.addActionListener(this);
		c44.setText("4");
		c44.setBackground(Color.RED);
		c44.addActionListener(this);
		select1=new JButton("choose x-coordinate");
		select1.setBackground(Color.WHITE);
		select2=new JButton("choose y-coordinate");
		select2.setBackground(Color.WHITE);
		Done.addActionListener(this);
    	this.repaint();
    	this.validate();
    }
    public static void main (String[]args) {
    	new Main();
    }
	public void actionPerformed(ActionEvent e) {
		if(((JButton)e.getSource()).getText().equals("PRESS START")||((JButton)e.getSource()).getText().equals("START A NEW GAME")) {
			method1();
			return;
		}
		if(((JButton)e.getSource()).getText().equals("NEXT")) {
			try {
				method2();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
			return;
		}
		if(buttons.contains((JButton)e.getSource())) {
			method3(e);
			return;
		}
		if(((JButton)e.getSource()).getText().equals("ADD")) {
			method4(tmp,cc);
			return;
		}
		if(((JButton)e.getSource()).getText().equals("NOW CHOOSE YOUR LEADERS")) {
			method5();
			return;
		}
		if(buttons1.contains((JButton)e.getSource()) || buttons2.contains((JButton)e.getSource())) {
			method6(e);
			return;
		}
		if(((JButton)e.getSource()).getText().equals("LETS START")) {
			method10();
			return;
		}
		if(((JButton)e.getSource()).getText().equals("Attack")) {
			Att=true;
		    method8();
		    return;
		}
		if(((JButton)e.getSource()).getText().equals("Move")) {
		    mov=true;
		    method8();
		    return;
		}
		if(((JButton)e.getSource()).getText().equals("Cast Control Ability")) {
			cca=true;
			method11();
			return;
		}
		if(((JButton)e.getSource()).getText().equals("UP")) {
			method9("UP");
			return;
		}
		if(((JButton)e.getSource()).getText().equals("DOWN")) {
			method9("DOWN");
			return;
		}
		if(((JButton)e.getSource()).getText().equals("RIGHT")) {
			method9("RIGHT");
			return;
		}
		if(((JButton)e.getSource()).getText().equals("LEFT")) {
			method9("LEFT");
			return;
		}
		if(flagA) {
			int nn=buttonAbilities.indexOf((JButton)e.getSource());
			a=c.getAbilities().get(nn);
			if(a.getCastArea().name().equals("DIRECTIONAL")) {
				method8();
			}
			else if(a.getCastArea().name().equals("SINGLETARGET")) {
				method14();
			}
			else {
				method12();
			}
			flagA=false;
			return;
		}
		if(((JButton)e.getSource()).getText().equals("Use Leader Ability")) {
			try {
				game.useLeaderAbility();
				updateBoard();
				check();
			} catch (LeaderNotCurrentException | LeaderAbilityAlreadyUsedException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
			return;
		}
		if(((JButton)e.getSource())==c0) {
			x=0;
			turnoffx();
			return;
		}
		if(((JButton)e.getSource())==c1) {
			x=1;
			turnoffx();
			return;
		}
		if(((JButton)e.getSource())==c2) {
			x=2;
			turnoffx();
			return;
		}
		if(((JButton)e.getSource())==c3) {
			x=3;
			turnoffx();
			return;
		}
		if(((JButton)e.getSource())==c4) {
			x=4;
			turnoffx();
			return;
		}
		if(((JButton)e.getSource())==c00) {
			y=0;
			turnoffy();
			return;
		}
		if(((JButton)e.getSource())==c11) {
			y=1;
			turnoffy();
			return;
		}
		if(((JButton)e.getSource())==c22) {
			y=2;
			turnoffy();
			return;
		}
		if(((JButton)e.getSource())==c33) {
			y=3;
			turnoffy();
			return;
		}
		if(((JButton)e.getSource())==c44) {
			y=4;
			turnoffy();
			return;
		}
		if(((JButton)e.getSource()).getText().equals("DONE")) {
			//System.out.println(x);
			//System.out.println(y);
			method15();
			return;
		}
		if(maplist.contains((JButton)e.getSource())) {
			//updateBoard();
		    int r=maplist.indexOf((JButton)e.getSource());
		    Champion c=champlist.get(r);
		    String abilities="";
	    	abilities="CURRENT CHAMPION ABILITIES:";
	    	for(int i=0;i<game.getCurrentChampion().getAbilities().size();i++) {
		    	abilities+="\n"+game.getCurrentChampion().getAbilities().get(i).getName();
			}
	    	String abilities2="";
	    	if(c!=game.getCurrentChampion()) {
	    		abilities2="HIS ABILITIES :";
	 		    for(int i=0;i<c.getAbilities().size();i++) {
	 		    	abilities2+="\n"+c.getAbilities().get(i).getName();
	 		    }
	    	}
	    	
		    if(c==game.getCurrentChampion()) {
		    	textArea.setText("CURRENT CHAMPION :\n"+game.getCurrentChampion().toString()+"\n"+abilities);
		    	return;
		    }
		    textArea.setText("CURRENT CHAMPION :\n"+game.getCurrentChampion().toString()+"\n"+abilities+"\n\nSELECTED CHAMPION :\n"+c.toString()+"\n"+abilities2);
			return;
		}
		if(((JButton)e.getSource()).getText().equals("EXIT")) {
			this.setVisible(false);
		}
		if(((JButton)e.getSource()).getText().equals("End Turn")) {
			game.checkGameOver();
			if(game.getFinal()) {
				if(game.getFirstPlayer().getTeam()==null) {
					WINNER =game.getSecondPlayer().getName();
				}
				else {
					WINNER=game.getFirstPlayer().getName();
				}
				method13();
			}
			else {
				game.endTurn();
				updatePriority();
				updateBoard();
			}
		}
	}
	public void method1() {
		view.setVisible(false);
		this.add(view1);
		text1.setBounds(150,20,100,30);
		view1.add(text1);
		text2.setBounds(150,60,100,30);
		view1.add(text2);
		next.setBounds(10,100,100,30);
		next.setText("NEXT");
		next.addActionListener(this);
		view1.add(next);
		this.repaint();
    	this.validate();
	}
	public void method2() throws IOException {
		view1.setVisible(false);
		name1=text1.getText();
		name2=text2.getText();
		view2=new Selection(name1,name2);
		this.add(view2);
		player1=new Player(name1);
		player2=new Player(name2);
		game=new Game(player1,player2);
		Game.loadAbilities("Abilities.csv");
		Game.loadChampions("Champions.csv");
		for(int i=0;i<Game.getAvailableChampions().size();i++) {
			championbutton=new JButton();
			championbutton.setText(Game.getAvailableChampions().get(i).getName());
			championbutton.addActionListener(this);
			buttons.add(championbutton);
			view2.getP().add(championbutton);
		}
		add.setText("ADD");
		add.addActionListener(this);
		add.setForeground(Color.WHITE);
		add.setBackground(Color.BLUE);
		add.setBorder(BorderFactory.createEtchedBorder());
		view2.getP().add(add);
		chooseleader.setText("NOW CHOOSE YOUR LEADERS");
		chooseleader.addActionListener(this);
		chooseleader.setForeground(Color.WHITE);
		chooseleader.setBackground(Color.YELLOW);
		chooseleader.setBorder(BorderFactory.createEtchedBorder());
		view2.getP5().add(chooseleader);
	    chooseleader.setEnabled(false);
	    this.repaint();
    	this.validate();
	}
	public void method3(ActionEvent e) {
		tmp=(JButton)e.getSource();
		int n=buttons.indexOf(tmp);
	    cc=Game.getAvailableChampions().get(n);
	    String abilities="";
	    for(int i=0;i<cc.getAbilities().size();i++) {
	    	abilities+="\n"+cc.getAbilities().get(i).getName();
	    }
	    view2.getText().setText(cc.toString()+"\n\nHIS ABILITIES :"+abilities);
	    if(flag2==true) {
	    	 add.setEnabled(true);
	    }
	    this.repaint();
    	this.validate();
	}
	public void method4(JButton tmp,Champion cc) {
		tmp2=new JButton();
		if(player1.getTeam().size()<3) {
			player1.getTeam().add(cc);
			tmp2.setText(cc.getName());
			view2.getP3().add(tmp2);
		}
		else if(player2.getTeam().size()<3) {
        	player2.getTeam().add(cc);
        	tmp2.setText(cc.getName());
        	view2.getP4().add(tmp2);
		}
		if(player1.getTeam().size()==3 && player2.getTeam().size()==3) {
			chooseleader.setEnabled(true);
			flag2=false;
		}
		buttons.remove(tmp);
		Game.getAvailableChampions().remove(cc);
        tmp.setEnabled(false);
        add.setEnabled(false);
        this.repaint();
    	this.validate();
	}
	public void method5() {
		view2.setVisible(false);
		view3=new Leaders();
		this.add(view3);
		for(int i=0;!player1.getTeam().isEmpty() && i<3;i++) {
			JButton leaderselect=new JButton();
			leaderselect.setText(player1.getTeam().get(i).getName());
			leaderselect.addActionListener(this);
			view3.getP1().add(leaderselect);
			buttons1.add(leaderselect);
		}
		for(int i=0;!player2.getTeam().isEmpty() && i<3;i++) {
			JButton leaderselect=new JButton();
			leaderselect.setText(player2.getTeam().get(i).getName());
			leaderselect.addActionListener(this);
			view3.getP2().add(leaderselect);
			buttons2.add(leaderselect);
		}
		letsstart.setText("LETS START");
		letsstart.setEnabled(false);
		letsstart.addActionListener(this);
		view3.getP3().add(letsstart);
		this.repaint();
    	this.validate();
	}
	public void method6(ActionEvent e) {
		String name=((JButton)e.getSource()).getText();
		if(buttons1.contains((JButton)e.getSource())) {
			for(int i=0;i<3;i++) {
				if (player1.getTeam().get(i).getName()==name) {
					player1.setLeader(player1.getTeam().get(i));
					break;
				}
			}
			for(int i=0;i<3;i++) {
				buttons1.get(i).setEnabled(false);
			}
	
			z++;
		}
        if(buttons2.contains((JButton)e.getSource())) {
        	for(int i=0;i<3;i++) {
				if (player2.getTeam().get(i).getName()==name) {
					player2.setLeader(player2.getTeam().get(i));
					break;
				}
			}
			for(int i=0;i<3;i++) {
				buttons2.get(i).setEnabled(false);
			}
			z++;
		}
        if(z==2) {
        	letsstart.setEnabled(true);
        }
        this.repaint();
    	this.validate();
	}
	public void method7() {
		//game.placeChampions();
		//game.placeCovers();
		//game.prepareChampionTurns();
		cc = game.getCurrentChampion();
		view3.setVisible(false);
		this.add(view4);
		updateBoard();
		updatePriority();
	    buttonM = new JButton("Move");
	    buttonA = new JButton("Attack");
	    buttonCC = new JButton("Cast Control Ability");
	    buttonL = new JButton("Use Leader Ability");
	    buttonM.addActionListener(this);
	    buttonA.addActionListener(this);
	    buttonCC.addActionListener(this);
	    buttonL.addActionListener(this);
	     
	    JLabel myLabel = new JLabel(name2);
	    JLabel myLabel3 = new JLabel(name1);
	    myLabel.setForeground(new Color(220,0,0));
	    myLabel3.setForeground(new Color(0,0,180));
	    myLabel.setFont(new Font("Verdana",Font.PLAIN, 13));
	    myLabel3.setFont(new Font("Verdana",Font.PLAIN, 13));
	    myLabel.setBounds(390,1,70,70);
	    myLabel3.setBounds(390,640,70,70);
	    view4.add(myLabel);
	    view4.add(myLabel3);
	    JButton end = new JButton();
	    textArea.setEditable(false);
	    end.setText("End Turn");
	    end.setFont(new Font("Verdana",Font.PLAIN, 14));
	    end.setBackground(Color.RED);
	    end.setBounds(20,700,70,35);
	    end.addActionListener(this);
	    view4.add(end);
	    view4.getEast().setLayout(new BorderLayout());
	    view4.getEast().add(view4.getActions(),BorderLayout.SOUTH);
	    view4.getActions().add(buttonA);
	    view4.getActions().add(buttonM);
	    view4.getActions().add(buttonCC);
	    view4.getActions().add(buttonL);
	    view4.getActions().setLayout(new GridLayout(2,2));	        
	    view4.getEast().add(textArea,BorderLayout.CENTER);
	    this.repaint();
    	this.validate();
	}
	public void method8() {
		if(cca=true) {
			view6.setVisible(false);
		}
		if(Att==true || mov==true) {
			view4.setVisible(false);
		}
		view5 = new Directions();
		up = new JButton("UP");
		down = new JButton("DOWN");
		right = new JButton("RIGHT");
		left = new JButton("LEFT");
		up.setBounds(400,300,40,40);
		down.setBounds(400,350,40,40);
		right.setBounds(450,325,40,40);
		left.setBounds(360,325,40,40);
		up.addActionListener(this);
		down.addActionListener(this);
		right.addActionListener(this);
		left.addActionListener(this);
		view5.add(up);
		view5.add(down);
		view5.add(right);
		view5.add(left);
		this.add(view5);
		this.repaint();
    	this.validate();
	}
	public void method9(String s) {
		view5.setVisible(false);
		view4.setVisible(true);
		try {
		if(Att==true) {
			Att=false;
			switch (s){
			case "UP": 
				game.attack(Direction.UP);
				updateBoard();
				check();
				break;
			case "DOWN":
				game.attack(Direction.DOWN);
				updateBoard();
				check();
				break;
			case "RIGHT":
				game.attack(Direction.RIGHT);
				updateBoard();
				check();
				break;
			case "LEFT":
				game.attack(Direction.LEFT);
				updateBoard();
				check();
				break;
			}
		}
		else if(mov==true) {
			mov=false;
			switch (s){
			case "UP": 
				game.move(Direction.UP); 
				updateBoard();
				break;
			case "DOWN":
				game.move(Direction.DOWN);
				updateBoard();
				break;
			case "RIGHT":
				game.move(Direction.RIGHT);
				updateBoard();
				break;
			case "LEFT":
				game.move(Direction.LEFT);
				updateBoard();
				break;
			}
		}
		else if(cca==true) {
			cca=false;
			switch (s){
			case "UP": 
				game.castAbility(a,Direction.UP);
				updateBoard();
				check();
				break;
			case "DOWN":
				game.castAbility(a,Direction.DOWN);
				updateBoard();
				check();
				break;
			case "RIGHT":
				game.castAbility(a,Direction.RIGHT);
				updateBoard();
				check();
				break;
			case "LEFT":
				game.castAbility(a,Direction.LEFT);
				updateBoard();
				check();
				break;
			}
		}
		}
		 catch (NotEnoughResourcesException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			} catch (ChampionDisarmedException e1) {
				e1.printStackTrace();
			} catch (InvalidTargetException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			} catch (UnallowedMovementException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
			} catch (AbilityUseException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			} catch (CloneNotSupportedException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		this.revalidate();
		this.repaint();
	}
	public void method10() {
	  game.placeChampions();
	  game.placeCovers();
	 game.prepareChampionTurns();
	  method7();
	  this.repaint();
  	this.validate();
	}
	public void method11() {
		view4.setVisible(false);
		view6=new AbilitiesTypes();
	    c=game.getCurrentChampion();
	    String description="";
	    if(c.getAbilities().get(0) != null) {
	    	a0.setText(c.getAbilities().get(0).getName());
	    	a0.addActionListener(this);
	    	view6.getGrid().add(a0);
	    	description+=c.getAbilities().get(0).toString();
	    	buttonAbilities.add(a0);
	    	}
	    if(c.getAbilities().get(1) != null) {
	    	a1.setText(c.getAbilities().get(1).getName());
	    	a1.addActionListener(this);
	    	view6.getGrid().add(a1);
	    	description+=c.getAbilities().get(1).toString();
	    	buttonAbilities.add(a1);
	    }
	    if(c.getAbilities().get(2) != null) {
	    	a2.setText(c.getAbilities().get(2).getName());
	    	a2.addActionListener(this);
	    	view6.getGrid().add(a2);
	    	description+=c.getAbilities().get(2).toString();
	    	buttonAbilities.add(a2);
	    }
	    view6.getArea().setText(description);
	    flagA=true;
	    this.add(view6);
	}
	public void method12() {
		view6.setVisible(false);
		view4.setVisible(true);
		cca=false;
		try {
			game.castAbility(a);
			updateBoard();
			check();
		} catch (NotEnoughResourcesException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (AbilityUseException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (CloneNotSupportedException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	public void method13() {
		view4.setVisible(false);
		view9 = new WLF();
		JLabel myLabel = new JLabel();
		myLabel.setText(WINNER+" WONNNNNN!!!");
		myLabel.setFont(new Font("Verdana",Font.PLAIN, 30));
		view9.add(myLabel);
		JButton exit = new JButton();
		exit.setBackground(Color.RED);
		exit.setText("EXIT");
		exit.setFont(new Font("Verdana",Font.PLAIN, 18));
		exit.addActionListener(this);
		view9.add(exit);
		this.add(view9);
		this.repaint();
    	this.validate();
	}
	public void method14() {
		view6.setVisible(false);
		view7=new Coordinates();
		c0.setEnabled(true);
		c1.setEnabled(true);
		c2.setEnabled(true);
		c3.setEnabled(true);
		c4.setEnabled(true);
		select1.setEnabled(true);
		c00.setEnabled(true);
		c11.setEnabled(true);
		c22.setEnabled(true);
		c33.setEnabled(true);
		c44.setEnabled(true);
		select2.setEnabled(true);
		Done.setEnabled(true);
		view7.add(select1);
		view7.add(select2);
		view7.add(c0);
		view7.add(c00);
		view7.add(c1);
		view7.add(c11);
		view7.add(c2);
		view7.add(c22);
		view7.add(c3);
		view7.add(c33);
		view7.add(c4);
		view7.add(c44);
		view7.add(Done);
		add(view7);
	}
	public void method15() {
		Done.setEnabled(false);
		view7.setVisible(false);
		view4.setVisible(true);
		cca=false;
		try {
			game.castAbility(a, x, y);
			updateBoard();
			check();
		} catch (NotEnoughResourcesException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (AbilityUseException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (InvalidTargetException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (CloneNotSupportedException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	public void updateBoard() {
		view4.getBoard().removeAll();
		JButton[][]map=new JButton[5][5];
		for(int i=4;i>=0;i--) {
			for(int j=0;j<5;j++) {
				JButton a=new JButton();
				if((i==0 && j==0) || (i==0 && j==4) || (i==4 && j==0) || (i==4 && j==4)) {
				  	a.setBackground(Color.BLACK);
				  	a.addActionListener(this);
					map[i][j] = a;
					view4.getBoard().add(a);
					continue;
				}
				if(game.getBoard()[i][j] instanceof Champion) {
					a.setText(((Champion)game.getBoard()[i][j]).getName());
					if(((Champion)game.getBoard()[i][j])==game.getCurrentChampion()) {
						a.setBackground(Color.GREEN);
					}
					else {
					a.setBackground(Color.RED);
					}
					a.addActionListener(this);
					map[i][j] = a;
					view4.getBoard().add(a);
					champlist.add((Champion)game.getBoard()[i][j]);
					maplist.add(a);
					continue;
				}
				else if(game.getBoard()[i][j] instanceof Cover) {
					String s=((Cover)game.getBoard()[i][j]).getCurrentHP()+"HP";
					a.setText("Cover \n"+s);
				}
			    a.setBackground(Color.WHITE);
				a.addActionListener(this);
				map[i][j] = a;
				view4.getBoard().add(a);
			}
		}
		this.repaint();
    	this.validate();
	}
	public void turnoffx() {
		c0.setEnabled(false);
		c1.setEnabled(false);
		c2.setEnabled(false);
		c3.setEnabled(false);
		c4.setEnabled(false);
		select1.setEnabled(false);
	}
	public void turnoffy() {
		c00.setEnabled(false);
		c11.setEnabled(false);
		c22.setEnabled(false);
		c33.setEnabled(false);
		c44.setEnabled(false);
		select2.setEnabled(false);
	}
	public void check() {
		game.checkGameOver();
		if(game.getFinal()) {
			if(game.getFirstPlayer().getTeam()==null) {
				WINNER =game.getSecondPlayer().getName();
			}
			else {
				WINNER=game.getFirstPlayer().getName();
			}
			method13();
		}
	}
	public void updatePriority() {
		view4.queue.removeAll();
		PriorityQueue n=new PriorityQueue(6);
		int size=game.getTurnOrder().size();
		for(int i=0;i<size;i++) {
			n.insert(game.getTurnOrder().remove());
		}
		for(int i=0;i<size;i++) {
			JButton b=new JButton();
			if(i==0) {
				b.setBackground(Color.green);
			}
			b.setText(((Champion)n.peekMin()).getName());
			view4.queue.add(b);
			game.getTurnOrder().insert(n.remove());
		}
	}
}

