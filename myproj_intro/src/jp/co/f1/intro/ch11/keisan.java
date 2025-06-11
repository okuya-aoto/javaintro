package jp.co.f1.intro.ch11;
import java.util.Scanner;
public class keisan {
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String cont;

		do {
			double d1 = Number(scanner, "1つ目の数値を入力してください。：");
			double d2 = Number(scanner, "2つ目の数値を入力してください。：");

			String enzan = inputEnzan(scanner);

			String result = Keisan(d1,d2,enzan);
			System.out.println(result);


			System.out.print("続けますか？ y/n :");
			cont = scanner.nextLine();

			if(cont.equalsIgnoreCase("y") == false) {
				break;
			}
		}while(cont.equals("y"));

		System.out.println("終了");
		scanner.close();
	}
	/**
	 * 数値入力メソッド（エラーチェック）
	 * double dを宣言。dを返す。
	 * scanner.hasNextDouble() : 入力がdouble型として有効か確認。
	 * scanner.nextLine(); をnextDouble()のあとに1回入れることで、バッファに残った改行を消費
	 * @param scanner
	 * @param message
	 * @return
	 */
	public static double Number(Scanner scanner, String message) {
		double d = 0;
		while(true) {
			System.out.print(message);
			
			if(scanner.hasNextDouble()) {
				 d = scanner.nextDouble();
				scanner.nextLine();
				break;
			}else {
				System.out.println("数値を入力してください。");
				scanner.nextLine();
			}
		}
		return d;
	}
	
	/**
	 * 演算子入力メソッド（エラーチェック）
	 * 拡張for文：入力された演算子を返す。不一致：再入力。
	 * @param scanner
	 * @return
	 */
	public static String inputEnzan(Scanner scanner) {
		String[] enzan = {"+", "-", "*", "/", "%"};
		while(true) {
			System.out.print("お好みの演算子を入力してください（+ - * / %）：");
			String st = scanner.nextLine();
			for(String info : enzan) {
				if(st.equals(st)) {
					return st;
				}else {
					System.out.println("正しい演算子を入力してください。");
				}
			}
		}
	}
	
	/**
	 * 計算処理メソッド（エラーチェック）
	 * 0除算チェック
	 * @param d1
	 * @param d2
	 * @param enzan
	 * @return
	 */
	public static String Keisan(double d1, double d2, String enzan) {
	    if (enzan.equals("+")) {
	        return "演算結果：" + (d1 + d2);
	    } else if (enzan.equals("-")) {
	        return "演算結果：" + (d1 - d2);
	    } else if (enzan.equals("*")) {
	        return "演算結果：" + (d1 * d2);
	    } else if (enzan.equals("/")) {
	    	if(d2 == 0){
	            return "エラー：0で割ることはできません。";
	        } else {
	        	 return "演算結果：" + (d1 / d2);
	        }
	    }else if (enzan.equals("%")) {
	    	if(d2 == 0) {
	    		return "エラー：0で割ることはできません。";
	    	}else {
	    		return "演算結果：" + (d1 % d2);
	    	}
	    }else {
	    		return "エラー：無効な演算子です。";
	    	}
	}
}
