package jp.co.f1.intro.ch5;

public class ImplicitCast2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//計算用の値を管理する変数を宣言し、値を代入
		double d = 10.5;
		int i = 2;
		
		System.out.print("d = ");
		System.out.println(d);
		
		System.out.print("i = ");
		System.out.println(i);
		
		System.out.print("d + i = ");
		System.out.println(d + i);
		
		double doubleAnswer = d / i;
		System.out.print("d / i = ");
		System.out.println(doubleAnswer);
		
		double wrongDoubleAnswer = 3/2;
		System.out.print("3 / 2 = ");
		System.out.print(wrongDoubleAnswer);

	}

}
