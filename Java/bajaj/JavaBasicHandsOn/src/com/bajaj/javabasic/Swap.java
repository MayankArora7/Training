package com.bajaj.javabasic;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		input
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Numbers before swap: " + num1 + ", " + num2);
		
//		swap logic
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Numbers after swap: " + num1 + ", " + num2);
		
		sc.close();
	}
}
