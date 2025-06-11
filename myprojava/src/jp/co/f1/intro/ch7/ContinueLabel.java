package jp.co.f1.intro.ch7;
import java.util.Scanner;
public class ContinueLabel {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sin = new Scanner(System.in);
		
		//入力値を管理するための変数の宣言
		int num;
		
		//合計値を管理する為の変数の宣言
		int sum;
		
		Outer:while(true) {
			
			sum = 0;
			
			while(true) {
				
				System.out.print("整数値を入力してください終了したい場合は0を入力()");
				
				num = sin.nextInt();

				if(num == 0) {
					System.out.println("0が入力されたので、処理を終了します。");
					break Outer;
				}else if(num < 0) {
					System.out.println("マイナス値は合計されません。");
					System.out.println();
					continue;
				}

				sum += num;

				System.out.println("入力値は"+ num + "です。");
				System.out.println("合計値は" + sum +"です。");
				System.out.println();
				if(sum == 77) {
					System.out.println("ラッキー！合計値は77です。");
					break;
				}else if(sum > 100) {
					System.out.println("合計値が100を超えたのでリセットされます。");
					System.out.println();
					continue Outer;
				}
			}
		}	System.out.println("値はリセットされます。");

	}

}
/*
1.1
2.10
3.i++
4.i
5.total

int total = 0;
int i = 1;

while(i < 11){
  i++;
  total += i;
 }
  System.out.println("1～10の合計は"+ total +"です。");
  


*/