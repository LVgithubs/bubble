package site.metacoding.bubble.ex02;

import javax.swing.*;

public class Player extends JLabel{
	private int x;
	private int y;
	private ImageIcon playerR;
public Player() {
	initObject();
	initSetting();
}

private void initObject() {
	playerR= new ImageIcon("image/playerR.png");
}
private void initSetting() {
	x=70;
	y=535;
	setIcon(playerR);
	setSize(50,50);
	setLocation(x,y);
	//상태 변경이 일어나면 그림을 다시 그려주어야 한다. 
}
}
