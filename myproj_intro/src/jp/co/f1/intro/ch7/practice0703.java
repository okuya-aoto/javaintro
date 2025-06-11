package jp.co.f1.intro.ch7;

public class practice0703 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	
		
		for(int i = 1; i <= 40; i++) {
			
			if(i % 2 != 0) {
				continue;
			}if (i > 20) {
				break;
			}
			System.out.println(i);
		}

	}

}
