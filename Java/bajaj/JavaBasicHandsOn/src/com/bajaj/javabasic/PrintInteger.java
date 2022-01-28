package com.bajaj.javabasic;

import java.util.Scanner;

public class PrintInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		input
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
//		print
		System.out.println("Number is " + number);
		
		sc.close();
	}
}