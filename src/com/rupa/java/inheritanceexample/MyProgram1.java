package com.rupa.java.inheritanceexample;

public class MyProgram1 extends MyProgram {
	int percentage = 21;

	public void screen() {

		System.out.println(this.percentage);
		System.out.println(super.percentage);

	}

	public static void main(String[] args) {

		MyProgram1 mp = new MyProgram1();
		mp.screen();
	}

}
