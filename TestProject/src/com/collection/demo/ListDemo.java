package com.collection.demo;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(10); // capacity = (current capacity * 3/2) + 1 
		//For vector, new capacity = capacity * 2;
		list.add("Kaustubh");
		list.add("John");
		list.add("David");
		list.add("Parker");
		
		System.out.println(list.size());
		
		for (String names : list) {		//can display elements using for-each loop
			System.out.println("for-each:: "+names);
		}

		Iterator<String> itr = list.iterator(); //can display elements using iterator
		while (itr.hasNext()) {
			System.out.println("iteraor:: "+itr.next());
		}

	}

}
