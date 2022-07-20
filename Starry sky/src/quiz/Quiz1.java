package quiz;

public class Quiz1 extends Quiz{
	private final long serialVersionUID = 1L;
	
	
	// コンストラクタのオーバーライド
	public Quiz1() {
		super();
		super.point = 10;
		
	}
	
	
	// 設定
	public void prepareContent() {
		this.setText("夏の大三角といえば、こと座のベガ、はくちょう座のデネブとわし座の何？");
//		super.text = "夏の大三角といえば、こと座のベガ、はくちょう座のデネブとわし座の何？";
		this.word1 = "アルタイル";
		this.word2 = "エウロパ";
		this.word3 = "アルキメデス";
		this.word4 = "サターン";
	}
	public String getWord1() {
		return this.word1;
	}
	public String getWord2() {
		return this.word2;
	}
	public String getWord3() {
		return this.word3;
	}
	public String getWord4() {
		return this.word4;
	}
	
}
