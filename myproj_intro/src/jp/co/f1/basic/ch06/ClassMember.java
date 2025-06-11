package jp.co.f1.basic.ch06;

class Computer2{
	private String os;
	private int memory;
	public static int sum;  //クラス変数
	
	//コンストラクタ
	public Computer2() {
		this.os = null;
		this.memory = 0;
		sum++;          //コンストラクタが呼び出される毎にクラス変数sumの値を1増やす。
		System.out.println("パソコンを作成しました。");
	}
	public void setOsMemory(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OSを「" + os + "」にメモリを「" + memory + "MByte」に変更しました。");
	}
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
	public static void showSum() {   //クラスメソッド
		System.out.println("■パソコンは合計" + sum + "台作成されています。");
	}
}
public class ClassMember {

	public static void main(String[] args) {
		Computer2.sum = 0;  //クラス変数sumにアクセスし0で初期化
		Computer2.showSum();  //クラスメソッドshowSumにアクセス1回目（オブジェクト作成前）
		
		Computer2 com1 = new Computer2();
		com1.setOsMemory("Windows", 2048);
		com1.show();
		Computer2.showSum();  //クラスメソッドshowSumにアクセス2回目（com1オブジェクト作成後）
		
		Computer2 com2 = new Computer2();
		com2.setOsMemory("Windows", 543);
		com2.show();
		Computer2.showSum();  //クラスメソッドshowSumにアクセス3回目（com1,com2オブジェクト作成後）	
	}
}

