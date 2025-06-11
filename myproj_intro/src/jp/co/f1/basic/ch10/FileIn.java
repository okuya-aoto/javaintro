package jp.co.f1.basic.ch10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIn {
	private Scanner sin = null;
	
	//ファイルのオープンを行うメソッド
	public boolean open(String fname) {
		boolean sts = true;
		try {
			//読み込みファイルオープンに相当する処理
			sin = new Scanner(new File(fname));
		}catch(FileNotFoundException e) {
			System.out.println("ファイル名に誤りがあります\n"+ e);
			sts = false;
		}
		return sts;
	}
	
	//読み込んだファイルデータからの１桁読み出し処理を行うメソッド
	public String readLine() {
		String buff;
		
		//読み込み可能データがあるか判定
		if(sin.hasNextLine()) {
			buff = sin.nextLine();
		}else {
			buff = null;
		}
		return buff;
	}
	
	//ストリームのクローズを行うメソッド
	public boolean close() {
		boolean sts = true;
		try {
			sin.close();
		}catch(Exception e) {
			System.out.println("ストリームクローズエラー\n"+ e);
			sts = false;
		}
		return sts;
	}

	public static void main(String[] args) {
		

	}

}
