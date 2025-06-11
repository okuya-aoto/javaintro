package jp.co.f1.basic.ch09;

public class ObjectAsArgument {
	//引数にクラス型変数のComputer2オブジェクト情報を受け取り、
	//OSの適正メモリサイズチェックを行います。
	
	public static void checkMemory(Computer2 com) {
		int reasonableMemory;  //適正メモリ値格納変数
		String os = com.getOs();  //引数のクラス型変数からOS名を取得
		int memory = com.getMemory(); //引数のクラス型変数からメモリサイズを取得
		com.show();  //PC情報表示
		
		if (os.equals("Windows7")) {
			//OSがWindows7の場合
			reasonableMemory = 3072;
		}else if(os.equals("WindowsVista")) {
			//OSがWindowsVistaの場合
			reasonableMemory = 2048;
		}else {
			//その他のOSの場合
			reasonableMemory = 1024;
		}
		//適正メモリサイズチェック
		if(memory >= reasonableMemory) {
			 System.out.println("⇒メモリサイズは適正です。");
		}else {
			System.out.println("⇒メモリの増設をお勧めします。");
		}
		System.out.println("------------------------------------");
	}
	

	public static void main(String[] args) {
		//Computer2クラスをオブジェクト化
		Computer2 com1 = new Computer2();
		Computer2 com2 = new Computer2();
		//PC情報を設定
		com1.setOs("Windows7");
		com1.setMemory(2048);
		com2.setOs("WindowsVista");
		com2.setMemory(2048);
		
		//引数にクラス型変数（オブジェクト）を与えてメソッド呼び出し
		System.out.println("------------------------------------");
		checkMemory(com1);
		checkMemory(com2);
	}

}
