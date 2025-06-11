package jp.co.f1.basic.ch09;
import java.util.ArrayList;
public class UseArrayList5 {

	public static void main(String[] args) {
		//文字列を扱うArrayList配列
		ArrayList<String> strList = new ArrayList<String>();
		
		//文字列を追加
		strList.add("Good morning");
		strList.add("Hello");
		strList.add("Bye");
		
		//繰り返し処理をを利用して全件表示
		System.out.println("■変更前のデータ一覧");
		for(int i = 0; i <strList.size(); i++) {
			System.out.println((i+1)+"つ目の格納データは「" + strList.get(i) + "」です。");
		}
		
		//3つ目のデータを変更
		strList.set(2, "Good Bye");
		
		System.out.println("\n■変更後のデータ一覧");
		for(int i =0; i<strList.size(); i++) {
			System.out.println((i+1)+"つ目の格納データは「" + strList.get(i) + "」です。");
		}
	}

}
