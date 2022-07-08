package com.rupa.java.vectorsexamples;

import java.util.Vector;

public class SampleVector {
	public static void main(String args[]) {
		Vector<String> vec = new Vector<String>();
		Vector<String> ve = new Vector<String>();
		vec.add("paper");
		vec.add("pen");
		vec.add("book");
		vec.add("bag");
		ve.add("paper");
		ve.add("pen");
		ve.add("book");
		ve.add("bag");

		// adding element at particular index
		vec.setElementAt("marker", 2);
		System.out.println(vec);
		// clonning the vector
		System.out.println("cloned vector is " + vec.clone());
		System.out.println("size of vector is " + vec.size());
		System.out.println("capacity of vector" + vec.capacity());
		// clearing the vector
		vec.clear();
		System.out.println("size of vector  after clearing vector is " + vec.size());
		System.out.println("Existence  " + vec.contains("pen"));
		// cheking if two vectors are equal are not
		System.out.println("Existence of another vector  " + ve.containsAll(vec));
		// copying the vector into array
		String arr[] = new String[4];
		ve.copyInto(arr);

	}

}
