package com.rupa.java.fileconcept;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputClass {
	public static void main(String[] args) throws IOException {
		FileOutputStream fr = new FileOutputStream("/home/rupa/streamio/dataoutputstream");
		DataOutputStream ds = new DataOutputStream(fr);

		ds.write(65);
	
		ds.flush();
		ds.close();
		fr.close();
		System.out.println("file is created ");

	}

}
