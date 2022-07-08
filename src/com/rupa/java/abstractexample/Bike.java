package com.rupa.java.abstractexample;

class Bike extends Vehicle {
	void speed() {
		System.out.println("Speed limit is 40 km/hr..");
	}

	public static void main(String args[]) {
		Vehicle obj = new Bike(); // indirect object creation
		obj.speed();
	}

}
