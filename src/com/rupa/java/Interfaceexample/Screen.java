package com.rupa.java.Interfaceexample;

public class Screen  implements Showable{
	public void print1(){
		System.out.println("the method is printable");
	}
	public void show(){
		System.out.println("the method is showable");
	}
	public static void main(String [] args){
		Screen s=new Screen();
		s.print1();
		s.show();
	}
	


}
