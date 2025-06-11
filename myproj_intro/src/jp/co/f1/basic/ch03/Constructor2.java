package jp.co.f1.basic.ch03;

class Computer2{
	private String os;
	private int memory;

	//引数ありコンストラクタ
	public Computer2(String os, int memory) {

		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ" + "「" + memory + 
				"MByte」のパソコンを作成しました。");
	}

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class Constructor2 {

	public static void main(String[] args) {

		System.out.println("--「引数ありコンストラクタ」の実行前--");
		Computer2 com = new Computer2("Windows", 2048);
		System.out.println("--「引数ありコンストラクタ」の実行後--");
		com.show();
	}
}

