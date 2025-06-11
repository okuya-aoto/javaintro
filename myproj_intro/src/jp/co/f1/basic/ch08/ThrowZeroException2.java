package jp.co.f1.basic.ch08;

public class ThrowZeroException2 {
	public static void calcTest() {
		int num = 10 / 0;

		System.out.println("10/0の結果は" + num);
	}
	public static void main(String[] args) {
		try {
			//calcTestメソッド呼び出し
			calcTest();
		}catch(ArithmeticException e) {
			System.out.println("0で除算はできません。");
		}
		System.out.println("処理終了");
	}
	//呼び出したメソッド内で発生した例外の処理を呼び出し元で行うプログラム
}
