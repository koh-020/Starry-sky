package code;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class TitlePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	// 定数フィールド
	Color backgroundColor = Color.green;
	// コンポーネント
	JLabel title;
	JLabel start;
	JLabel exit;
	JLabel select;
	JLabel message;
	Menu checkMenu = Menu.START;
	Border border = BorderFactory.createLineBorder(Color.black, 2); // ラベルの淵を分かりやすいようにする
	MyKeyListener myKeyListener;

	// 列挙型
	public enum Menu {
		START, EXIT,
	}

	// コンストラクタ
	TitlePanel() {
		// パネルサイズと貼り付け位置の設定は不要
		this.setLayout(null); // レイアウトの設定
		this.setBackground(backgroundColor); // 背景の色
	}

	// メソッド

	public void prepareComponents() {
		// タイトルロゴ
		title = new JLabel();
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setVerticalAlignment(SwingConstants.BOTTOM);
		title.setText("Created by koh");
		title.setHorizontalTextPosition(JLabel.CENTER);
		title.setVerticalTextPosition(SwingConstants.BOTTOM);
		title.setBounds(90, 0, 800, 450);
		this.setBorder(border);

		// 選択肢
		start = new JLabel();
		start.setText("START");
		start.setFont(new Font("MV boil", Font.BOLD, 40));
		start.setHorizontalTextPosition(JLabel.CENTER);
		start.setVerticalTextPosition(JLabel.BOTTOM);
		start.setBounds(410, 500, 150, 40);
		start.setBorder(border);

		exit = new JLabel();
		exit.setText("EXIT");
		exit.setFont(new Font("MV boil", Font.BOLD, 40));
		exit.setHorizontalTextPosition(JLabel.CENTER);
		exit.setVerticalTextPosition(JLabel.BOTTOM);
		exit.setBounds(430, 550, 110, 40);
		exit.setBorder(border);

		// 選択肢用のアイコン（後で星に変更したい）
		select = new JLabel();
		select.setBackground(Color.blue);
		select.setOpaque(true);
		select.setBounds(360, 500, 40, 40);
		select.setBorder(border);

		// 説明
		message = new JLabel();
		message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setText("選択：↑, ↓　　決定：space");
		message.setVerticalTextPosition(JLabel.CENTER);
		message.setHorizontalTextPosition(JLabel.CENTER);
		message.setBounds(329, 617, 300, 30);
		message.setBorder(border);

		// 配置
		this.setLayout(null);
		this.add(title);
		this.add(start);
		this.add(exit);
		this.add(select);
		this.add(message);

		// リスナーの設定
		myKeyListener = new MyKeyListener(this);

	}

	// 内部クラス（リスナーの設定）
	private class MyKeyListener implements KeyListener {

		// 貼り付け先を保持
		TitlePanel panel;

		// コンストラクタ
		MyKeyListener(TitlePanel p) {
			super();
			panel = p;
			panel.addKeyListener(this);
			// do nothing
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// do nothing
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// do nothing
		}

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
				case KeyEvent.VK_DOWN:
					if (checkMenu == Menu.START) {
						select.setLocation(select.getX(), select.getY() + 50);
						checkMenu = Menu.EXIT;
					}
					break;
				case KeyEvent.VK_UP:
					if (checkMenu == Menu.EXIT) {
						select.setLocation(select.getX(), select.getY() - 50);
						checkMenu = Menu.START;
					}
					break;
				case KeyEvent.VK_SPACE:
					if (checkMenu == Menu.START) {
						// 開始
						Main.mainWindow.setFrontScreenAndFocus(ScreenMode.GAME);
	//							Main.mainWindow.gamePanel.showRuleDialogue();
					} else if (checkMenu == Menu.EXIT) {
						// 終了
						System.exit(0);
				}
				break;
			}
		}

	}

}