package code;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import quiz.Quiz;
import quiz.Quiz1;

public class FieldPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	
	//コンポーネント
//	JLabel gameLabel;
	JLabel quizLabel;
	JLabel square;
	JButton homeButton;
	JLabel scoreLabel;
	JButton word1;
	JButton word2;
	JButton word3;
	JButton word4;
	
	
	
	JLayeredPane layeredPane;
	
	//コンストラクタ
	public FieldPanel() {
		this.setBackground(Color.orange);
		this.setLayout(null);
	}
	
	
//	
//	//コンストラクタを読んだ後、手動で呼ぶ
//	public void prepareComponents() {
//		this.setBounds(0, 60, 1000, 400);
////		layeredPane = new JLayeredPane();
////		layeredPane.setBounds(0, 0, 1000, 800);
////		this.add(layeredPane);
////		prepareQuiz();
//		square = new JLabel();
//		square.setBackground(Color.orange);
//		square.setText("A");
//		square.setBounds(400, 400, 100, 100);
//		this.add(square);
//	}
	

	
	//コンストラクタの後に手動で呼び出す
	public void prepareComponents() {
		this.setBounds(0, 50, 1000, 50);
		
		//ホームボタン作成
		homeButton = new JButton();
		homeButton.setBounds(5, 55, 80, 30);
		homeButton.setText("HOME");
		
		
		
		// プログレスバー作成
		
		//スコアラベル作成
		scoreLabel = new JLabel();
		scoreLabel.setBounds(800, 55, 150, 30);
		scoreLabel.setText("SCORE：");
		
		
		
		// クイズ作成
		quizLabel = new JLabel();
		Quiz quiz = new Quiz1();
		
		quiz.prepareContent();
		quizLabel.setOpaque(true);
		quizLabel.setBackground(Color.white);
		quizLabel.setBounds(10, 100, 800, 500);
		quizLabel.setText(quiz.getText());
		
		//選択肢ボタン作成
		
		word1 = new JButton();
		word1.setBounds(10, 600, 100, 50);
		word1.setText(quiz.getWord1());
		
		
		
		word2 = new JButton();
		word2.setBounds(100, 600, 100, 50);
		word2.setText(quiz.getWord2());
		
		word3 = new JButton();
		word3.setBounds(200, 600, 100, 50);
		word3.setText(quiz.getWord3());
		
		word4 = new JButton();
		word4.setBounds(300, 600, 100, 50);
		word4.setText(quiz.getWord4());
		
		
				
		// 設置
		this.add(homeButton);
		this.add(scoreLabel);
		this.add(quizLabel);
		this.add(word1);
		this.add(word2);
		this.add(word3);
		this.add(word4);
		
	}
	
	
	// クイズを貼る
	public void prepareQuiz() {
//		quizLabel = new JLabel();
//		Quiz quiz = new Quiz1();
//		quiz.prepareContent();
//		String text = quiz.getText();
//		quizLabel.setText(text);
////		quizLabel.setBounds(100, 100, 400, 800);
//		quizLabel.setLocation(100, 100);
////		this.add(quizLabel);
//		this.layeredPane.add(quizLabel, 400);
//		
//		JLabel square = new JLabel();
//		square.setBackground(Color.orange);
//		square.setBounds(400, 400, 100, 100);
////		square.setLayout(null);
//		this.add(square);
//		this.layeredPane.add(square, 300);
	}

}
