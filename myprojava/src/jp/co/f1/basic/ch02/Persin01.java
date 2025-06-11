package jp.co.f1.basic.ch02;

class Person01{
	String name;
	int age;
	
	public void showPerson() {
		System.out.println("この人の名前は" + name + "で、年齢は"+ age + "歳です。");
	}
}

public class Persin01 {

	public static void main(String[] args) {
		
		Person01 per = new Person01();
		
		per.name = "aoto";
		per.age = 22;
		
		per.showPerson();
	}

}
