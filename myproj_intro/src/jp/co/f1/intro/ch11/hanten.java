package jp.co.f1.intro.ch11;
import java.util.Scanner;
public class hanten {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("文字列を入力してください。");
		String st = Scanner.nextLine();
		
		char[] array = st.toCharArray();
		
		for(int i = 0; i < array.length/2; i++) {
			char hoge = array[i];
			
			array[i] = array[array.length -1 -i] = hoge;
		}
		
		String retu = new String(array);
		System.out.println("反転後：" + retu);
		
		
	}

}
