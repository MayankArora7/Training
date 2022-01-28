package com.bajaj.collectionsjava;

import java.util.Comparator;

public class SortById implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getId() > s2.getId()) {
			return 1;			// return -1 for reverse
		}
		else if(s1.getId() < s2.getId()) {
			return -1;			// return 1 for reverse i.e. return -1 in the first case and 1 in the second 
								// otherwise it wont work if you just change on of them (for reverse).
		}
		else {
			return 0;
		}
	}
}
