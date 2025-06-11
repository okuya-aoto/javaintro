package jp.co.f1.intro.ch11;
import java.util.Scanner;
public class rensyu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cont;
		
		do {
			//空の文字列型変数を宣言
			String reverse = "";
			
			System.out.println("文字列を入力してください。");
			String st = sc.nextLine();
			
			//st.length() -1（最後）から始めて、インデックスを0になるまで減らす。
			for(int i = st.length() -1; i >= 0; i--) {
				//空の文字列型変数reverseに１文字ずつ追加していく。=だと上書きされる
				reverse += st.charAt(i);
			}
			System.out.println("反転後：" + reverse);

			System.out.print("続けますか？ y/n :");
			cont = sc.nextLine();

			//while (cont.equalsIgnoreCase("y"));なら、YやyでもOKになる。
		}while(cont.equals("y"));

		System.out.println("終了");
		sc.close();
	}
}
