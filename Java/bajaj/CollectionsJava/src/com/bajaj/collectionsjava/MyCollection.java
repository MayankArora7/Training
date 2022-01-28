package com.bajaj.collectionsjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

class MyList {
	
}
public class MyCollection {
	public static void main(String[] args) {
//		Parent -> List, Child -> ArrayList
		List<String> ls = new ArrayList<String>();
//		List<String> ls = new LinkedList<String>();
//		List<String> ls = new Stack<String>();
//		List<String> ls = new Vector<String>();
		ls.add("Mahesh");
		ls.add("Priya");
		ls.add("Ansar");
		ls.add("Jake");
		/*ls.add(1);
		ls.add(10.2f);*/
		
//		ls.remove(0);	remove by index
		/*ls.remove("ABC");
		
		if(ls.contains(1)) {
			System.out.println("Found");
		}
		System.out.println(ls.get(1));
		System.out.println(ls.isEmpty());
//		ls.clear();
		System.out.println(ls.size());*/
		Collections.sort(ls, Collections.reverseOrder());
//		System.out.println(ls);
		
//		For each loop
		for(String str: ls) {
			System.out.println(str);
		}
	}
}
