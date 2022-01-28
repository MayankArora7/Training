package com.bajaj.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;

class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}
}
public class MyException {
	public static void main(String[] args) {
//		Check exception
		/*File file = new File("C/:");
		file.getAbsoluteFile();
		FileInputStream inputStream = new FileInputStream(file);*/	// This will work fine if
																	// put it in the try block.
		
		int a[] = new int[0];
		try {
			if(a.length == 1) {
				a[0] = 1;
			}
			else {
				throw new CustomException("There is no space in array to fill this element");
			}
			System.out.println(a[0]);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(a[0]);
		}
	}
}
