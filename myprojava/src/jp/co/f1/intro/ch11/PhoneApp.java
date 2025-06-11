package jp.co.f1.intro.ch11;
import java.util.ArrayList;
import java.util.Scanner;
public class PhoneApp {
	
	private String name;
	private String phone;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<PhoneApp> apps = new ArrayList<>();
		String cont;
		
		do {
			System.out.print("名前を入力してください。：");
			String name = scanner.nextLine();
			
			String phone = phoneError(scanner);
			
			//appsに連絡先データを格納
			apps.add(new PhoneApp(name, phone));
			
			//ユーザーが続けるか選択
			System.out.print("続けて入力しますか？ y/n:");
			cont = scanner.nextLine();

		}while(cont.equalsIgnoreCase("y"));
		
			//appsという連絡先のリストの中から１件ずつinfoに取り出して処理する
			//拡張for文：appsというリストの中にあるPhonAppliオブジェクトを1つずつinfoに取り出して、
			//info.display()を実行する
			System.out.println("---登録された連絡先---");
			for(PhoneApp info : apps) {
				info.display();
			}
			
			//名前検索の呼び出し
			searchName(scanner,apps);
			
			scanner.close();
	}
	
	public PhoneApp(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	void display() {
		System.out.println("名前："+ name + "電話番号："+ phone);
	}
	
	/**
	 * 電話番号取得
	 * \\d：数字１桁(0～9)を表す。
	 * {2,4}：直前の//dが2～4桁連続することを意味する。
	 * -：ハイフンそのものを意味する。
	 * @param scanner
	 * @return
	 */
	public static String phoneError(Scanner scanner) {
		
		while(true) {
			System.out.print("電話番号を入力してください。：");
			String phone = scanner.nextLine();
			if(phone.matches("\\d{2,4}-\\d{2,4}-\\d{3,4}")) {
				return phone;
			}else {
				System.out.println("エラー：数字とハイフンのみで、正しい形式で入力してください。");
			}
		}
	}
	
	/**
	 * 名前検索メソッド/appsリストから名前がsearchと一致するPhoneAppオブジェクトを検索。
	 * 拡張for文で探し、matchedListに追加。
	 * 一致が1件もなかった場合/isEmpty()
	 * 一致が1件なら表示。
	 * 複数あれば電話番号下4桁を入力してもらい、さらに絞り込む。
	 * 電話番号を - で分割し、最後の部分（下4桁）とユーザーの入力を比較。
	 * matchedListに追加されたPhoneAppオブジェクトをinfoに取り出す。
	 * 一致したらその連絡先を表示し、foundをtrueにしループを抜け出す。
	 * 下4桁でも一致なしならエラーメッセージ。
	 * @param scanner
	 * @param apps
	 */
	public static void searchName(Scanner scanner, ArrayList<PhoneApp> apps) {
		System.out.print("検索したい名前を入力してください。：");
		String search = scanner.nextLine();
		
		ArrayList<PhoneApp> matchedList = new ArrayList<>();
		for(PhoneApp info : apps) {
			if(info.name.equalsIgnoreCase(search)) {
				matchedList.add(info);
			}
		}
		
		if(matchedList.isEmpty()) {
			
			System.out.println("見つかりませんでした。");
			
		}else if(matchedList.size() ==1) {
			
			System.out.println("検索結果：");
			matchedList.get(0).display();
			
		}else {
			
			System.out.println("同じ名前が複数あります。");
			String last4 = scanner.nextLine();
			
			boolean found = false;
			for(PhoneApp info : matchedList) {
				String[] parts = info.phone.split("-");
				if(parts.length == 3 && parts[2].equals(last4)) {
					System.out.println("検索結果：");
					info.display();
					found = true;
					break;
				}
			}
			if(found == false) {
				System.out.println("一致する電話番号が見つかりませんでした。");
			}
		}
	}
}