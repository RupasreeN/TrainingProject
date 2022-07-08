package com.rupa.java.exceptionexample;

public class MyException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring variables
		// declaring try and catch
		int real = 5, div = 0;
		try {
			int num = real / div;
			System.out.println(num);
		} catch (ArithmeticException ae) {
			System.out.println("exception occurs" + ae);
		}
		System.out.println("re set the code");

	}

}
