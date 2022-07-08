package com.rupa.java.collections;

import java.util.*;

public class Stackex {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		Stack stack = new Stack();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		stack.pop();
		Iterator itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		//returing the element present in the top of stack
		System.out.println(" return the top of element" + stack.peek());
		//returning the element in the index value
		System.out.println(stack.get(1));
		//returning the indexvalue from element
		System.out.println(stack.indexOf("Ayush"));
	}
}
