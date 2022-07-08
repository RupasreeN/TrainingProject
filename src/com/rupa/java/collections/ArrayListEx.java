package com.rupa.java.collections;

import java.util.*;

public class ArrayListEx {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		ArrayList list = new ArrayList();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add(465);
		// finding size of list
		System.out.println("size is" + list.size());
		// finding is list is empty or not
		System.out.println("is list is emtpy" + list.isEmpty());
		System.out.println("printing first list of elements");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// creating another list
		ArrayList al = new ArrayList();
		// adding list of one elements to another list
		// System.out.println(list.contains(al));
		al.add("rupa");
		al.add("sree");
		al.add("rupa");
		al.add(34555);
		al.addAll(list);

		System.out.println("printing second list of elements");
		System.out.println(al);

		System.out.println(al.contains("Ajay"));
		System.out.println(al.containsAll(list));
		list.add(al);
		System.out.println(list);
		// removing elements

		list.remove("Ravi");
		list.remove(3);
		System.out.println(list);

	}

}