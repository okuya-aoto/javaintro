package jp.co.f1.basic.ch09;

public class ClassArray {
	public static void main(String[] args) {
		//クラス型変数を宣言
		Computer1[] coms = new Computer1[3];
		
		//繰り返しを利用して配列要素にオブジェクトを代入
		for(int i=0; i <coms.length; i++) {
			coms[i] = new Computer1();
		}
		
		//各配列要素のオブジェクトからメソッドを呼び出す。
		coms[0].setComputer("WindowsXP", 1024);
		coms[1].setComputer("WindowsVista", 2048);
		coms[2].setComputer("Windows7", 3072);
		
		//繰り返しを利用して各オブジェクトの情報を表示する
		for(int i=0; i<coms.length; i++) {
			coms[i].show();
		}
	}
}
