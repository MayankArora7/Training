package com.bajaj.javabasic;

import java.util.Scanner;

public class LargestThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		input
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num3 = sc.nextInt();
		
//		finding largest number
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println(num1 + " is the largest");
			}
			else {
				System.out.println(num3 + " is the largest");
			}
		}
		else {
			if(num2 > num3) {
				System.out.println(num2 + " is the largest");
			}
			else {
				System.out.println(num3 + " is the largest");
			}
		}
		
		sc.close();
	}
}
