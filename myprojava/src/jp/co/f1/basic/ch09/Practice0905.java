package jp.co.f1.basic.ch09;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Practice0905 {
	public static void showSumScore(ArrayList<Integer> score) {
		int sum = 0;
		for(int i = 0; i < score.size(); i++) {
			System.out.println((i + 1)+ "人目の点数は「"+ score.get(i) + "」です。");
			
			sum += score.get(i);
		}
		System.out.println("合計点数は「"+ sum + "」です。");
	}

	public static void main(String[] args) {
		int count = 0;
		ArrayList<Integer> score = new ArrayList<Integer>();
		Scanner sin = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("点数を入力してください=>");
				score.add(sin.nextInt());
				
				if(count==4) {
					break;
				}
				count++;
			}catch(InputMismatchException e){
				System.out.println("整数値を入力してください");
				sin.nextLine();
			}
		}
		System.out.println("--------------------------");
		showSumScore(score);

	}

}
