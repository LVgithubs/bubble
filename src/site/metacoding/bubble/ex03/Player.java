package site.metacoding.bubble.ex03;

import javax.swing.*;

public class Player extends JLabel{
	private int x;
	private int y;
	private ImageIcon playerR,playerL;
public Player() {
	initObject();
	initSetting();
	left();
	right();
}
 
private void initObject() {
	playerR= new ImageIcon("image/playerR.png");
	playerL= new ImageIcon("image/playerL.png");
}
private void initSetting() {
	x=70;
	y=535;
	setIcon(playerR);
	setSize(50,50);
	setLocation(x,y);
	//상태 변경이 일어나면 그림을 다시 그려주어야 한다. 
}

public void left() {
	x= x-10;
	setLocation(x, y);
	setIcon(playerL);
	
}
public void right() {
	x= x+10;
	setLocation(x, y);
	setIcon(playerR);
}

}
