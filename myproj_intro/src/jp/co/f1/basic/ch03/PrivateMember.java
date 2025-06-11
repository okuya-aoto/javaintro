package jp.co.f1.basic.ch03;

class Computer3{
	private String os;
	private int memory;
	
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
	
	public void setOsMemory(String os, int memory) {
		//設定するメモリの値が正常か判断する
		if(memory > 0) {
			//正常な引数の値をフィールド変数に設定
			this.os = os;
			this.memory = memory;
			System.out.println("OSを「" + os + 
					"」にメモリを「" + memory + "MByte」に変更しました。");
		}else {
			System.out.println("「" + memory + 
					"」は正しいメモリサイズではないため、変更は行いません。");
		}
	}
}

public class PrivateMember {

	public static void main(String[] args) {
		Computer3 com = new Computer3();
		
		//他クラス内のprivate変数にはアクセスできない
		//com.os = "Windows";   //この行はコメントアウトしている
		//com.memory = -5445;   //この行はコメントアウトしている
		
		//正しい値を正式な操作を呼び出して設定
		com.setOsMemory("Windows", 2048);//publicメソッドを呼び出し、値を設定。
		
		com.show();   //publicメソッドshowを呼び出す。
		
		//不正な値を設定しようとしてみる
		System.out.println("\nメモリに不正な値(-5445)を指定してみます。");
		com.setOsMemory("Windows", -5445);
		com.show();

	}

}
