package com.rupa.java.wrapperexample;

public class ExampleWrappper {
	public static void main(String[] args) {
		int i = 6474;
		Integer integer = i;// auto boxing int to Integer;
		System.out.println(integer);
		Integer j = Integer.valueOf(i);// using a method to convert int to
										// Integer
		System.out.println(j);
		int k = j;// .intValue();// unboxing
		System.out.println(k);
		// converting float variable into Interger class
		float f = 4547547.58346f;
		Integer e = (int) f;
		System.out.println(e);

		// // coverting float itno Float class
		float varible = 45274.336f;
		Float b = Float.valueOf(varible);
		System.out.println(b);

		// //auto boxing
		Float m = varible;
		System.out.println(m);
		// unboxing
		// float vari = m.floatValue(m);

	}

}
