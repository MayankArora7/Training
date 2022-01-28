package com.bajaj.javabasic;

import java.util.Scanner;

public class AsciiValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		input
		System.out.print("Enter a character: ");
		char c = sc.next().charAt(0);
		
//		print ascii
		System.out.println("ASCII of " + c + " = " + (int)c);
		
		sc.close();
	}
}
