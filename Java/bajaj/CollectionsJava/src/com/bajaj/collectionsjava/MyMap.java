package com.bajaj.collectionsjava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
	public static void main(String[] args) {
		/*Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");*/
		
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("b", new Student(1001, "ABC", 5));
		map.put("c", new Student(1002, "XYZ", 1));
		map.put("a", new Student(1003, "QWERTY", 2));
		
		Set<String> keys = map.keySet();
//		Collection<String> values = map.values();
		Collection<Student> values = map.values();
		
		System.out.println(map);
		/*System.out.println(keys);
		System.out.println(values);*/
		
//		System.out.println(map.containsKey("a"));
//		System.out.println(map.isEmpty());
//		map.remove("a");
//		map.replace("a", new Student(1009, "ASDF", 3));
		
		System.out.println(map);
		for(String str: keys) {
			System.out.println(str + ", " + map.get(str));
		}
	}
}
