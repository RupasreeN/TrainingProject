package com.rupa.java.exceptionexample;

public class MyExceptionArray1 {

	public static void main(String args[]) {
		int array[] = new int[5];
		for (int index = 0; index < 4; index++) {
			array[index] = index + 1;
		}
		// declaring try and catch method

		try {
			System.out.println(array[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("EXCCEPTION OCCURS" + e);
		}
		System.out.println("please enter correct input");
	}

}
