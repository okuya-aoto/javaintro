package jp.co.f1.intro.ch10;

public class ArrayArgument {
	
	static void display(String[] aryDate) {
		for (int i = 0; i < aryDate.length; i++) {
			System.out.println(aryDate[i]);
		}
	}

	public static void main(String[] args) {
		
		String[] hotSpring = {"別府","由布院","伊東"};
		
		System.out.println("--三大温泉--");
		display(hotSpring);
	}

}
