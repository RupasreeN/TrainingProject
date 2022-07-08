package com.rupa.java.accessmodifiers;

public class ExampleForAccessSpecifiers {
	 static public int a=10;
	private  static int  b= 20;
	 static protected float c=99.9f;
	 static double d=47.57d;
	
	private static String privatename = "private string";
	protected static String protectedname = "protected string";
	static String defaultname = "defaultstring";
	public static String name = "public string";

	private static void method1() {
		System.out.println(privatename);
	}

	protected static void method2() {
		System.out.println(protectedname);
	}

	static void method3() {
		System.out.println(defaultname);
	}

	public static void method4() {
		System.out.println(name);
	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ExampleForAccessSpecifiers ea = new ExampleForAccessSpecifiers();
//		method1();
//		method2();
//	method3();
//	method4();
//	
//	System.out.println(ea.a);
//	System.out.println(b);
//	System.out.println(ea.c);
//	System.out.println(ea.d);
//



	}

//}
