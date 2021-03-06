package code;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel{
	//コンポーネント
	FieldPanel fieldPanel;
	MenuBar menuBar;
	BorderLayout layout = new BorderLayout();
	
	//フィールド
	public final int MAX_TIME = 6000;
	public int timeLeft = MAX_TIME;
	Timer timer;
	public int score = 0;
	
	
	//コンストラクタ
	public GamePanel() {
		this.setLayout(layout);
		this.setBackground(Color.cyan);
		//パネル生成と設置
		menuBar = new MenuBar();
		fieldPanel = new FieldPanel();
		this.add(menuBar);
		this.add(fieldPanel);
		
	}
	
	// コンストラクタが呼ばれた後に呼び出す
	public void prepareComponents() {
		fieldPanel.prepareComponents();
		menuBar.prepareComponents();
	}
	
	// タイマースタート
	public void timerStart() {
		timer = new Timer(1, taskPerformer);
		timer.start();
	}
	
	
	// タイマー用リスナー
	ActionListener taskPerformer = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(timeLeft == 0) {
				timer.stop();
				Main.mainWindow.setFrontScreenAndFocus(ScreenMode.TITLE);
//				Main.mainWindow.gamePanel.soundStop();
			}
			menuBar.actionPerformed(timeLeft, MAX_TIME);
			timeLeft--;
		}
	};
}
