package com.rupa.java.streamexample;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInExample2 {

	public static void main(String args[]) throws IOException {

		FileInputStream fin = new FileInputStream("StreamExample.txt");
		int i = 0;
		while ((i = fin.read()) != -1) {
			System.out.print((char) i);

			
		}
		fin.close();

	}
}
