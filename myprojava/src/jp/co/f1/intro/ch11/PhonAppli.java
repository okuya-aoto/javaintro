package jp.co.f1.intro.ch11;
import java.util.ArrayList;
import java.util.Scanner;

//一つのオブジェクトにまとめる。
public class PhonAppli {
	String name;
	String phone;

	public PhonAppli(String name, String phone){
		this.name = name;
		this.phone = phone;

	}
	public void display() {
		System.out.println("名前："+ name +"電話番号"+ phone);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<PhonAppli> apps = new ArrayList<PhonAppli>();

		while(true) {

			System.out.print("連絡先の名前：");
			String name = scanner.nextLine();

			System.out.print("電話番号：");
			String phone = scanner.nextLine();

			apps.add(new PhonAppli(name, phone));

			System.out.print("続けて入力しますか？ y/n:");
			String cont = scanner.nextLine();
			if(!cont.equals("y")) {
				break;
			}
		}

		System.out.println("---登録された連絡先---");
		for(PhonAppli info:apps) {
			info.display();
		}
		System.out.println("検索したい名前を入力してください：");
		String search = scanner.nextLine();

		for(PhonAppli info : apps) {
			if(info.name.equalsIgnoreCase(search)) {
				System.out.println("検索結果：");
				info.display();
			}else {
				System.out.println("その名前の連絡先は見つかりませんでした。");
			}
		}
		scanner.close();
	}
}
