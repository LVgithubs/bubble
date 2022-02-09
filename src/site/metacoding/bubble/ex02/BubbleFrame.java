package site.metacoding.bubble.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * @author 메타코딩
 * 화면에 띄울 것
 *  */
public class BubbleFrame extends JFrame{
	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrame() {
		initObject();
		initSetting();
		setVisible(true); //내부에 paintComponent()호출 코드가 있다
		
	}

	//new 하는것
	private void initSetting() {
		// TODO Auto-generated method stub
		setSize(1000,640);
		//getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initObject() {
		// TODO Auto-generated method stub
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		add(backgroundMap);
		player = new Player();
		add(player);
		
	}

}
