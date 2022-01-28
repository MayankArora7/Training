package com.bajaj.helloworld;

import java.util.Scanner;

public class MyIfElse {
	public static void main(String args[]) {
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is not positive");
		}
		System.out.println("End of Program");
		sc.close();
	}
}
