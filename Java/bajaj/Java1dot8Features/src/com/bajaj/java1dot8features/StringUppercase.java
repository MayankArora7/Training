package com.bajaj.java1dot8features;

import java.util.Scanner;

interface StringUpper {
	public String call(String s);
}

public class StringUppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string: ");
		String str = sc.next();
		
		StringUpper stringConversion = (s) -> s.toUpperCase();
		
		System.out.println(stringConversion.call(str));
		
		sc.close();
	}
}
