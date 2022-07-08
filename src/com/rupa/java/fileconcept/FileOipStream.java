package com.rupa.java.fileconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOipStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fs = new FileOutputStream("/home/rupa/Rupa/TrainingProject/filestream");
			String str;
			FileInputStream fi = new FileInputStream("/home/rupa/Rupa/TrainingProject/filestream");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter some input");
			str = sc.nextLine();
			byte b[] = str.getBytes();
			fs.write(b);
			fs.write(76);
			int i = fi.read(b);
			System.out.print((char)i);
			fs.close();
			fi.close();
			sc.close();
			System.out.println("file is created");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
