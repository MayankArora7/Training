package com.bajaj.javaoops;

import java.util.Scanner;

// CLI based application
// Menu based
class Employees {
	private int employeeID;
	private String name;
	
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
	
	@Override
	public String toString() {
		return "Employees [employeeID=" + employeeID + ", name=" + name + "]";
	}
	
	public void printAll(int limit, Employees[] e) {
		for(int i = 0; i < limit; i++) {
			System.out.println(e[i]);
		}
	}
	
	public int searchById(int id, Employees[] e) {
		int pos = 0;
		for(int i = 0; i < e.length; i++) {
			if(id == e[i].employeeID) {
				pos = i;
				break;
			}
		}
		return pos;
	}
}

public class BankApplication {
	public static void main(String[] args) {
		Employees[] value = new Employees[0];
		Employees e = new Employees();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter 1 for insert");
			System.out.println("Enter 2 for delete");
			System.out.println("Enter 3 for update");
			System.out.println("Enter 4 for search by ID");
			System.out.println("Enter 5 for sort ASC");
			System.out.println("Enter 6 for sort DESC");
			System.out.println("Enter 7 for exit");
			System.out.print("Select your choice: ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				Employees[] valueDup = new Employees[value.length + 1];
				
				for(int i = 0; i < value.length; i++) {
					valueDup[i] = value[i];
				}
				e.printAll(value.length, value);
				
				System.out.print("Enter ID and Name: ");
				int id = sc.nextInt();
				String name = sc.next();
					
				Employees employee = new Employees(id, name);
				valueDup[value.length] = employee;
				
				value = new Employees[valueDup.length];
				for(int i = 0; i < valueDup.length; i++) {
					value[i] = valueDup[i];
				}
				e.printAll(valueDup.length, value);
			}
			
			else if(choice == 2) {
				int j = 0;
				System.out.print("Enter ID to delete: ");
				int id = sc.nextInt();
				Employees[] valueDup = new Employees[value.length - 1];
				
				for(int i = 0; i < value.length; i++) {
					if(id != value[i].getEmployeeID()) {
						valueDup[j] = value[i];
						j++;
					}
				}
				value = new Employees[valueDup.length];
				for(int i = 0; i < valueDup.length; i++) {
					value[i] = valueDup[i];
				}
				e.printAll(valueDup.length, value);
			}
			else if(choice == 3) {
				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				int index = e.searchById(id, value);
				System.out.print("Employee found, enter new id and name: ");
				
				int newID = sc.nextInt();
				String name = sc.next();
				
				Employees employee = new Employees(newID, name);
				value[index] = employee;
			}
			
			else if(choice == 4) {
				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				int index = e.searchById(id, value);
				System.out.println(value[index]);
			}
			
			else if(choice == 5) {
				int i, j;
				for(i = 0; i < value.length-1; i++) {
					for(j = 0; j < value.length-i-1; j++) {
						if(value[j].getEmployeeID() > value[j+1].getEmployeeID()) {
							Employees dup = value[j];
							value[j] = value[j+1];
							value[j+1] = dup;
						}
					}
				}
				for(int k = 0; i < value.length; k++) {
					System.out.println("Value on location " + k + ": " + value[k]);
				}
			}
			
			else if(choice == 6) {
				int i, j;
				for(i = 0; i < value.length-1; i++) {
					for(j = 0; j < value.length-i-1; j++) {
						if(value[j].getEmployeeID() < value[j+1].getEmployeeID()) {
							Employees dup = value[j];
							value[j] = value[j+1];
							value[j+1] = dup;
						}
					}
				}
				for(int k = 0; i < value.length; k++) {
					System.out.println("Value on location " + k + ": " + value[k]);
				}
			}

			if(choice == 7) {
				System.err.println("Quitting...");
				break;
			}
		}
		sc.close();
	}
}
