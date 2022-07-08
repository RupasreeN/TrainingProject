package com.rupa.java.collections;

import java.util.*;

public class TreeSetEx {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) {
		// Creating and adding elements

		TreeSet set = new TreeSet();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		
		// traversing elements
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(set);
		TreeSet ts = new TreeSet();
		ts.add(243543);
		ts.add(675);
		System.out.println(ts);
	}

}
