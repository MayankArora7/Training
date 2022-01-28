package com.bajaj.java1dot8features;

import java.util.Scanner;

interface EvenOddType {
	public void call(int n);
}

public class EvenOddLambda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		
		EvenOddType evenOdd = (n) -> {
			if(n % 2 == 0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		};
		evenOdd.call(number);
		
		sc.close();
	}
}
