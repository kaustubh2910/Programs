package com.serialization.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SznService {
	Object object;

	protected void getSezn() {
		FileOutputStream fos;
		try {
			System.out.println("Serializing !!!!");
			fos = new FileOutputStream("F:/Interview preparation/test.txt");
			@SuppressWarnings("resource")
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(object);
		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}

	public void sendInputObject(Object object) {
		this.object = object;

	}
}
