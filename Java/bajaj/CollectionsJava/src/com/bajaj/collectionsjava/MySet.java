package com.bajaj.collectionsjava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// List -> maintains insertion order.
// Set -> does not maintain the insertion order and does not support duplicates.

// 3 types -> HashSet (does not maintain order), LinkedHashSet (maintain insertion order), 
//TreeSet (need to implement Comparable if we are using custom class (Student in this case))
// Also in TreeSet stores data in sorted form.
 
// TreeSet internally calls compareTo so we need to override it if we are using custom classes
// and not primitive data type (overridden in MyStudent.java)

public class MySet {
	public static void main(String[] args) {
//		Set<Student> studentSet = new HashSet<Student>();
//		Set<Student> studentSet = new LinkedHashSet<Student>();
//		Set<Student> studentSet = new TreeSet<Student>();
//		Set<String> studentSet = new TreeSet<String>();
		
//		We can also use Comparator
		Set<Student> studentSet = new TreeSet<Student>(new SortById());
		studentSet.add(new Student(3, "Pooja", 2000));
		studentSet.add(new Student(1, "Kamesh", 1000));
		studentSet.add(new Student(60, "Zee", 400));
		studentSet.add(new Student(5, "Priya", 2000));
		studentSet.add(new Student(100, "Jiya", 100));
		studentSet.add(new Student(30, "Sam", 20000));
		studentSet.add(new Student(50, "Ayush", 500));
		
		
		for(Student s: studentSet) {
			System.out.println(s);
		}
	}
}
