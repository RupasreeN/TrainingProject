package com.rupa.java.fileconcept;
import java.io.*;


import java.io.FileReader;

public class TestFileEx {
	public static void main(String[] args) {
		File f = new File("/home/rupa/Rupa/TrainingProject/rs");

		try {
			FileWriter fw = new FileWriter("rs");
			File fi = f.getCanonicalFile();
			System.out.println(fi);
			fw.write("welcome to  my world,have a nice day");
			System.out.println("is file created " + f.createNewFile());
			System.out.println("is file can executed  " + f.canExecute());
			fw.close();

		} catch (Exception e) {
			System.out.println("file does not exists");
		}
		try {
			FileReader fr = new FileReader("rs");

			// f.createTempFile("java","program");

			int i = 0;

			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();
		} catch (FileNotFoundException fe) {
			System.out.println("file not found");
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println();
		System.out.println("reading a file  " + f.canRead());
		System.out.println("ckecking its directory or not  " + f.isDirectory());
		System.out.println("absolute " + f.isAbsolute());
		System.out.println("ckecking its file or not  " + f.isFile());
		System.out.println("getting the location of file " + f.getParent());
		System.out.println("getting the name of file  " + f.getName());
		System.out.println("displaying the path of file  " + f.toPath());
		System.out.println(f.getFreeSpace());
		System.out.println(f.toURI());
		f.mkdir();
		System.out.println(f.getParentFile());
		System.out.println(f.exists());
		System.out.println("last modified"+f.lastModified());
		System.out.println("length of file "+f.length());
		System.out.println("total space of file"+f.getTotalSpace());
		System.out.println("total free space"+f.getFreeSpace());
		System.out.println("usage space"+f.getUsableSpace());
	
		System.out.println(f.setReadable(true));
	}

}
