package jp.co.f1.basic.ch09;

public class Practice0903 {

	public static void main(String[] args) {
		//本情報を配列に設定
		String[] title = {"Java超入門", "Java入門", "Java基礎", "Java応用", "Java超応用"};
		int[] price = {800,1200,1800,2500,3000};
		
		Books[] book = new Books[5];
		
		for(int i = 0; i < book.length; i++) {
			//Booksクラスのインスタンス（オブジェクト）を作成して、配列bookのi番目に代入している処理
			book[i] = new Books(title[i], price[i]);
		}
		System.out.println("----------------------------------");
		for(int i = 0; i < book.length; i++) {
			//Booksクラスのオブジェクト（book[i]）に対して、showBookInfo() メソッドを呼び出している
			book[i].showBookInfo();
		}
	}
}
