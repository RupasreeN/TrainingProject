package com.rupa.java.stringexample;

import java.util.Scanner;

public class Example {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Your name: ");
		String name = scanner.nextLine(); // we know it's a `string`

		System.out.println(" your age is");
		int age = scanner.nextInt(); // it's an integer

		Scanner scanner1 = new Scanner(System.in);

		System.out.println("Location: ");
		String location = scanner1.nextLine(); // a string again
		scanner.close();
	}
}
