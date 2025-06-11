package jp.co.f1.intro.ch11;
import java.util.Scanner;
public class tensu_hyouka {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String cont;

		do {
			String errorCheck = inputPoint(scanner);

			System.out.println();
			System.out.print("続けますか？ y/n :");

			cont = scanner.nextLine();

		}while(cont.equals("y"));

		System.out.println("終了");
		scanner.close();
	}

	/**
	 * 科目名入力
	 * 点数取得/エラーチェック/範囲限定
	 * 点数評価
	 * @param scanner
	 * @return
	 */
	public static String inputPoint(Scanner scanner) {
		
		System.out.print("科目名を入力してください。＞");
		String subject = scanner.nextLine();
		
		int point = 0;
		
		while(true) {
			System.out.print("点数を入力してください。＞");
			String input = scanner.nextLine();
			
			try {
				point = Integer.parseInt(input);
				if(point<0 || point >100) {
					System.out.print("再入力してください。：");
					continue;
				}
				break;
			}catch(NumberFormatException e) {
				System.out.println(e+ "エラー：数値で入力");
			}
		}
		
		if(point >= 90) {
			System.out.println(subject + " 評価：A");
		}else if(point >= 80) {
			System.out.println(subject + " 評価：B");
		}else if(point >= 70) {
			System.out.println(subject + " 評価：C");
		}else if(point >= 60) {
			System.out.println(subject + " 評価：D");
		}else {
			System.out.println(subject + " 評価：E");
		}
		return subject;
	}
}
