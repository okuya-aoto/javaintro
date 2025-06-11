package jp.co.f1.basic.ch10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileManyData {

	public static void main(String[] args) {
		//書き込み用データを配列に用意
		String[] strArray = {"■世界の「ありがとう」",
				"日本語はありがとう",
				"韓国語はカムサハムニダ",
				"英語はサンキュー",
				"中国語は謝謝",
				"ネパール語はダンニャバード",
				"ドイツ語はダンケシェーン",
				"スペイン語はグラシェ"};
		try {
			//書き込みファイルのオープン
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output2.txr")));
			
			//繰り返し処理で書き込みを行う
			for(int i = 0; i < strArray.length; i++) {
				pw.println(strArray[i]);
			}
			//書き込みファイルのクローズ
			pw.close();
			System.out.println("ファイルに書き込みが終了");
		}catch(IOException e) {
			System.out.println(e + "入出力エラーです。");
		}
	}

}
