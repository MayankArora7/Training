package com.bajaj.javaoops;

class Camera {
	public void printCamera() {
		System.out.println("5 MP");
	}
}

interface Processor {
	public void printProcessor();
}

class MobilePhone extends Camera implements Processor {

	@Override
	public void printProcessor() {
		// TODO Auto-generated method stub
		
	}
}
public class MyInheritance2 {
	
}
