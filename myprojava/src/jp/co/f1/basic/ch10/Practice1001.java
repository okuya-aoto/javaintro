package jp.co.f1.basic.ch10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practice1001 {
	public static void main(String[] args) {
		try {
			//書き込みファイルのオープン
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("practice.txt")));
			
			//文字列の書き込み
			pw.println("Java基礎");
			pw.println("ファイル入出力の練習問題を実施中！");
			
			//書き込みファイルのクローズ
			pw.close();
			
			//ファイルの読み込み
			Scanner sin = new Scanner(new File("practice.txt"));
			
			//繰り返し処理で読み込んだデータ全て読み出す
			while(sin.hasNextLine()) {
				System.out.println(sin.nextLine());
			}
			//ストリームのクローズ
			sin.close();
		}catch(FileNotFoundException e) {
			System.out.println("入力ファイルが見つかりません。");
		}catch(IOException e) {
			System.out.println(e +"入出力エラーです。");
		}
	}
}
