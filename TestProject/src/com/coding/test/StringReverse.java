package com.coding.test;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String source;
		String reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:: ");
		source = sc.nextLine();
		for (int i = source.length() - 1; i >= 0; i--) {

			reverse = reverse + source.charAt(i);
		}
		System.out.println("Reversed String::: " + reverse);

	}

}
