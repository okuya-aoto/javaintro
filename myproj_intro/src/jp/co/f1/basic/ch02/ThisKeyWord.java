package jp.co.f1.basic.ch02;

class Computer9{
	String os;
	int memory;
	
	//メッセージとパソコン情報を表示するメソッド
	public void showComputer() {
		System.out.println("パソコンの情報を表示します。");
		//クラス内のshowメソッドを呼び出す
		this.show();  //thisキーワードを呼び出す
	}
	
	//フィールド変数よりosの値を取得する
	public void show() {
		System.out.println("OSは「" + this.os + "」です。");
		System.out.println("メモリサイズは「" + this.memory + "MByte」です。");
	}
	
	//フィールド変数よりosの値を取得する
	public String getOs() {
		return this.os;
	}
	
	//フィールド変数よりmemoryに値を取得する
	public int getMemory() {
		return this.memory;
	}
	
	//フィールド変数に値を設定するメソッド
	public void setOsMemory(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OSを「" + os + "」に、メモリサイズを「" + memory + "MByte」に変更しました。");
		
	}
}

public class ThisKeyWord {

	public static void main(String[] args) {
		
		Computer9 com = new Computer9();
		
		//オブジェクトのフィールド変数に各データを格納
		com.os = "Windows";
		com.memory = 2048;
		
		//メソッドを利用してフィールド変数に格納しているデータを取得
		System.out.println("パソコンのOSは「" + com.getOs() + "」です。");
		System.out.println("メモリサイズは「" + com.getMemory() + "MByte」です。");
		
		//オブジェクトのフィールド変数に各データを再格納
		com.setOsMemory("Windows2000", 512);
		
		//showComputerメソッドを呼び出してフィールド変数の値を確認
		com.showComputer();

	}

}
