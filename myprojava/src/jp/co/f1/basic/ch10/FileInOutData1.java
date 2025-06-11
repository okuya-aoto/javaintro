package jp.co.f1.basic.ch10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInOutData1 {
	public static void main(String[] args) {
		int sum = 0;
		double ave = 0.0;
		String[] strData = null;
		
		ArrayList<String> subjectList = new ArrayList<String>();
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		
		try {
			//強化データファイルの読み込み
			Scanner sin = new Scanner(new File("subject_data.csv"));
			
			//全データを配列に読み込む
			while (sin.hasNextLine()){
				//読み込み1桁データカンマで分割
				strData = sin.nextLine().split(",");
				
				//各配列にデータを格納
				subjectList.add(strData[0]);
				scoreList.add(Integer.parseInt(strData[1]));
			}
			//ストリームのクローズ
			sin.close();
			System.out.println("ファイルの読み込みが終了しました。");
				
			//書き込みファイルのオープン
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("statistics.txt")));
			
			//読み込みデータをファイルに書き込む
			for(int i = 0; i < subjectList.size(); i++) {
				pw.println(subjectList.get(i) + "<--->" + scoreList.get(i));
			}
			
			//合計点を算出しファイルに書き込む
			for(int i = 0; i < scoreList.size(); i++) {
				sum += scoreList.get(i);
			}
			pw.println("合計点："+ sum);
			
			//平均点を算出しファイルに書き込む
			ave = (double) sum / scoreList.size();
			pw.println("平均点："+ ave);
			
			//書き込みファイルのクローズ
			pw.close();
			System.out.println("ファイルへの書き込みが終了しました。");
		}catch(FileNotFoundException e) {
			System.out.println("入力ファイルが見つかりません。");
		}catch(IOException e) {
			System.out.println(e +"入出力エラーです。");
		}
	}
}
