package com.rupa.java.methodoverloading;

public class CollegeOverLoading {

	int marks1;
	int marks2;
	int maths;
	float percentage;
	float average;
	String name;

	public void students(int marks1, int marks2, int maths) {
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.maths = maths;

		System.out.println("marks1  is" + marks1 + "marks2" + marks2 + "maths" + maths);

	}

	public void students(float percentage, float average,String name) {

		this.percentage = percentage;
		this.average = average;
		this.name=name;
		System.out.println("percentage is" + percentage + "average " + average+"name is"+name);

	}
	// void display (){
	// System.out.println("marksis "+marks+"percentage is "+ percentage+"subject
	// is"+subject);
	// }

	public static void main(String[] args) {
		CollegeOverLoading s = new CollegeOverLoading();
		CollegeOverLoading s2 = new CollegeOverLoading();
		s.students(5, 5, 6);
		s2.students(87.8f, 95.0f,"java");

	}
}


