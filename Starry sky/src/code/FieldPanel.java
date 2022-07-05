package code;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class FieldPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	
	//コンポーネント
	JLabel gameLabel;
	JPanel quizPanel;
	
	JLayeredPane layeredPane;
	
	//コンストラクタ
	
	public FieldPanel() {
		this.setBackground(Color.green);
		this.setLayout(null);
		
	}
	
	//コンストラクタを読んだ後、手動で呼ぶ
	public void prepareComponents() {
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1000, 800);
		this.add(layeredPane);
	}
	

}
