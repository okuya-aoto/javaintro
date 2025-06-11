package jp.co.f1.intro.ch11;
import java.util.Scanner;
public class hanteneasy {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("文字列を入力してください：");
		String st = scanner.nextLine();
		
		//文字列 stをStringBuilder に変換。　.reverse()：StringBuilder のメソッドで、文字列を逆順にする。
		//.toString()：StringBuilder を再び String 型に戻す。
		String reverse = new StringBuilder(st).reverse().toString();
		
		System.out.println("反転後：" + reverse);
		
		scanner.close();

	}
}
