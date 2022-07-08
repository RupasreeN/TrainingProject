package com.rupa.java.stringexample;

public class StringContains {
	public static void main(String args[]) {
		String str1 = "ABCD";
		String str2 = "CDA";
		String s3 = str1 + str1;
		if (s3.contains(str2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
