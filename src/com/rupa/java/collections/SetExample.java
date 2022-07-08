package com.rupa.java.collections;

import java.util.*;

public class SetExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		HashSet set = new HashSet();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		set.add(1233);
		// returing the hash code of the set
		System.out.println(" hash code is " + set.hashCode());
		System.out.println(" set of elements " + set);
		// Traversing elements
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		HashSet hs = new HashSet();
		hs.addAll(set);
		hs.add("rupa");
		hs.add("sree");
		//cotains the set1 elements in set2
		System.out.println( "set1 cotains set2 " + hs.containsAll(set));
		System.out.println(hs);
		System.out.println(hs.toArray());

	}
}
