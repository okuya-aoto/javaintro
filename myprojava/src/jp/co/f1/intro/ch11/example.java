package jp.co.f1.intro.ch11;

import java.util.Scanner;

public class example {
	
	public static int checkInt(Scanner scanner,String st) {
		while(true) {
			System.out.println(st);
			String input = scanner.nextLine();
			try {
				return Integer.parseInt(input);
			}catch(NumberFormatException e) {
				System.out.println("エラー：正しい数値を入力してください。");
			}
		}
	}
	
	public static double checkDouble(Scanner scanner, String st) {
		while(true) {
			System.out.print(st);
			String input = scanner.nextLine();
			try {
				return Double.parseDouble(input);
			}catch(NumberFormatException e) {
				System.out.println("エラー：正しい数値を入力してください。");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("名前を入力してください。＞");
		String name = scanner.nextLine();
		
		int old = checkInt(scanner,"年齢を入力してください。");
		
		System.out.println("名前：" + name + "　　年齢：" + old );
		System.out.println();
		
		if(old >= 20) {
			System.out.println("成人");
		}else {
			System.out.println("未成年");
		}
		
		System.out.println("====== 4. 九九表 ======");
	    showMultiplicationTable();
	    System.out.println();
	    
	 // 5. テスト成績計算
        System.out.println("====== 5. テスト成績計算 ======");
        calculateTestScores(scanner);
	}
	
	 public static void showMultiplicationTable() {
	        System.out.println("九九表を表示します:");
	        
	        // 外側のループ: 1から9まで
	        for (int i = 1; i <= 9; i++) {
	            // 内側のループ: 1から9まで
	            for (int j = 1; j <= 9; j++) {
	                // 掛け算の結果を整形して表示（桁揃え）
	                System.out.printf("%2d", i * j);
	                // 値と値の間にスペースを入れる
	                System.out.print(" ");
	            }
	            // 各行の最後で改行
	            System.out.println();
	        }
	    }
	 
	 public static void calculateTestScores(Scanner scanner) {
		 final int STUDENT_COUNT = 5;
		 int[] scores = new int[STUDENT_COUNT];
		 int total = 0;
		 
		 //5人分の点数を入力
		 for(int i = 0; i < STUDENT_COUNT; i++) {
			 System.out.print((i + 1)+ "人目の点数を入力してください");
			 scores[i] = scanner.nextInt();
			 total += scores[i];  //合計に加算
		 }
		 
		 //平均点の計算
		 double average = (double) total / STUDENT_COUNT;
		 
		 //結果の表示
		 System.out.println("----------");
		 System.out.println("入力された点数");
		 for (int i = 0; i < STUDENT_COUNT; i++) {
			 System.out.println((i + 1)+ "人目"+ scores[i]+ "点");
		 }
		 System.out.println("-----------");
		 System.out.println("合計点："+ total + "点");
		 System.out.println("平均点："+ average + "点");
	 }
}
