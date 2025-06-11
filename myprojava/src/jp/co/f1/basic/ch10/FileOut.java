package jp.co.f1.basic.ch10;
import java.io.BufferedWriter;  //ファイルへの文字出力を行うクラス
import java.io.FileWriter;    //ファイルへの文字出力を行うクラス
import java.io.IOException;   //入出力エラー時にスローされる例外
public class FileOut {
	private BufferedWriter bw = null;

	//ファイルのオープンを行うメソッド
	public boolean open(String fname) {
		boolean sts = true;
		try {
			//書き込みファイルオープンに相当する処理
			bw = new BufferedWriter(new FileWriter(fname));
		}catch(IOException e) {
			System.out.println("ファイル名に誤りがあります\n"+ e);
			sts = false;
		}
		return sts;
	}

	//ファイルへのデータ書き込みを行うメソッド
	public boolean writeln(String str) {
		boolean sts = true;
		try {
			bw.write(str);
			bw.newLine();
		}catch(IOException e) {
			System.out.println("書き込みエラー\n" + e);
			sts = false;
		}
		return sts;
	}

	//ファイルのクローズを行うメソッド
	public boolean close() {
		boolean sts = true;
		try {
			bw.close();
		}catch(IOException e) {
			System.out.println("ファイルクローズエラー\n"+ e);
			sts = false;
		}
		return sts;
	}

	public static void main(String[] args) {
	}
}
