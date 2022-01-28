package com.bajaj.javaoops;

// POJO class -- Plain Old Java Object

// Model class
class Person {
	private String name;
	private int age;
	private int salary;
	private String address;
	
	public Person(String name, int age, int salary, String address) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address + "]";
	}

	
}

public class MyMain {
	public static void main(String[] args) {
		Person abc = new Person("ABC", 25, 50000, "Pune");
		System.out.println(abc.toString());
		
		Person xyz = new Person("XYZ", 24, 45000, "Delhi");
		System.out.println(xyz.toString());
	}
}
