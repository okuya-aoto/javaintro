package jp.co.f1.intro.ch9;

public class AssignValueIntoArray {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//住居年数を管理するための配列変数の宣言と要素の作成
		int[] kandamansion = new int[3];
		
		//要素の初期化
		kandamansion[0] = 3;
		kandamansion[1]= 1;
		kandamansion[2]= 10;
		
		System.out.println("0号室の住居年数"+ kandamansion[0]);
		System.out.println("1号室の住居年数"+ kandamansion[1]);
		System.out.println("2号室の住居年数"+ kandamansion[2]);
		
		int[] kandamansion2 = {3, 1, 10};
		
		System.out.println("- 神田マンション2号棟の移住年数 -");
		System.out.println("0号室の住居年数"+ kandamansion[0]);
		System.out.println("1号室の住居年数"+ kandamansion[1]);
		System.out.println("2号室の住居年数"+ kandamansion[2]);
	}

}
