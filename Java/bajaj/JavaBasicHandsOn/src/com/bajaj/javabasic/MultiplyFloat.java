package com.bajaj.javabasic;

import java.util.Scanner;

public class MultiplyFloat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		input
		System.out.print("Enter first number: ");
		float num1 = sc.nextFloat();
		
		System.out.print("Enter second number: ");
		float num2 = sc.nextFloat();
		
//		multiplication
		float product = num1 * num2;
		System.out.println("Product is: " + product);
		
		sc.close();
	}
}
