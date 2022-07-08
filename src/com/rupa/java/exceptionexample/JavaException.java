package com.rupa.java.exceptionexample;

public class JavaException {
	// private static char[] fraction;

	public static void main(String args[]) {
		int fraction = 0;
		try {
			int denominator = 2;
			int numerator = 20;
			fraction = numerator / denominator;
			int goal[] = { 1 };
			goal[20] = 100;
		} catch (ArithmeticException ae) {
			System.out.println("In the catch clock due to Exception = " + ae);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("In the catch clock due to Exception = " + e);
		} finally {
			System.out.println("bye");
		}
		System.out.println(fraction);
	}
}
