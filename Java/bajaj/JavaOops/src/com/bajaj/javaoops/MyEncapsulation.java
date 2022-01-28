package com.bajaj.javaoops;

class Employee {
//	Do not share your private details to anyone
	private String username;
	private int password;
	
//	Method should be public
	public void login(String username, int password) {
		System.out.println("Working on system");
	}
}

public class MyEncapsulation {
	public static void main(String[] args) {
		Employee s1 = new Employee();
	}
}
