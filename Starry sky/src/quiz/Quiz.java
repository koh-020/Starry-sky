package quiz;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JLabel;

public abstract class Quiz extends JLabel{
	private static final long serialVersionUID = 1L;
	int point;
	String text;
	JButton choice1;
	JButton choice2;
	JButton choice3;
	JButton choice4;
	String word1;
	String word2;
	String word3;
	String word4;
	
	
	// コンストラクタ
	public Quiz() {
		this.setBounds(50, 50, 400, 800);
		
		// 選択肢をリスト化
		Set<String> hash = new HashSet<String>();
		hash.add(word1);
		hash.add(word2);
		hash.add(word3);
		hash.add(word4);
		
		
		
	}
	
	// コンストラクタの後で呼び出す
	public abstract void prepareContent();
	public abstract String getWord1();
	public abstract String getWord2();
	public abstract String getWord3();
	public abstract String getWord4();
	
	

}
