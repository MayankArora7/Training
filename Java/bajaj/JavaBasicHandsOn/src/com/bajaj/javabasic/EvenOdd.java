package com.bajaj.javabasic;

import java.util.Scanner;

public class EvenOdd {
//	method to check even or odd
	public boolean checkEvenOdd(int number) {
//		even or odd logic
		if(number % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		input
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		
		EvenOdd obj = new EvenOdd();
		boolean result = obj.checkEvenOdd(number);
		
		if(result) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		
		sc.close();
	}
}
