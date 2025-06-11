package jp.co.f1.basic.ch07;

public class SamePackage {

	public static void main(String[] args) {
		Computer2 com = new Computer2(); //Computer2クラスをオブジェクト化
		com.setOsMemory("Windows", 2034); //osとメモリの値を設定
		com.show(); //コンピューターの情報を確認
	}

}
