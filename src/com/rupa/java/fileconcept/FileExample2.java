package com.rupa.java.fileconcept;

import java.io.File;

public class FileExample2 {
	public static void main(String[] args) {
		File f = new File("/home/rupa/Rupa/TrainingProject");
		File[] file = f.listFiles();
		for (File filename : file) {
			System.out.println(filename.getPath() + "  " + filename.getName());
			
		}

	}
}
