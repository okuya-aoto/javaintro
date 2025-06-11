package jp.co.f1.intro.ch7;

public class DoWhileLoop2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int j = 6;
		
		while(j <= 5) {
			System.out.println("Hello");
			j++;
		}
		
		System.out.println();
		System.out.println("最初から条件に合わない場合(do-while文)");
		
		do {
			System.out.println("Hello");
			j++;
		}while(j <= 5);

	}

}
