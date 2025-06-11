package jp.co.f1.basic.ch09;

public class AssignValueOfClassType1 {

	public static void main(String[] args) {
		//クラス型変数com1を宣言し、Computer1オブジェクトを生成
		System.out.println("com1を宣言しました。");
		Computer1 com1 = new Computer1();
		
		//osとメモリ情報を設定
		com1.setComputer("WindowXP", 1024);
		
		//クラス型変数com2を宣言
		System.out.println("com2を宣言しました。");
		Computer1 com2;
		
		//com2にcom1を代入
		System.out.println("com2にcom1を代入しました。");
		com2 = com1;
		
		System.out.println("\n-[情報変更前のPC情報表示]-------------");
		System.out.println("com1の"); //com1の情報を表示
		com1.show();
		System.out.println();
		System.out.println("com2の"); //com2の情報を表示
		com2.show();
		System.out.println("--------------------------------------\n");
	}

}
