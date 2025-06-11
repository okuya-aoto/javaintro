package jp.co.f1.intro.ch8;
import java.util.Scanner;
public class DebugTest {

	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int randomNum = (int)(Math.random()*10);
		int playNum ;
		
		System.out.print("0から9までの数字を入力してください＞");
		playNum = readInt();
		
		//ランダムに生成した数値と、ユーザーが入力した数値を比較する
		if(randomNum == playNum) {
			System.out.println("当たり");
		}else {
			System.out.println("外れ");
		}

	}
	
	static int readInt() {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		return i;
	}

}
