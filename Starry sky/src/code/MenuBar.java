package code;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class MenuBar extends JPanel{
	private static final long serialVersionUID = 1L;
	
	//コンポーネント
	JButton homeButton;
	JProgressBar timeLimitBar;
	JLabel homeLabel;
	JLabel scoreLabel;
	int initScore = 0;
	HomeButtonListener homeButtonListener;
	
	//コンストラクタ
	public MenuBar() {
		this.setBackground(Color.yellow);
		this.setLayout(null);
	}
	
	
	//コンストラクタの後に手動で呼び出す
	public void prepareComponents() {
		this.setBounds(0, 0, 1000, 50);
		
		//ホームボタン作成
		homeButton = new JButton();
		homeButton.setBounds(5, 5, 80, 30);
		homeButton.setText("HOME");
		homeButtonListener = new HomeButtonListener();
		homeButton.addActionListener(homeButtonListener);
		
		
		
		// プログレスバー作成
		timeLimitBar = new JProgressBar(0, 100);
		timeLimitBar.setBounds(400, 5, 300, 30);
		timeLimitBar.setForeground(Color.red);
		timeLimitBar.setStringPainted(false);
		
		//スコアラベル作成
		scoreLabel = new JLabel();
		scoreLabel.setBounds(800, 5, 150, 30);
		scoreLabel.setText("SCORE：" + initScore);
		
		
		// 設置
		this.add(homeButton);
		this.add(timeLimitBar);
		this.add(scoreLabel);
	}
	
	
	// 制限時間を表示
	public void actionPerformed(int time, int max) {
		timeLimitBar.setValue(time * 100 / max);
	}
	
	//内部クラス（ホームボタンリスナー）
	public class HomeButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
//			Main.mainWindow.gamePanel.backToTitleDialogue();
			Main.mainWindow.setFrontScreenAndFocus(ScreenMode.TITLE);
		
		}
	}
}
