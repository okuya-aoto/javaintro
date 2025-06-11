package jp.co.f1.intro.ch6;

public class NestedIfStatement1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int a = 5;
		
		if(a >= 0) {
			System.out.println("変数aは0以上。");
			if(a <= 10) {
				System.out.println("変数aは10以下。");
			}else {
				System.out.println("変数aは10より大きい。");
			}
		}
		

	}

}
