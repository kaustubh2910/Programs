package com.coding.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {
		String contents;
		BufferedReader br;
		try {
			FileReader fr = new FileReader("/home/ksonawane/Desktop/DB changes/DB changes V4.9");
			br = new BufferedReader(fr);
			while ((contents = br.readLine()) != null) {

				System.out.println(contents);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
