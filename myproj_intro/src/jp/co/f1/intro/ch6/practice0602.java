package jp.co.f1.intro.ch6;
import java.util.Scanner;
public class practice0602 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sin = new Scanner(System.in);
		System.out.print("成績を入力(1～5)-->");
		int grade = sin.nextInt();
		
		switch(grade) {
		
		case 1:
			System.out.println("もっと勉強しましょう！");
			break;
		case 2:
			System.out.println("もう少し努力が必要です。");
			break;
		case 3:
			System.out.println("さらに良い成績を目指しましょう。");
			break;
		case 4:
			System.out.println("良い成績です。");
			break;
		case 5:
			System.out.println("最高の成績です。");
			break;
		default:
			System.out.println("1～5の数値を入力してください！");
			break;
		}

	}

}
