package jp.co.f1.basic.ch09;
import java.util.ArrayList;
public class UseArrayList4 {

	public static void main(String[] args) {
		//文字列を扱うArrayList配列
		ArrayList<String> strList = new ArrayList<String>();
		
		//文字列を追加
		strList.add("Good morning");
		strList.add("Hello");
		strList.add("Bye");
		
		//繰り返し処理を利用して全件表示
		for(int i=0; i < strList.size(); i++) {
			System.out.println((i+1)+"つ目の格納データは「" + strList.get(i) + "」です。");
		}

	}

}
