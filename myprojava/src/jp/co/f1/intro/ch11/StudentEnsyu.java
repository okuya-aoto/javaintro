package jp.co.f1.intro.ch11;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentEnsyu {
	
	//インスタンス変数を定義
	private String name;
	private int japanese;
	private int math;
	private int english;
	//コンストラクタを定義。インスタンス変数を初期化
	public StudentEnsyu(String name, int japanese, int math, int english) {
		this.name = name;
		this.japanese = japanese;
		this.math = math;
		this.english = english;
	}
	//メソッド定義
	public int sumPoint() {
		int sum = (japanese + math + english);
		return sum;
	}
	
	public double avePoint() {
		double ave = (japanese + math + english)/3.0;
		return ave;
	}
	
	public void display() {
		System.out.println("名前："+ name);
		System.out.println("国語の点数："+ japanese);
		System.out.println("数学の点数："+ math);
		System.out.println("英語の点数："+ english);
		System.out.println("合計点："+ sumPoint());
		System.out.println("平均点："+ avePoint());
		System.out.println();
	}
	//エラーチェックを行う関数。mainで呼び出し。
	public static int studentError(Scanner scanner) {
		int count;
		while(true) {
			System.out.print("登録する生徒の人数を入力してください。＞");
			try {
				count = Integer.parseInt(scanner.nextLine());
				if(count >=1 && count <= 10) {
					return count;
				}else {
					System.out.println("最大10人までです。");
				}
			}catch(NumberFormatException e) {
				System.out.print(e+ "再入力お願いします。：");
			}
		}
	}
	//メソッド（関数）に引数として Scanner オブジェクトを渡す
	//科目の引数を追加し、科目ごとに表示が変わるようにした
	public static int subjectError(Scanner scanner, String subject) {
		int point;
		while(true) {
			
			System.out.print(subject);
			try {
				point = scanner.nextInt();
				if(point >= 0 && point <= 100) {
					return point;
				}else {
					System.out.println("下限は0点で、上限は100点です。");
				}
			}catch(InputMismatchException e) {
				System.out.print("再入力お願いします。：");
				scanner.nextLine();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<StudentEnsyu> students = new ArrayList<>();
		
		int count = studentError(scanner);
		
		for(int i=0; i<count; i++) {
			System.out.println((i + 1)+"人目の生徒情報を入力してください。");
			
			System.out.print("名前：");
			String name = scanner.nextLine();
			
			int japanese = subjectError(scanner, "国語の点数：");

			int math = subjectError(scanner, "数学の点数：");

			int english = subjectError(scanner, "英語の点数：");
			
			//生徒情報をインスタンス化してリストに追加
			StudentEnsyu student = new StudentEnsyu(name,japanese,math,english);
			//「students」というArrayListに入れて生徒の情報を１つのリストで管理する。
			//１人の生徒の情報を1つの変数（student）で扱えるようになる。
			students.add(student);
			
			scanner.nextLine();
		}
		System.out.println("---登録された生徒情報---");
		//拡張for文studentsリストの中にあるStudentEnsyuオブジェクトを1つずつstに入れていく
		for(StudentEnsyu st : students) {
			st.display();
			System.out.println();
		}
		scanner.close();
	}
}
















//System.out.print("英語の点数：");
//int english = scanner.nextInt();
//
//if(english < 0 || english > 100) {
//	System.out.println("下限は0点で、上限は100点です。");
//	System.out.print("再入力お願いします。：");
//	english = scanner.nextInt();
//}