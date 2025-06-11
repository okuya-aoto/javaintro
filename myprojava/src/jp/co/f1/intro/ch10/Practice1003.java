package jp.co.f1.intro.ch10;
import java.util.Scanner;
public class Practice1003 {
	
	static void outSign() {
		System.out.print("* ");
	}

	
	static void dispLine(int num) {
		
		for(int i = 0; i < num; i++ ) {
			for(int j = 0; j < num; j++) {
				outSign();
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("正方形の１辺を入力-->");
		int sqr = sc.nextInt();
		
		dispLine(sqr);

	}

}
