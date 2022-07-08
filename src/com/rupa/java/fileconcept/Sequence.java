package com.rupa.java.fileconcept;

import java.io.*;

public class Sequence {
	public static void main(String args[]) {
		FileInputStream input1;
		try {
			input1 = new FileInputStream("/home/rupa/streamio/bufferinput");

			FileInputStream input2 = new FileInputStream("/home/rupa/streamio/buffer");
			SequenceInputStream inst = new SequenceInputStream(input1, input2);
			System.out.println(inst.available());
			int j;
			while ((j = inst.read()) != -1) {
				System.out.print((char) j);
			}inst.close();
			input1.close();
			input2.close();
		
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
}
