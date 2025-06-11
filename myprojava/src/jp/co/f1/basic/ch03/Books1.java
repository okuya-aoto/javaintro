package jp.co.f1.basic.ch03;

public class Books1 {
	
	private String title;
	private int price;
	
	public void show() {
		System.out.println("この本のタイトルは" + this.title +
				"で、値段は" + this.price+ "です。");
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setTitlePrice(String title, int price) {
		
		if(price < 0) {
			this.price = price;
			System.out.println("設定する値が"+ price +"のため、価格は０を設定した。");
		}else {
			this.price = price;
		}
	}

	public static void main(String[] args) {
		
		Books1 book = new Books1();
		
		book.setTitlePrice("アンパンマン", -334);
		
		//book.show();

	}

}
