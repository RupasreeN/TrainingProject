package com.rupa.java.exceptionexample;

import java.util.Scanner;

public class VerifyString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		try {
				str.equals("java");
				StringException se=new StringException();
				throw (se);
			
		} catch (StringException se) {
			System.out.println("string exception is raised ");
		} catch (Exception e) {
			System.out.println("exception is raised");
		}sc.close();
		
	}
}
