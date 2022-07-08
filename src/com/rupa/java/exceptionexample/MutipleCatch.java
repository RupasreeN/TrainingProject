package com.rupa.java.exceptionexample;

public class MutipleCatch {
	public static void main(String args[]) {
		try {
			int a[] = { 4, 5 };
			a[2] = 3;

		} catch (ArithmeticException ae) {
			System.out.println("divide by zero" + ae);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfException" + e);
		} catch (Exception e) {
			System.out.println("exception is occured");
		} finally {
			System.out.println("after the exception");
		}
	}

}
