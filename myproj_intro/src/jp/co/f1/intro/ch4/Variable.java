package jp.co.f1.intro.ch4;

public class Variable {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//名前を管理する変数
		String name;
		name = "奥谷碧大";
		
		//慎重を管理する変数
		double height;
		height = 170.0;
		
		//年齢を管理する変数
		int age = 22;
		
		//血液型を管理する変数
		char blood = 'O';
		
		System.out.print(name);
		System.out.print("さんの身長は");
		System.out.println(height+"cm です。");
		
		System.out.print("年齢は");
		System.out.print(age);
		System.out.println("歳です。");

		System.out.print("血液型は");
		System.out.print(blood);
		System.out.print("型です。");

	}

}
