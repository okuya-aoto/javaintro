package jp.co.f1.basic.ch08;

public class ExceptionOutPrint {
	public static void main(String[] args) {
		try {
			int[] intArray = new int[5];
			
			System.out.println("配列に数値を代入します。");
			intArray[10] = 50;
			
			System.out.println("配列に50を代入しました。");
		}catch(RuntimeException e) {
			System.out.println("配列の要素数を超えています。");
			System.out.println(e + "という例外が発生しました。");
		}finally {
			System.out.println("例外処理の最後の処理です。");
		}
		System.out.println("処理終了");
	}
		//例外オブジェクト情報を出力するサンプル
}
