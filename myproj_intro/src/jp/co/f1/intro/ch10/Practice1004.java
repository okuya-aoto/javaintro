package jp.co.f1.intro.ch10;

public class Practice1004 {
	
	static int[] reverse(int[] array) {
		
		
		for(int i = 0; i < (array.length / 2); i++) {
			int hoge = array[i];
			
			array[i] = array[array.length -1 -i];      //配列の後ろからi番目の要素のインデックスを計算している。
			
			array[array.length -1 -i] = hoge;
			
		}
		return array;
	}

	public static void main(String[] args) {
		
		int[] ary = new int[] {1,3,5,7};
		System.out.println("--変更前の配列--");
		for(int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
		System.out.println("--変更後の配列--");
		int[] reverseAry = reverse(ary);
		for (int i = 0; i < ary.length; i++) {
			System.out.println(reverseAry[i]);
		}

	}

}
