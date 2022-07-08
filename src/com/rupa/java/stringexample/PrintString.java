package com.rupa.java.stringexample;

public class PrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello, how are you?");

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z'))) {
				System.out.print(str.charAt(i));

			}

		}

	}

}
