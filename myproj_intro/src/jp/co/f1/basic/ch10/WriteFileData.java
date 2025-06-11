package jp.co.f1.basic.ch10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileData {

	public static void main(String[] args) {
		try {
			//書き込みファイルのオープン
			PrintWriter pw = new PrintWriter
					(new BufferedWriter(new FileWriter("output1.txt")));
			pw.println("■世界の「ありがとう」");
			pw.println("日本語ではありがとう");
			
			//書き込みファイルのクローズ
			pw.close();
			System.out.println("ファイルに書き込みが終了しました。");
		}catch(IOException e) {
			System.out.println(e+"入出力エラーです。");
		}
	}

}
