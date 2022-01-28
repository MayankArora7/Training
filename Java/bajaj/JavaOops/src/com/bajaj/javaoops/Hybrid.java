package com.bajaj.javaoops;


//		M
//	____|____
//	|		|
//	N		P
//	|
//	O

class M {
	int m;
	M(int m) {
		this.m = m;
	}
	
	public void printM() {
		System.out.println("Inside M, m = " + m);
	}
}

class N extends M {
	int n;
	N(int m, int n) {
		super(m);
		this.n = n;
	}
	
	public void printN() {
		System.out.println("Inside N, n = " + n);
	}
}

class O extends N {
	int o;
	O(int m, int n, int o) {
		super(m, n);
		this.o = o;
	}
	
	public void printO() {
		System.out.println("Inside O, o = " + o);
	}
}

class P extends M {
	int p;
	P(int m, int p) {
		super(m);
		this.p = p;
	}
	
	public void printP() {
		System.out.println("Inside P, p = " + p);
	}
}

public class Hybrid {
	public static void main(String[] args) {
		O obj1 = new O(1, 2, 3);
		obj1.printM();
		obj1.printN();
		obj1.printO();
		
		P obj2 = new P(5, 6);
		obj2.printM();
		obj2.printP();
	}
}
