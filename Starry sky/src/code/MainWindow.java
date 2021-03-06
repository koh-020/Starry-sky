package code;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	//フィールド
	ScreenMode screenMode = ScreenMode.TITLE;
	//定数
	final int WIDTH = 1000;
	final int HEIGHT = 800;
	//レイアウト
	CardLayout layout = new CardLayout();
	//コンポーネント
	TitlePanel titlePanel;
	GamePanel gamePanel;
	
	//コンストラクタ
	MainWindow() {
		//ウィンドウ左上のアイコンとタイトル
		this.setTitle("Starry sky");
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("./images/space_bouenkyou.png"));
		this.setIconImage(icon.getImage());

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);  //画面サイズの変更を禁止
		this.getContentPane().setBackground(Color.green);  //背景色
		this.setLayout(layout);  //紙芝居のように設定
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));  //サイズ設定
		this.pack();  //自動サイズ調整
		this.setLocationRelativeTo(null);  //自動時のスクリーンの位置を中央に（packより後で呼ぶ）

	}
	
	//メソッド
	//	コンストラクタが呼ばれた後メインメソッドから最初に手動で呼び出す
	public void preparePanels() {
		//		パネルの準備
		titlePanel = new TitlePanel();
		this.add(titlePanel, "メイン画面");
		gamePanel = new GamePanel();
		this.add(gamePanel, "ゲーム画面");
		this.pack();
	}
	
	//	preparePanels()が呼ばれた後メインメソッドからさらに手動で呼び出す
	public void prepareComponents() {
		titlePanel.prepareComponents();
		gamePanel.prepareComponents();
	}
	
	//	スクリーンモードを切り替える
	//	メインメソッドから手動で呼び出す
	public void setFrontScreenAndFocus(ScreenMode s) {
		screenMode = s;
		switch(screenMode) {
			case TITLE:
				layout.show(this.getContentPane(),  "メイン画面");
				titlePanel.requestFocus();
				break;
			case GAME:
				layout.show(this.getContentPane(), "ゲーム画面");
				gamePanel.requestFocus();
				gamePanel.timerStart();
//				gamePanel.resetGame();
//				gamePanel.soundStart();
				break;
			
		}

	}
	
	
	
}