package site.metacoding.bubble.ex04;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * @author 메타코딩
 * 목적 : 부드러운 좌 우 이동
 *  */
public class BubbleFrame extends JFrame {
	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
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
        setContentPane(backgroundMap); 
		player = new Player();
		add(player);
		
	}

    private void initListener() {
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("키보드 릴리즈");
                if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    // isRight를 false
                    player.setRight(false);
                }else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                    // isLeft를 false
                    player.setLeft(false);
            }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // 왼쪽 37, 오른쪽 39, 위쪽 38, 아래쪽 40
            	//키보드를 누르고 있는 동안 메서드를 한번만 실행할 것.
                System.out.println("키보드 프레스 :" + e.getKeyCode());

                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                 if(player.isRight()==false) {
                	 player.right();
                 }
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                	if(player.isLeft()==false)
                    player.left();
                } 
            
            }
        });
  
    }
	public static void main(String[] args) {
		new BubbleFrame();
	}


}
