package jp.co.f1.basic.ch05;

public class Calc1 {
	
	public int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	public double addition(double num1, double num2) {
		return num1 +num2;
	}

	public static void main(String[] args) {
		
		Calc1 ad = new Calc1();
		
		int num1 = 10;
		int num2 = 30;
		System.out.println(num1 +"+"+ num2 +"=" + ad.addition(num1,num2));
		
		double num3 = 45.2;
		double num4 = 21.2;
		System.out.println(num3 +"+"+ num4 +"=" + ad.addition(num3,num4));
		
		

	}

}
