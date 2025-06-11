package jp.co.f1.basic.ch08;

public class ArrayException2 {
	public static void main(String[] args) {
		try {
			//int型配列を定義
			int[] intArray = new int[5];
			
			//添え字10に値を代入
			System.out.println("intArray[10]に数値を代入します。");
			intArray[10] = 50;
			
			//結果を表示
			System.out.println("intArray[10]に50を代入しました。");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素数を超えています。");
		}
		System.out.println("処理終了");

	}

}
