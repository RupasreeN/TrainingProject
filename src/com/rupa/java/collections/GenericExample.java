package com.rupa.java.collections;

import java.util.*;

public class GenericExample {
	public static void main(String args[]){
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("rupa");
		ls.add("sree");
		ls.add("java");
		for(String obj:ls) {
			System.out.println(obj);
		}
		//try{	
		Iterator<String>  it = ls.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
		//}
		}//catch(Exception e){
		//	System.out.println("class out of bound exception is rarised");
		//}
	}

}
