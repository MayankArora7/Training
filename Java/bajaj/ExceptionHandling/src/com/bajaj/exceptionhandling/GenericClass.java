package com.bajaj.exceptionhandling;

// Generic class
class Employee<T, V, Z> {
//	Fixed int
	private T id;
//	Fixed string
	private V name;
	private Z salary;
	
	Employee(T id, V name, Z salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
public class GenericClass {
	public static void main(String[] args) {
		Employee<Long, String, Long> e1 = new Employee(1001, "Ansar", 1000);
	}
}
