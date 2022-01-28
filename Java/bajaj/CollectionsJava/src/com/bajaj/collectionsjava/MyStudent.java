package com.bajaj.collectionsjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {//implements Comparable<Student>{
//	Three sort keys
//	id
	private int id;
//	name
	private String name;
//	fees
	private int fees;
	
	public Student(int id, String name, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}

	/*@Override
	public int compareTo(Student s2) {
//		this -> E1, s2 -> E2
		
//		Sort according to Name
//		return this.getName().compareToIgnoreCase(s2.getName());
		
//		Sort according to fees
		/*if(this.getFees() > s2.getFees()) {
			return 1;
		}
		else if(this.getFees() < s2.getFees()) {
			return -1;
		}
		else {
			return 0;
		}
		
//		Sort according to id
		if(this.getId() > s2.getId()) {
			return 1;
		}
		else if(this.getId() < s2.getId()) {
			return -1;
		}
		else {
			return 0;
		}
	}*/
}

public class MyStudent {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(3, "Pooja", 2000));
		students.add(new Student(1, "Kamesh", 1000));
		students.add(new Student(60, "Zee", 400));
		students.add(new Student(5, "Priya", 2000));
		students.add(new Student(100, "Jiya", 100));
		students.add(new Student(30, "Sam", 20000));
		students.add(new Student(50, "Ayush", 500));
		
//		System.out.println(students);
		
		/*for(Student s: students) {
			System.out.println(s);
		}*/
		
//		Sorting Steps: -
//		1. Call Collections.sort() method
//		2. Pass the students list to sort method
//		Collections.sort(students);
		
//		3. Implement the Comparable interface
//		4. Pass the key for sorting
//		5. We have two value E1 and E2: -
//			i.   If E1 > E2 return 1
//			ii.  If E1 < E2 return -1
//			iii. If E1 == E2 return 0
		
		/*for(Student s: students) {
			System.out.println(s);
		}*/
		
//		Comparator -> we need to create a new class and implement comparator (SortById in 
//		this case, also sortByName)
//		For reverse logic see in SortById class
		Collections.sort(students, new SortByName());
		for(Student s: students) {
			System.out.println(s);
		}
	}
}
