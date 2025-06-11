package jp.co.f1.basic.ch04;

class Computer5{
	private String os;
	private int memory;
	
	//コンストラクタ
	private Computer5(String os, int memory) {
		//フィールド変数に初期値設定
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ" +
        "「" + memory + "MByte」のパソコンを作成しました。");
	}
	
	//引数なしのpublicコンストラクタを追加
	public Computer5() {
		this("Windows 11", 8192);   //デフォルト値でprivateコンストラクタを呼び出す
	}
	
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class NoCallDefaultConstructor {

	public static void main(String[] args) {
		System.out.println("--「引数ありコンストラクタ」の実行前--");
		Computer5 com = new Computer5();
		System.out.println("--「引数ありコンストラクタ」の実行後--");
		com.show();
	}

}
