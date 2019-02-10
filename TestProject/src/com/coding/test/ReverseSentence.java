package com.coding.test;

public class ReverseSentence {
	String reverse = "";
	String source = "My Name is Kaustubh";

	public static void main(String[] args) {
		ReverseSentence obj = new ReverseSentence();
		System.out.println(obj.reverseSentence());
		System.out.println(obj.reverseSentenceByWord());
	}

	public String reverseSentence() {
		String[] sourceArray = source.split(" ");
		for (int i = sourceArray.length - 1; i >= 0; i--) {
			reverse = reverse + sourceArray[i] + " ";
		}
		return reverse;
	}

	public String reverseSentenceByWord() {
		String[] sourceArray = source.split(" ");

		for (String word : sourceArray) {
			for (int i = word.length() - 1; i >= 0; i--) {
				String reversedWord = "";
				reversedWord = reversedWord + word.charAt(i);
				reverse = reverse + " ";
			}
		}
		return reverse;
	}

}
