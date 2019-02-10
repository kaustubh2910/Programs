package com.collection.demo;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Kaustubh");
		set.add("John");
		set.add("David");
		set.add("Parker");
		set.add(null);
		set.add("Kaustubh");
		
		System.out.println(set.size());
	}

}
