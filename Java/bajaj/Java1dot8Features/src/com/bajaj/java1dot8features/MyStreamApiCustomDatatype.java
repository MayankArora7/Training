package com.bajaj.java1dot8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student1 {
	private int rollno;
	private String name;
	private int fees;

	public Student1(int rollno, String name, int fees) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
		return "Student1 [rollno=" + rollno + ", name=" + name + ", fees=" + fees + "]";
	}
}

public class MyStreamApiCustomDatatype {
	public static void main(String[] args) {
		List<Student1> ls = new ArrayList<Student1>();
		
		ls.add(new Student1(1, "Ansar", 2000)); 
		ls.add(new Student1(200, "Pooja", 1000)); 
		ls.add(new Student1(2, "Priya", 500));
		
		List<Integer> ls1 = ls.stream()
		.filter(student->student.getFees()>500)
		.map(s->s.getRollno()) 
		.collect(Collectors.toList());
		
		ls1.forEach(s->System.out.println(s));
		
		List<String> ls2=ls.stream()
		.filter(student->student.getName().startsWith("A"))
		.map(s->s.getName().toUpperCase()) .collect(Collectors.toList());
		
		ls2.forEach(s->System.out.println(s));
	}
}