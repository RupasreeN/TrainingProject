package com.rupa.java.staticexample;

public class Student412 {

	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable
	static void change() {
		college = "BBDIT";
	}

	// constructor to initialize the variable
	  Student412(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		Student412.change();// calling change method
		// creating objects
		Student412 s1 = new Student412(111, "Karan");
		Student412 s2 = new Student412(222, "Aryan");
		Student412 s3 = new Student412(333, "Sonoo");
		// calling display method
		s1.display();
		s2.display();
		s3.display();
	}
}
