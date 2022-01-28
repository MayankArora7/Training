package com.bajaj.java1dot8features;

class Calc {
	int a;
	int b;
	
	public void sum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public void subtraction(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}
}

public class MyLambda {
	public static void main(String[] args) {
		Calc cal = new Calc();
		cal.sum(10, 20);
		cal.subtraction(10, 1);
	}
}
