package com.rupa.java.inheritanceexample;

public class Cat extends Animal {
	void meow() {
		System.out.println("meow");
	}

	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
	}

}
