package com.bajaj.javabasic;

import java.util.Scanner;

public class AddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		input
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
//		addition
		int sum = num1 + num2;
		System.out.println("Sum is: " + sum);
		
		sc.close();
	}
}
