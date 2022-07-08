package com.rupa.java.stringexample;

import java.util.Scanner;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		char temp = '0';
		System.out.println(" enter the first string");
		String str1 = sc.nextLine();
		char ch1[] = str1.toCharArray();
		System.out.println("enter the second string ");
		String str2 = sc.nextLine();
		char ch2[] = str2.toCharArray();

		for (int i = 0; i < str1.length(); i++) {

			for (int j = i + 1; j < str1.length(); j++) {

				if (ch1[i] > ch1[j]) {
					temp = ch1[i];
					ch1[i] = ch1[i + 1];
					ch1[i + 1] = temp;
				}
			}
		}
		System.out.println(ch1);

		for (int i = 0; i < str2.length(); i++) {

			for (int j = i + 1; j < str2.length(); j++) {

				if (ch2[i] > ch2[j]) {
					temp = ch2[i];
					ch2[i] = ch2[i + 1];
					ch2[i + 1] = temp;
				}
			}
		}
		System.out.println(ch2);

		for (int j = 0; j < str1.length(); j++) {

			if (ch1[j] != ch2[j]) {
				a = false;

			}
			System.out.println(ch1);
		}

		if (a == true) {
			System.out.println("strings are equal");
		} else {
			System.out.println("strings are not equal");

		}

	}

}
