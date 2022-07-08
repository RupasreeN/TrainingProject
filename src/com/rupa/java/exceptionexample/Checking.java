package com.rupa.java.exceptionexample;

import java.util.Scanner;

public class Checking {
	public static void main(String[] args) {
		int num1, num2,num;
		@SuppressWarnings("resource")
		Scanner c = new Scanner(System.in);
		System.out.println("enter two nos");
		num1 = c.nextInt();
		num2 = c.nextInt();

		try {
			 num = num1 / num2;
		} catch (ArithmeticException ae) {
			System.out.println("exception is occured" + ae);
			System.out.println("second no not be a zero");
			num2 = c.nextInt();
			num = num1 / num2;
		}
		System.out.println(num);
	}
}
