package com.bajaj.javaoops;

public class HelloWorld extends Object{
	private int a;
	private int b;
	private static String schoolName = "ABC School";
	
	/*public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(a);				// static method cannot access non static data
		System.out.println(b);
	}*/
	
	public HelloWorld(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	static {
		System.out.println("Inside static block");
	}
	
	public void printValue() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(schoolName);
	}
	
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld(10, 10);
		helloWorld.printValue();			// schoolName will be ABC School
//		helloWorld.schoolName = "Java School";
		HelloWorld.schoolName = "Java School";
		
		HelloWorld obj = new HelloWorld(1, 1);
		obj.printValue();					// schoolName will be Java School because we changed it 
		// above and since it is a static variable, change will be reflected in other object
		
		System.out.println(obj.hashCode());
	}
}
