package code;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	//コンポーネント
	JPanel fieldPanel;
	JPanel menuBar;
	
	public void prepareComponents() {
		menuBar = new JPanel();
		fieldPanel = new JPanel();
		FieldPanel.prepareComponents();
		MenuBar.preapreComponensts();
		this.add(GamePanel);
	}
}
