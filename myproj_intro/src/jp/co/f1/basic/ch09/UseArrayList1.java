package jp.co.f1.basic.ch09;
import java.util.ArrayList;
public class UseArrayList1 {

	public static void main(String[] args) {
		//文字列を扱うArrayList配列
		ArrayList<String> strList = new ArrayList<String>();
		
		//1つ目の文字列を追加
		strList.add("Good morning");
		System.out.println("1つ目追加時の全データは" + strList + "です。");
		
		//2つ目の文字列を追加
		strList.add("Hello");
		System.out.println("2つ目追加時の全データは" + strList + "です。");
		
		//3つ目の文字列を追加
		strList.add("Bye");
		System.out.println("3つ目追加時の全データは" + strList + "です。");
	}

}
