package com.exception.emo;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class ExceptionDemo {
	public static void main(String args[]) {
		try {
			throw new MyException("Aurus Exception");
		} catch (MyException ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}
