package com.rupa.java.stringexample;

public class Count {
	public static void main(String args[]) {
		String str = "we are 45465 in primesoft";

		int vowels = 0, consonants = 0, digits = 0, spaces = 0, letters = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {

				vowels++;
			}

			else if ((ch >= 'a') && (ch <= 'z')) {
				consonants++;

			}

			else if ((ch >= '0') && (ch <= '9')) {
				digits++;
			}

			else {
				spaces++;
			}
		}
		String words[] = str.split("//s");
		System.out.println(words);
		letters = vowels + consonants + digits + spaces;
		System.out.println(str.length());
		System.out.println(vowels);
		System.out.println(consonants);
		System.out.println("dig: " + digits);
		System.out.println(spaces);
		System.out.println(letters);

		if (letters == str.length()) {
			System.out.println("count is equal");
		}

		else {
			System.out.println("count is not equal");
		}
	}
}
