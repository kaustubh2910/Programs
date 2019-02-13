package com.serialization.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DsznService {
	Object object;

	protected Object getDSezn() throws ClassNotFoundException {
		FileInputStream fis;
		TestClass finalObject = null;
		try {
			System.out.println("Deserializing !!!!");
			fis = new FileInputStream("F:/Interview preparation/test.txt");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			finalObject = (TestClass) ois.readObject();			
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		return finalObject;

	}

	public void sendInputObject(Object object) {
		this.object = object;

	}
}
