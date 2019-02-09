package com.coding.test;

import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) {
		int count = 0;
		String source;
		System.out.println("Enter the string =>");
		Scanner sc = new Scanner(System.in);
		source = sc.nextLine();
		char[] sourceArray = source.toCharArray();
		for (int i = 0; i < sourceArray.length; i++) {
			count++;
		}
		System.out.println("Length :: " + count);
	}

}
