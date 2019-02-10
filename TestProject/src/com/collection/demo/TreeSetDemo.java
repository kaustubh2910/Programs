package com.collection.demo;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		t.add("Kaustubh");
		t.add("John");
		t.add("David");
		t.add("Parker");
		//t.add(new Integer(10));  //ClassCastException
		//t.add(null); //NullPointerException ,Null insertion is possible if there is only one element(i.e null element)
		System.out.println(t);
	}

}
