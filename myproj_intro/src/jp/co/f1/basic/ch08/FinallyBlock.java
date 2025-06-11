package jp.co.f1.basic.ch08;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
		int[] intArray = new int[5];

		System.out.println("配列に数値を代入します。");
		intArray[10] = 50;

		System.out.println("配列に50を代入しました。");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素数を超えています。");
		}finally {
			System.out.println("例外処理の最後の処理です。");
		}
		System.out.println("処理終了");
	}
}
