package jp.co.f1.basic.ch07_2;  //Computer4クラスをパッケージに含める

class Computer4 {  //アクセス修飾子publicを付けない
	private String os;
	private int memory;
	
	public void show() {
		System.out.println("OSは「" + this.os + "」です。");
		System.out.println("メモリサイズは「" + this.memory + "MByte」です。");
	}
	
	public void setOsMemory(String os, int memory) {
		//引数の値をフィールド変数に設定
		this.os = os;
		this.memory = memory;
	}

}
