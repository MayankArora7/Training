package com.bajaj.java1dot8features;

import java.util.Scanner;

interface PositiveNegativeType {
	public void call(int n);
}

public class PositiveNegativeLambda {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		
		PositiveNegativeType pn = (n) -> {
			if(n >= 0) {
				System.out.println("Positve");
			}
			else {
				System.out.println("Negative");
			}
		};
		pn.call(number);
		
		sc.close();
	}
}
