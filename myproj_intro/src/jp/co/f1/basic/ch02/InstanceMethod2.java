package jp.co.f1.basic.ch02;

class Computer5{
	String os;
	int memory;
	
	//メッセージとパソコンの情報を表示するメソッド
	public void showComputer() {
		System.out.println("パソコンの情報を表示します。");
		//クラス内のshowメソッドを呼び出す
		show();
	}
	
	//フィールド変数よりosの値を取得する
	public void show() {
		System.out.println("osは「"+ os +"」です。");
		System.out.println("メモリサイズは「"+ memory + "MByte」です。");
	}
	
	//フィールド変数よりmemoryの値を取得する
	public String getOs() {
		return os;
	}
	
	//フィールド変数よりMemoryの値を取得する
	public int getMemory() {
		return memory;
	}
	
	//フィールド変数に値を設定するメソッド
	public void setOsMemory(String name, int size) {
		os = name;
		memory = size;
		System.out.println("OSを「"+ name +"」に、メモリサイズを「"+ size + "MByte」に変更しました。");
	}
}

public class InstanceMethod2 {

	public static void main(String[] args) {
		//Computer5クラスからオブジェクトを生成する
		Computer5 com  = new Computer5();
		
		//オブジェクトのフィールド変数に、各データを格納する
		com.os = "WindowsXP";
		com.memory = 2048;
		
		//メソッドを利用してフィールド変数に格納しているデータを取得する
		System.out.println("パソコンのosは「" + com.getOs() + "」です。");
		System.out.println("メモリサイズは「" + com.getMemory() + "MByte」です。");

		//オブジェクトのフィールド変数に、各データを再格納する
		com.setOsMemory("Windows2000", 512);
		
		//showComputerメソッド呼び出し
		com.showComputer();

	}

}
