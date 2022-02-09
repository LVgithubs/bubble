package site.metacoding.bubble.ex05;

import javax.swing.*;

public class Player extends JLabel{
	private int x;
	private int y;
	private ImageIcon playerR,playerL;
	
	
	private boolean isRight;
	private boolean isLeft;
	private boolean isJump;
	private final int JUMPSPEED=5;
	private final int SPEED=4;
	
	//get set�� ���� ������ �ʴ´�
public boolean isRight() {
		return isRight;
	}

	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}

	public boolean isLeft() {

		return isLeft;
	}

	public void setLeft(boolean isLeft) {
		this.isLeft = isLeft;
	}
	public boolean isJump() {
		return isJump;
	}

	public void setJump(boolean isJump) {
		this.isJump = isJump;
	}

public Player() {
	initObject();
	initSetting();

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
	//���� ������ �Ͼ�� �׸��� �ٽ� �׷��־�� �Ѵ�. 
	
	isRight=false;
	isLeft=false;
	isJump=false;
}

public void left() {
	isLeft = true;
	setIcon(playerL);
	new Thread(()->{
	while (isLeft) {
		x= x-SPEED;
		setLocation(x, y);
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}).start(); 
}
public void right() {
	isRight = true;
	setIcon(playerR);
	new Thread(()->{
		while (isRight) {
			x= x+SPEED;
			setLocation(x, y);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}).start();

}

public void jump() {
	isJump=true;
	
	new Thread(()->{
		for (int i = 0; i < 130 / JUMPSPEED; i++) {
			y = y - JUMPSPEED;
			setLocation(x, y);
			isJump = true; 

			try {
				Thread.sleep(5);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


		for (int i = 0; i < 130 / JUMPSPEED; i++) {
			y = y + JUMPSPEED;
			setLocation(x, y);

			try {
				Thread.sleep(3);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}).start();
	

	
}



}
