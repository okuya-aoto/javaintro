package jp.co.f1.basic.ch10;
import java.util.Scanner;
public class KeyInOut {

	public static void main(String[] args) {
		//Scannerクラスのオブジェクト生成
		Scanner sin = new Scanner(System.in);
		
		System.out.print("文字列を入力してください=>");
		String strLine = sin.nextLine();
		
		System.out.println("「" + strLine + "」が入力されました。");

	}

}
