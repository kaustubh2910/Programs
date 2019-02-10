package com.collection.demo;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(101,"Kaustubh");
		map.put(103,"Peter");
		map.put(102,"David");
		map.put(104,"Dexter");
		//map.put(null, "abc");	//null key is not allowed in TreeMap
		
		System.out.println(map);
	}

}
