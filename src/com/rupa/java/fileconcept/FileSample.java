package com.rupa.java.fileconcept;

import java.io.File;
import java.nio.file.Files;

public class FileSample {
	public static void main(String []args){
		File f = new  File("/home/rupa/Rupa/TrainingProject");
		String [] file =f.list();
		for( String filename : file)
		{
			System.out.println(filename.length()+"  "+ filename);
		}
		String extension = getFileExtension("/home/rupa/Rupa/TrainingProject");
		System.out.println("File Extension :- " + extension);
		/*
		String path = "c:/path/to/file/foo.txt";
		String ext = Files.getFileExtension(path);
		System.out.println(ext); //prints txt
		*/
		
		
	}
	
     	private static String getFileExtension(String string) {
		// TODO Auto-generated method stub
		return null;
	}

     	
     	
}
