package com.rupa.java.stringexample;

public class WhiteSpaces {
	public static void main(String args[]) {
		String space = "t his  is a ja  va pro gram";
		System.out.println(space);
		space = space.replaceAll("//s ", "");
		System.out.println("after the string is" + space);
	}

}
