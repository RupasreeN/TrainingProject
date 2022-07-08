package com.rupa.java.inheritanceexample;

public class MyEmployee extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmployee emp = new MyEmployee();
		System.out.println(emp.idnum);
		System.out.println(emp.name);
		System.out.println(emp.work);
		emp.display();
	}

}
