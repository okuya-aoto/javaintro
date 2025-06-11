package jp.co.f1.intro.ch11;
import java.util.Scanner;
public class ensyu {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		//自己紹介
		System.out.print("名前を入力してください。＞");
		String name = scanner.nextLine();
		
		System.out.print("年齢を入力してください。＞");
		int old = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("趣味を入力してください。＞");
		String hoby = scanner.nextLine();
		
		System.out.println("名前："+ name +"　　年齢："+ old + "　　趣味：" + hoby);
		
		System.out.println();
		//年齢判定
		if(old >= 20) {
			System.out.println("成人です。");
		}else {
			System.out.println("未成年です。");
		}
		
		System.out.println();
		//計算機
		System.out.print("1つ目の数値を入力してください。＞");
		double d1 = scanner.nextDouble();
		
		
		System.out.print("2つ目の数値を入力してください。＞");
		double d2 = scanner.nextDouble();
		
		scanner.nextLine(); 
		
		System.out.print("お好みの演算子を入力してください。＞");
		String enzan = scanner.nextLine();
		
		if(enzan.equals("+") ) {
			System.out.println("演算結果：" + (d1 + d2));
		}else if(enzan.equals("-")) {
			System.out.println("演算結果：" + (d1 - d2));
		}else if(enzan.equals("*")) {
			System.out.println("演算結果：" + (d1 * d2));
		}else if(enzan.equals("/")) {
			System.out.println("演算結果：" + (d1 / d2));
		}else {
			System.out.println("正しい演算子を入力してください。");
		}
		
		System.out.println();
		
		//九九の計算表
		int[][] kuku = new int[9][9];
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				kuku[i][j] = (i + 1)*(j + 1);
			}
		}
		for(int i = 0; i < 9; i++) {
			System.out.print((i + 1) +"の段：");
			for(int j = 0; j < 9; j++) {
				System.out.print(kuku[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//テストの合計・平均計算
		int[] point = new int[5];
		
		System.out.print("1人目のテストの点数：");
		 point[0] = scanner.nextInt();
		
		System.out.print("2人目のテストの点数：");
		 point[1] = scanner.nextInt();
		
		System.out.print("3人目のテストの点数：");
		 point[2] = scanner.nextInt();
		
		System.out.print("4人目のテストの点数：");
		 point[3] = scanner.nextInt();
		
		System.out.print("5人目のテストの点数：");
		 point[4] = scanner.nextInt();
		
		int total = point[0] + point[1] + point[2] + point[3] + point[4];
		double average = (double) total / point.length;

		System.out.println();
		System.out.println("合計点：" + total + "点");
		System.out.println("平均点：" + average + "点");
		

	}

}
