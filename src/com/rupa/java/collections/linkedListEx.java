package com.rupa.java.collections;

import java.util.*;

public class linkedListEx {

	public static void main(String args[]) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.addLast("rupa");
		al.add("Ravi");
		al.add("Ajay");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(al);
		// clearing the list
		// al.clear();
		// System.out.println(al);
		// al.addAll(al);
		// removing the first element
		System.out.println(" removing the first element" + al.removeFirst());
		// removing the last element
		System.out.println(" remove the last element" + al.removeLast());
		// pushing an element in place of another element
		al.push("java");
		System.out.println( " pushing an element"+ al);
		System.out.println(al.clone());
		//poping the element
		System.out.println( " popping the first element " +al.pop());
	}

}
