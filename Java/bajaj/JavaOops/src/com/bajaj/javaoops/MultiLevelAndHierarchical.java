package com.bajaj.javaoops;

//Multilevel
/*class X {
	int a;
	X(int a) {
		this.a = a;
	}
	
	public void printX() {
		System.out.println("Inside X, a = " + a);
	}
}

class Y extends X {
	int b;
	Y(int a, int b) {
		super(a);
		this.b = b;
	}
	
	public void printY() {
		System.out.println("Inside Y, b = " + b);
	}
}

class Z extends Y {
	int c;
	Z(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	
	public void printZ() {
		System.out.println("Inside Z, c = " + c);
	}
}*/

//Hierarchical
class X {
	int a;
	public X(int a) {
		this.a = a;
	}

	public void printX() {
		System.out.println("Inside X, a = " + a);
	}
}

class Y extends X {
	int b;
	public Y(int a, int b) {
		super(a);
		this.b = b;
	}

	public void printY() {
		System.out.println("Inside Y, b = " + b);
	}
}

class Z extends X {
	int c;
	Z(int a, int c) {
		super(a);
		this.c = c;
	}

	public void printZ() {
		System.out.println("Inside Z, c = " + c);
	}
}

public class MultiLevelAndHierarchical {
	public static void main(String[] args) {
		Y obj1 = new Y(1, 2);
		Z obj2 = new Z(5, 3);
		obj1.printY();
		obj1.printX();
		obj2.printZ();
		obj2.printX();
	}
}
