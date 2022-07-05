package code;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	//コンポーネント
	FieldPanel fieldPanel;
	MenuBar menuBar;
	BorderLayout layout = new BorderLayout();
	
	
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
	
	public void prepareComponents() {
		fieldPanel.prepareComponents();
		menuBar.prepareComponents();
//		this.add(GamePanel);
	}
}
