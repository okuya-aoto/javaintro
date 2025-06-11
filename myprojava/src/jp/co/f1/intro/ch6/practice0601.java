package jp.co.f1.intro.ch6;
import java.util.Scanner;
public class practice0601 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("数値を入力してください。＞");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("入力数値[" + num + "]は偶数です。");
		}else if(num % 2 != 0) {
			System.out.println("入力数値[" + num + "]は奇数です。");
		}

	}

}
