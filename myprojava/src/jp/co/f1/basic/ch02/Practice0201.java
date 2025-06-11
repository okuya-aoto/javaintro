package jp.co.f1.basic.ch02;

class Person02{
	String name;
	int age;

	public void showPerson() {
		System.out.println("この人の名前は" + name + "で、年齢は"+ age + "歳です。");
	}


	public void setNameAge(String name, int age) {
		System.out.println("この人の名前は" + name + "で、年齢は"+ age + "歳です。");
	}
}

public class Practice0201 {

	public static void main(String[] args) {

		Person02 per2 = new Person02();
		

		per2.name = "aoto";
		per2.age = 22;

		per2.showPerson();

		
		
		per2.setNameAge("神田花子" , 20);
	}

}

