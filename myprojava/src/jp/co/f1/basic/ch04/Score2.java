package jp.co.f1.basic.ch04;

public class Score2 {
	
	String name;
	int[] score = new int[5];
	int total;
	double ave;
	
	public Score2(String name, int[] socre,int total, double ave) {
		
		this.name = name;
		for(int i = 0; i < this.score.length; i++) {
			this.score[i] = 0;
		}
		
		this.total = total;
		this.ave = ave;
	}

	public static void main(String[] args) {
		

	}

}
