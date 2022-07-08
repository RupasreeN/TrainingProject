package com.rupa.java.stringexample;

public class Spaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello , how are you?";
		str = str.replaceAll("[?,.]", " ");
		System.out.println(str);
		String[] words = str.split("\\s");
		System.out.println(words);

		for (String w : words) {
			System.out.println(w);
		}

	}

}
