package jp.co.f1.intro.ch5;

public class ImplicitCast {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//int 型の平均点を管理する変数
		int intAve;
		
		//double 型の平均点を管理する変数
		double doubleAve;
		
		intAve = 65;
		
		System.out.print("平均点は");
		System.out.print(intAve);
		System.out.println("点です");
		
		doubleAve = intAve;
		
		System.out.print("double 型に自動型変換すると");
		System.out.print(doubleAve);
		System.out.print("点です。");

	}

}
