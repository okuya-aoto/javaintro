package jp.co.f1.basic.ch02;

class Computer4{
	String os;
	int memory;
	
	//フィールド変数の値を表示するメソッド
	public void show() {
		System.out.println("パソコンのosは「" + os +"」です。");
		System.out.println("メモリサイズは「"+ memory +"」です。");
	}
}

public class InstanceMethod1 {

	public static void main(String[] args) {
		//Computer4クラスからオブジェクトを生成する
		Computer4 com = new Computer4();
		
		//データ格納前にメソッドを呼び出し（1回目）
		System.out.println(" 1回目のメソッド呼び出し");
		com.show();
		
		//オブジェクトのフィールド変数に、各データを格納する
		com.os = "WindowsXP";
		com.memory = 2048;
		
		//データ格納後にメソッド呼び出し（2回目）
		System.out.println(" 2回目のメソッド呼び出し");
		com.show();
		
	}

}
