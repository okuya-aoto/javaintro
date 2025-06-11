package jp.co.f1.basic.ch10;

public class Practice1002 {
	public static void main(String[] args) {
		//読み込みファイルの１桁データ格納用変数
		String strLine = null;
		
		//提供クラスのオブジェクト化
		FileIn in = new FileIn();
		FileOut out = new FileOut();
		
		//書き込みファイルのオープン
		if(out.open("practice.txt")== false) { //FileOutクラスの openメソッドを呼び出す。失敗したらfalseを返す
			System.exit(1);         //失敗したら強制終了。1はエラーの種類を示す。
		}
		
		//文字列の書き込み
		out.writeln("[Java基礎]");    //FileOutクラスにwritelnで書き込む。
		out.writeln("ファイル入出力の練習問題を実施中！");
		
		//書き込みファイルのクローズ
		if(out.close()==false) {   //ファイルを閉じれなかったら強制終了。
			System.exit(2);	     //エラーの種類2。
		}
		//ファイルの読み込み
		if(in.open("practice.txt")== false) {
			System.exit(3);
		}
		
		//繰り返し処理で読み込んだデータ全て読みだす
		while((strLine = in.readLine())!= null) {  //1行ずつ読み込み、null出ない限り(まだ読み込む行がある限り)ループを繰り返す。
			System.out.println(strLine);   
		}
		//ストリームのクローズ
		if(in.close()== false) {
			System.exit(4);
		}

	}

}
