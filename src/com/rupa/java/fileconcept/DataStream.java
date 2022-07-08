package com.rupa.java.fileconcept;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class DataStream {

	public static void main(String args[]) throws Exception {
		FileOutputStream fout1 = new FileOutputStream("/home/rupa/streamio/byteoutput");
		FileOutputStream fout2 = new FileOutputStream("/home/rupa/streamio/byteoutput1");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String str = "java";
	//	byte [] b = str.getBytes() ;
		bout.write(89);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.flush();
		bout.close();// has no effect
		System.out.println("Success...");
		fout1.close();
		fout2.close();
		System.out.println("size of array "+bout.size());
		System.out.println("display the data "+bout.toString());
		System.out.println(bout.toByteArray());
		System.out.println(bout.toString(str));	
		}

}
