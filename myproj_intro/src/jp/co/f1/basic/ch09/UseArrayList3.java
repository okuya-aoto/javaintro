package jp.co.f1.basic.ch09;

import java.util.ArrayList;

public class UseArrayList3 {

	public static void main(String[] args) {
		//文字列を扱うArrayList配列
		ArrayList<String> strList = new ArrayList<String>();

		//1つ目の文字列を追加と表示
		strList.add("Good morning");
		System.out.println("1つ目の格納データは「" + strList.get(0) + "」です。");

		//2つ目の文字列を追加と表示
		strList.add("Hello");
		System.out.println("2つ目の格納データは「" + strList.get(1) + "」です。");

		//3つ目の文字列を追加と表示
		strList.add("Bye");
		System.out.println("3つ目の格納データは「" + strList.get(2) + "」です。");

		//ArrayList配列の格納データ数を表示
		System.out.println("格納データ数は「" + strList.size() + "」件です。");

	}

}
