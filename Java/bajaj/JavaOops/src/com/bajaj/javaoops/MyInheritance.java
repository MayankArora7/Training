package com.bajaj.javaoops;

//Single Level
class A {
	public void printA() {
		System.out.println("Inside A");
	}
}

class B extends A {
	public void printB() {
		System.out.println("Inside B");
	}
}

public class MyInheritance {
	public static void main(String[] args) {
		B obj = new B();
		obj.printA();
		obj.printB();
	}
}
