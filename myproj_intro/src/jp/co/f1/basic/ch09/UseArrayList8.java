package jp.co.f1.basic.ch09;
import java.util.ArrayList; 
public class UseArrayList8 {

	public static void main(String[] args) {
		//文字列を扱うArrayList配列
		ArrayList<String> strList = new ArrayList<String>();
		
		//文字列を追加
		strList.add("Good morning");
		strList.add("Hello");
		strList.add("Bye");
		
		//繰り返し処理を利用して全件表示
		System.out.println("■クリア前のデータ一覧");
		for(int i=0; i<strList.size(); i++ ) {
			System.out.println((i + 1)+ "つ目の格納データは「"+ strList.get(i) + "」です。");
		}
		
		//ArrayList配列の格納データを全削除
		strList.clear();
		
		System.out.println("\n■クリア後のデータ一覧");
		//ArrayList配列の格納データ数をチェック
		if(strList.isEmpty()) {
			System.out.println("データは1件もありません");
		}else {
			for(int i=0; i<strList.size(); i++ ) {
				System.out.println((i+1)+"つ目の格納データは「" + strList.get(i) + "」です。");
			}
		}

	}

}
