package com.singleton.demo;

public class SingletonClass {

	static SingletonClass obj = new SingletonClass();

	private SingletonClass() {

	}

	public static SingletonClass getBean() {

		return obj;
	}

	public void testSingleton() {

		System.out.println("Hello");
	}
}
