package jp.co.f1.intro.ch11;

import java.util.Scanner;

public class ensyu_1 {
	
	// 整数入力を安全に行う関数
	public static int safeIntInput(Scanner scanner, String prompt) {
		while (true) {
			//文字列を読み取る
			System.out.print(prompt);
			//ユーザーが入力した内容を読み取る
			String input = scanner.nextLine();
			try {
				//ユーザーが入力した内容をint型に置き換えて、返す。
				return Integer.parseInt(input);
				//ユーザーが入力した内容が数値に置き換えられなかったらerrorを発生する
			} catch (NumberFormatException error) {
				System.out.println("エラー：整数を入力してください。");
			}
		}
	}

	// 小数入力を安全に行う関数　　上と同じ
	public static double safeDoubleInput(Scanner scanner, String prompt) {
		while (true) {
			System.out.print(prompt);
			String input = scanner.nextLine();
			try {
				return Double.parseDouble(input);
			} catch (NumberFormatException error) {
				System.out.println("エラー：数値を入力してください。");
			}
		}
	}
	
	public static void keisan(double d1, double d2, String operate) {
		switch(operate) {
		case "+":
			System.out.println("演算結果：" + (d1 + d2));
			break;
		case "-":
			System.out.println("演算結果：" + (d1 - d2));
			break;
		case "*":
			System.out.println("演算結果：" + (d1 * d2));
		case "/":
			if(d2 == 0) {
				System.out.println("エラー：0で割ることはできません。");
			}else {
				System.out.println("演算結果：" + (d1 / d2));
			}
			break;
		default:
			System.out.println("正しい演算子を入力してください。");
		}
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 自己紹介
		System.out.print("名前を入力してください。＞");
		String name = scanner.nextLine();

		int old = safeIntInput(scanner, "年齢を入力してください。＞");

		System.out.print("趣味を入力してください。＞");
		String hoby = scanner.nextLine();

		System.out.println("名前：" + name + "　　年齢：" + old + "　　趣味：" + hoby);
		System.out.println();

		// 年齢判定
		if (old >= 20) {
			System.out.println("成人です。");
		} else {
			System.out.println("未成年です。");
		}

		System.out.println();

		// 計算機
		double d1 = safeDoubleInput(scanner, "1つ目の数値を入力してください。＞");
		double d2 = safeDoubleInput(scanner, "2つ目の数値を入力してください。＞");

		System.out.print("お好みの演算子を入力してください。＞");
		String enzan = scanner.nextLine();

		keisan(d1, d2, enzan);
		System.out.println();

		// 九九の計算表
		int[][] kuku = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < 9; i++) {
			System.out.print((i + 1) + "の段：");
			for (int j = 0; j < 9; j++) {
				System.out.print( kuku[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();

			// テストの合計・平均計算
			int[] point = new int[5];
			point[0] = safeIntInput(scanner, "1人目のテストの点数：");
			point[1] = safeIntInput(scanner, "2人目のテストの点数：");
			point[2] = safeIntInput(scanner, "3人目のテストの点数：");
			point[3] = safeIntInput(scanner, "4人目のテストの点数：");
			point[4] = safeIntInput(scanner, "5人目のテストの点数：");
			

			int total = point[0] + point[1] + point[2] + point[3] + point[4];
			double average = (double) total / point.length;

			System.out.println();
			System.out.println("合計点：" + total + "点");
			System.out.println("平均点：" + average + "点");
	}
	

		
}
