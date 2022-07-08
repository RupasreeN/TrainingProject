package com.rupa.java.stringexample;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(str);
		System.out.println("reversed string is");
		System.out.println(reverse);
		if (str.equals(reverse)) {
			System.out.println("its a palindrome");
		} else {
			System.out.println("its not palindrome");
		}

	}

}


