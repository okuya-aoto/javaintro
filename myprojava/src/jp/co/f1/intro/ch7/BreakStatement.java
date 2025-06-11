package jp.co.f1.intro.ch7;
import java.util.Scanner;
public class BreakStatement {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		while (true) {
			
			System.out.print("整数を入力してください(終了したい場合は0を入力) >");
			
			num = sc.nextInt();
			
			System.out.println("入力値は"+ num +"です。");
			System.out.println();
			
			if(num == 0) {
				System.out.println(num + "が入力されたため終了します。");
				break;
			}
		}

	}

}
