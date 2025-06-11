package jp.co.f1.basic.ch07_3;

public class DifferentPackage1 {
	public static void main(String[] args) {
		//別パッケージのComputer3クラスを完全限定名で指定してオブジェクト化
		jp.co.f1.basic.ch07_2.Computer3 com = new jp.co.f1.basic.ch07_2.Computer3();
		com.setOsMemory("Windows", 1034);
		com.show();
	}
}
