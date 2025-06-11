package jp.co.f1.basic.ch09;

public class LengthCharAt {

	public static void main(String[] args) {
		String str = "java学習開始";  //文字列を設定
		char ch1 = str.charAt(0);  //１文字目を取得
		char ch7 = str.charAt(6);  //７文字目を取得
		int len = str.length();  //文字列の長さを取得
		
		System.out.println("「"+ str + "」の1番目の文字は「"+ ch1 + "」です。");
		System.out.println("「" + str + "」の7番目の文字は「" + ch7 + "」です。");
		System.out.println("「" + str + "」の文字の長さは「" + len + "」です。");

	}

}
