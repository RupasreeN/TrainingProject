package com.rupa.java.constructorexample;

public class Student {
	int num;
	String name;
	int age;

	Student(int i, String n, int a) {
		num = i;
		name = n;
		age = a;
	}

	Student(int i, String n) {
		num = i;
		name = n;
		System.out.println("hai");
	}

	void display() {
		System.out.println(num + name + age);
	}

	public static void main(String args[]) {
		Student s1 = new Student(45, "rupa");
		s1.display();
		Student s2 = new Student(4, "rup", 20);
		s2.display();

	}

}
