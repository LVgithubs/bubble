package site.metacoding.bubble.ex03;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * @author ��Ÿ�ڵ�
 * ���� : ĳ���� �� �� �̵�
 * �� , Ű���� �����ʰ� �ʿ��ϴ�.
 *  */
public class BubbleFrame extends JFrame {
	private JLabel backgroundMap;
	private Player player;
	
	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
		setVisible(true); //���ο� paintComponent()ȣ�� �ڵ尡 �ִ�
		
	}

	//new �ϴ°�
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
                System.out.println("Ű���� ������");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // ���� 37, ������ 39, ���� 38, �Ʒ��� 40
                System.out.println("Ű���� ������ :" + e.getKeyCode());

                if (e.getKeyCode() == 39) {
                    player.right();
                } else if (e.getKeyCode() == 37) {
                    player.left();
                }
            }
        });
    }
	public static void main(String[] args) {
		new BubbleFrame();
	}


}
