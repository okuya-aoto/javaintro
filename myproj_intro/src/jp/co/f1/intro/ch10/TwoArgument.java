package jp.co.f1.intro.ch10;

public class TwoArgument {

	static void checkPass(int point, int passPoint) {

		if(point >= passPoint) {
			System.out.println(point + "点なので合格です。");
		}else {
			System.out.println(point + "点なので不合格です。");
		}
		System.out.println("---");
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//点数を管理する変数の宣言と初期化
		int pointA = 85;
		int pointB = 32;
		int pointC = 60;
		int pointD = 40;

		System.out.print("A君は、");
		checkPass(pointA, 50);

		System.out.print("B君は、");
		checkPass(pointB, 50);

		System.out.print("Cさんは、");
		checkPass(pointC, 50);

		System.out.print("Dさんんは、");
		checkPass(pointD, 50);

	}

}
