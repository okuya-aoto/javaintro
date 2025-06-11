package jp.co.f1.intro.ch10;

public class Practice1005 {
	
	static double searchMaximum(double[] ary) {
		//まず、最大値を入れる変数maxNumを宣言し、基準となるインデックス0の要素を代入していく。
		double maxNum = ary[0];
		
		for(int i = 1; i < ary.length; i++) {
			//インデックス0とインデックス1の値を比べて、1の方が大きければ入れ替える。これを繰り返していく。
			if(maxNum < ary[i]) {
				maxNum = ary[i];
			}
		}
		//最後に導き出された最大値を戻り値として返す。
		return maxNum;
		
	}

	public static void main(String[] args) {
		
		//要素数10のdouble型は配列を作成する。
		double[] aryDouble = new double[10];
		System.out.println("--ランダムに生成された10個の数値--");
		for(int i = 0; i < 10; i++) {
			aryDouble[i] = Math.random();
			//最大値を表示。
			System.out.println(aryDouble[i]);
		}
		System.out.println("--最大値--");
		System.out.println(searchMaximum(aryDouble));

	}

}
