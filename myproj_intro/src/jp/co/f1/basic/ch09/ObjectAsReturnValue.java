package jp.co.f1.basic.ch09;

public class ObjectAsReturnValue {
	
	//引数のoa名から適正なメモリを判定し、その情報をもとに
	//コンピュータオブジェクトを生成して返す。
	public static Computer3 makeComputer(String os) {
		//適正メモリ値格納変数
		int reasonableMemory;
		
		//os名から適正メモリサイズを判定
		if (os.equals("Windows7")) {
			//osがWindows7の場合
			reasonableMemory = 3072;
		}else if(os.equals("WindowsVista")){
			//OSがWindowsVistaの場合
			reasonableMemory = 2048;
		}else {//その他のosの場合
			reasonableMemory = 1024;
		}
		//引数ありのコンストラクタでオブジェクトを生成
		Computer3 com = new Computer3(os, reasonableMemory);
		
		//戻り値にcomを設定
		return com;
	}

	public static void main(String[] args) {
		//メソッドの引数に設定する変数を宣言
		String os1 = "Windows";
		String os2 = "WindowsXP";
		
		//OS名を引数に設定してメソッドを呼び出す。
		Computer3 com1 = makeComputer(os1);
		Computer3 com2 = makeComputer(os2);
		
		//各メソッドの戻り値からオブジェクト情報を表示する
		System.out.println("作成した1台目の");
		com1.show();
		System.out.println("------------------------------------------------");
		System.out.println("作成した2台目の");
		com2.show();
	}

}
