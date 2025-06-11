package jp.co.f1.basic.ch03;

class Cpmputer3{
	private String os;
	private int memory;
	
	//コンストラクタ
	private void Computer3(String os, int memory) {
		//フィールド変数に初期値を設定
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ" +
      "「" + memory + "MByte」のパソコンを作成しました。");
		
		
	}
	
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}

public class PrivateConstructor {

	public static void main(String[] args) {
		
		System.out.println("--newの前--");
	//	Computer3 com = new Computer3("WindowsXP", 2048);
		System.out.println("--newの後--");
		//com.show();

	}

}
