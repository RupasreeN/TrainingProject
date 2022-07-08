package com.rupa.java.fileconcept;

import java.io.*;

public class TestFile {

	public static void main(String[] args) {

		try {
			File file = new File("javaFile123.txt");
			if (file.createNewFile()) {
				System.out.println("New File is created!");
				System.out.println(file);
			} else {
				System.out.println("File already exists.");
				System.out.println(file);
			}
		} catch (IOException e) {
			// e.printStackTrace();
		}

	}
}
