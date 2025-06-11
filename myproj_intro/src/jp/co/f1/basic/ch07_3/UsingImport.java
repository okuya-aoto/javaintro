package jp.co.f1.basic.ch07_3;
import jp.co.f1.basic.ch07_2.Computer3;
public class UsingImport {
	public static void main(String[] args) {
		//完全限定名なしでクラスをオブジェクト化
		Computer3 com = new Computer3();
		com.setOsMemory("Windows", 2123);
		com.show();

	}

}
