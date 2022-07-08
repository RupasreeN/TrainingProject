package com.rupa.java.collections;
import java.util.*;

public class VectorEx {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]){  
		Vector v=new Vector();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		}


