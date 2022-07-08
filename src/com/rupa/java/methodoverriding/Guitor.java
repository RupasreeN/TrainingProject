package com.rupa.java.methodoverriding;

public class Guitor extends Instrument {
	void play(){
		System.out.println("guitor is playing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guitor gt=new Guitor();
		gt.play();
		

	}

}
