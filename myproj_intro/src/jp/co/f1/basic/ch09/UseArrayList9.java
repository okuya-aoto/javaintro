package jp.co.f1.basic.ch09;
import java.util.ArrayList;

public class UseArrayList9 {
	public static void showArrayListData(ArrayList<String> tmpStrList) {
		for(int i = 0; i < tmpStrList.size(); i++) {
			System.out.println((i+1)+"つ目の格納データは「" + tmpStrList.get(i) + "」です。");
		}
	}
	public static void main(String[] args) {
		//文字列を扱うArrayList配列
		ArrayList<String> strList = new ArrayList<String>();
		
		//文字列を追加
		strList.add("Good morning");
		strList.add("Hello");
		strList.add("Bye");
		
		//自作メソッドを利用して全件表示
		System.out.println("■クリア前のデータ一覧");
		showArrayListData(strList);
		
		//ArrayList配列を初期化
		strList.clear();
		
		System.out.println("\n■クリア後のデータ一覧");
		//ArrayList配列のデータ格納チェック
		if(strList.isEmpty()) {
			System.out.println("データは1件もありません");
		}else {
			showArrayListData(strList);
		}

	}

}
