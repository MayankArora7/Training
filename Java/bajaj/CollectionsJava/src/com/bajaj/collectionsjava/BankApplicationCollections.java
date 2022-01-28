package com.bajaj.collectionsjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Employees {
	private int employeeID;
	private String name;
	private List<Employees> ls = new ArrayList<Employees>();
	
	public Employees() {}
	public Employees(int employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}
	

	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Employees> getLs() {
		return ls;
	}


	public void setLs(List<Employees> ls) {
		this.ls = ls;
	}

	@Override
	public String toString() {
		return "Employees [employeeID=" + employeeID + ", name=" + name + "]";
	}
	
	public void printAll() {
		for(Employees element: ls) {
			System.out.println(element);
		}
	}
	
	public void insert(Employees e) {
		int index = search(e.employeeID);
		if(index == -1) {
			ls.add(e);
		}
		else {
			System.out.println("Employee ID already exists");
		}
	}
	
	public int search(int id) {
		for(int i = 0; i < ls.size(); i++) {
			if(ls.get(i).employeeID == id) {
				return i;
			}
		}
		return -1;
	}
	
	public void delete(int id) {
		int index = search(id);
		if(index != -1) {
			ls.remove(index);
		}
		else {
			System.out.println("Employee not Found");
		}
	}
	
	public void update(int id) {
		Scanner sc = new Scanner(System.in);
		int index = search(id);
		if(index != -1) {
			System.out.print("Employee Found, Enter new ID and Name: ");
			int id1 = sc.nextInt();
			String name = sc.next();
			
			ls.set(index, new Employees(id1, name));
		}
		else {
			System.out.println("Employee not Found");
		}
		sc.close();
	}
}

public class BankApplicationCollections {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employees e = new Employees();
		
		while(true) {
			System.out.println("Enter 1 for insert");
			System.out.println("Enter 2 for delete");
			System.out.println("Enter 3 for update");
			System.out.println("Enter 4 for search by ID");
			System.out.println("Enter 5 for sort ASC");
			System.out.println("Enter 6 for sort DESC");
			System.out.println("Enter 7 for Print All");
			System.out.println("Enter 8 for exit");
			System.out.print("Select your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter ID and Name: ");
				int id1 = sc.nextInt();
				String name = sc.next();
				
				Employees employee = new Employees(id1, name);
				e.insert(employee);
				break;
				
			case 2:
				System.out.print("Enter ID: ");
				int id2 = sc.nextInt();
				
				e.delete(id2);
				e.printAll();
				break;
				
			case 3:
				System.out.print("Enter ID: ");
				int id3 = sc.nextInt();
				e.update(id3);
				e.printAll();
				break;
				
			case 4:
				System.out.print("Enter ID to search: ");
				int id4 = sc.nextInt();
				
				int index = e.search(id4);
				if(index != -1) {
					System.out.println("Employee Found: " + e.getLs().get(index));
				}
				else {
					System.out.println("Employee not Found");
				}
				 break;
				 
			case 5:
				Collections.sort(e.getLs(), new SortByEmployeeId());
				e.printAll();
				break;
				
			case 6:
				Collections.sort(e.getLs(), new SortEmployeeByIdDesc());
				e.printAll();
				break;
				
			case 7:
				e.printAll();
				break;
				
			case 8:
				System.err.println("Quitting...");
				sc.close();
				System.exit(0);
				break;
			}
		}
	}
}
