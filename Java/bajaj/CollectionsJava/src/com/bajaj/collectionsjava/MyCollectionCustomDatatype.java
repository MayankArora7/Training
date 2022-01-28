package com.bajaj.collectionsjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employees1 implements Comparable<Employees1> {
	int rollno;
	String name;
	
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
	
	@Override
	public String toString() {
		return "Employees [rollno=" + rollno + ", name=" + name + "]";
	}
	public Employees1(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
//	If first value is greater return 1
//	If first value is less return -1
//	Both return 0
	
	
	@Override
	public int compareTo(Employees1 e2) {
		if(this.rollno > e2.getRollno()) {
			return -1;
		}
		else if(this.rollno < e2.getRollno()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}

public class MyCollectionCustomDatatype {
	public static void main(String[] args) {
		List<Employees1> ls = new ArrayList<Employees1>();
		
		ls.add(new Employees1(1001,"Zriya"));
		ls.add(new Employees1(100,"Ansar"));
		ls.add(new Employees1(85,"Mahesh"));
		ls.add(new Employees1(50,"Kamreah"));
			
		System.out.println(ls);
			 
		Collections.sort(ls, Collections.reverseOrder());
		
		for(Employees1 str: ls) {
			System.out.println(str.toString());
		}
	}
}