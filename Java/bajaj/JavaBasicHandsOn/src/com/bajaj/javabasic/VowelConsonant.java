package com.bajaj.javabasic;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		input
		System.out.print("Enter an alphabet: ");
		char c = sc.next().charAt(0);
		
		switch(c) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':	
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
		
		sc.close();
	}
}
