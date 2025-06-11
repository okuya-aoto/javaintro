package jp.co.f1.basic.ch06;

public class Book2 {
	
	private static int count = 0;
	private String title;
	private int price;
	private int number;
	
	public Book2(String title, int price){
		++count;
		this.title = title;
		this.price = price;
		this.number = count;
	}
	
	public void showBook() {
		this.title = title;
		this.price = price;
		this.number = number;   //System.out.printlnの中でthis.でするのと何か違いはあるのか？
		System.out.println("この本のタイトルは"+ title + "、価格は" + price + "です。");
		System.out.println("生成番号は" + number +"です。");
	}
	
	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		

	}

}
