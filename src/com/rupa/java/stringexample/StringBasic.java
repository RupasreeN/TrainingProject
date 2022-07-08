package com.rupa.java.stringexample;

public class StringBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "java";// creating string by java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String name2 = new String(ch);// converting char array to string
		String name3 = new String("example");// creating java string by new
												// keyword
		String name4 = "java";
		String name5 = new String("example");
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		// string comparison

		if (name1 == name5) {
			System.out.println("strings are equal");
		}

		else {
			System.out.println("strings are notequal ");
		}

		System.out.println(name4.equals(name1));
		System.out.println(name4.compareTo(name1));

	}

}
