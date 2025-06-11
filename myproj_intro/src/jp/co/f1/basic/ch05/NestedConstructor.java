package jp.co.f1.basic.ch05;

class Computer4{
	private String os;
	private int memory;
	
	//引数なしコンストラクタ
	public Computer4() {
		this.os = null;
		this.memory = 0;
		System.out.println("パソコンを作成しました。");
	}
	
	//引数2つともコンストラクタ
	public Computer4(String os, int memory) {
		//引数なしのコンストラクタ呼び出し
		this();
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ" + "「" + memory
      + "MByte」のパソコンを作成しました。");
	}
	
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class NestedConstructor {

	public static void main(String[] args) {
		//オブジェクト生成
		Computer4 com = new Computer4("WindowsXP", 2048);
		com.show();

	}

}
