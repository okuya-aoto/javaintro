package jp.co.f1.basic.ch09;

public class StringEquals {

	public static void main(String[] args) {
		//変数宣言
		String str1 = "おはようございます";
		String str2 = "こんにちは";
		String str3 = "さようなら";
		String str4 = "こんにちは";
		
		//変数と指定の文字列で比較を行う
		if (str1.equals("おはようございます")) {
			System.out.println("str1(" + str1 + ")の文字列は、「おはようございます」と同じです。");
		}
		//変数と変数で比較を行う
		if (str2.equals(str4)) {
			System.out.println("str2(" + str2 + ")と、str4(" + str4 + ")の文字列は同じです。");
		}
		//文字列が指定の文字列と違う場合の判定方法
		if(!str2.equals(str3)) {
			System.out.println("str2(" + str2 + ")と、str3(" + str3 + ")の文字列は同じではありません。");
		}
	}

}
