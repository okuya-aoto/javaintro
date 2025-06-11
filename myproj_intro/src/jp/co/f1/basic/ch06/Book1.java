package jp.co.f1.basic.ch06;

public class Book1 {
	
	private static int count = 0;
	private String title;
	private int price;
	private int number;
	
	public Book1(String title, int price){
		count++;
		this.title = title;
		this.price = price;
		this.number = count;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
