package com.rupa.java.fileconcept;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInput {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("/home/rupa/streamio/bufferinput");
			BufferedInputStream bi = new BufferedInputStream(fi);
			int i;
			
			while ((i = bi.read()) != -1) {
				
				System.out.print((char) i);

			}
			
			bi.close();
			fi.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
