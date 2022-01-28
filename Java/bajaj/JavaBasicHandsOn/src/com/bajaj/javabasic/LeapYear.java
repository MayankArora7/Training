package com.bajaj.javabasic;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		input
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
//		leap year logic
		if(year % 400 == 0) {
			System.out.println("Leap year");
		}
		else {
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					System.out.println("Not a leap year");
				}
				else {
					System.out.println("Leap year");
				}
			}
			else {
				System.out.println("Not a leap year");
			}
		}
			
		sc.close();
	}
}
