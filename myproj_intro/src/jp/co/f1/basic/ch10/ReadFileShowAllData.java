package jp.co.f1.basic.ch10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileShowAllData {

	public static void main(String[] args) {
		try {
			//Scannerクラスのオブジェクト生成
			Scanner sin = new Scanner(new File("sample.txt"));
			
			//繰り返し処理で全データを読み出し
			while(sin.hasNextLine()) {
				String strLine = sin.nextLine();
				System.out.println(strLine);
			}
			//ストリームのクローズ
			sin.close();
		}catch(FileNotFoundException e) {
			System.out.println("入力ファイルが見つかりませんでした");
		}
	}
}
