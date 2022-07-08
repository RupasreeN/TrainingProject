package com.rupa.java.fileconcept;

import java.io.*;

public class Bufferout {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("/home/rupa/buffer");
			BufferedOutputStream br = new BufferedOutputStream(fout);
			String str = "this is buffered program";
			byte b[] = str.getBytes();
			br.write(b);
			br.write(65);
			fout.flush ();
			br.close();
			fout.close();
			System.out.println("file is created");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
