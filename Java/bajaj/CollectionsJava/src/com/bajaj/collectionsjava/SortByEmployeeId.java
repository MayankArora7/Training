package com.bajaj.collectionsjava;

import java.util.Comparator;

public class SortByEmployeeId implements Comparator<Employees>{

	@Override
	public int compare(Employees e1, Employees e2) {
		if(e1.getEmployeeID() > e2.getEmployeeID()) {
			return 1;
		}
		else if(e1.getEmployeeID() < e2.getEmployeeID()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
