package com.rupa.java.fileconcept;


import java.io.*;

public class Extension {

	public static void main(String[] args) {
		File f = new File("/home/rupa/Rupa/TrainingProject/rs.txt");
		
		
		
		System.out.println(f.getName().substring((f.getName().lastIndexOf('.'))));
		
		
		/*extension = getFileExtension(new File("/home/rupa/Rupa/TrainingProject/Internal Memo_Lessons of Leadership_ACS.docx"));
		System.out.println(   file.getname()+"File Extension :- " + extension);*/
	}

	private static String getFileExtension(File file) {
		String extension = "";

		try {
			if (file != null && file.exists()) {
				String name = file.getName();
				extension = name.substring(name.lastIndexOf("."));
			}
		} catch (Exception e) {
			extension = "";
		}

		return extension;
	  	
	}
	private static File getName() {
		// TODO Auto-generated method stub
		 File f =new File("rs.txt");
		// System.out.println(f.getName());
		return  f;
			
		
	}

}
