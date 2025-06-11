package jp.co.f1.basic.ch02;

class Person04{
	String name;
	int age;
	
	public void showPerson() {
		System.out.println("この人の名前は" + name + "で、年齢は"+ age + "歳です。");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}

public class Person03 {

	public static void main(String[] args) {
		
		Person04 per = new Person04();
		
		per.name = "aoto";
		per.age = 22;
		
		per.showPerson();
		
		

	}

}
