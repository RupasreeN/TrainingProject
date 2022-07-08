package com.rupa.java.constructorexample;

public class Student2 {
	int rollno;// instance variable
	String name;
	static String college = "ITS";// static variable
	// constructor

	Student2(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	// Test class to show the values of objects
	public static void main(String args[]) {
		Student2 s1 = new Student2(111, "Karan");
		Student2 s2 = new Student2(222, "Aryan");
		// we can change the college of all objects by the single line of code
		college = "BBDIT";
		s1.display();
		college = "fbjh";
		s2.display();

	}

}
