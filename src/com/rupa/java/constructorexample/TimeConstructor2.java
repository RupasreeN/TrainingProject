package com.rupa.java.constructorexample;

public class TimeConstructor2 {
	int hour, minute, seconds;

	TimeConstructor2() {
		hour = 0;
		minute = 0;
		seconds = 0;

	}

	TimeConstructor2(int h, int m) {
		hour = h;
		minute = m;

	}

	TimeConstructor2(int h, int m, int s) {
		hour = h;
		minute = m;
		seconds = s;

	}

	public void display() {
		System.out.println("hour" + hour + "minute" + minute + "seconds" + seconds);
	}

	public static void main(String[] args) {
		TimeConstructor2 tc = new TimeConstructor2();
		tc.display();
		TimeConstructor2 tc1 = new TimeConstructor2(5, 6);
		tc1.display();
		TimeConstructor2 tc2 = new TimeConstructor2(24, 56, 60);
		tc2.display();

	}
}
