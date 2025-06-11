package jp.co.f1.intro.ch7;

public class VariableScope1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int sum = 0;
		int i;
		
		for(i = 0; i < 10; i++) {
			sum += i;
		}
		
		System.out.println("変数「i」の値は、"+ i);
		System.out.println("変数「sum」の値は、"+ sum);

	}

}
