package com.coding.test;

import java.io.File;

public class FileIO2 {

	public static void main(String[] args) {

		File fobj = new File("/home/ksonawane/Desktop/DB changes");
		File farray[] = fobj.listFiles();

		for (File f : farray) {

			System.out.println(f.getName());
		}
	}

}
