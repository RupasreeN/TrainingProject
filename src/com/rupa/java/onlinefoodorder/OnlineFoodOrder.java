package com.rupa.java.myproject;

import java.util.Scanner;
import java.util.Vector;

public class OnlineFoodOrder {

	public static void loginId(int id,String name) {
		String s=String.valueOf(id);
		Vector<String> customerName=new Vector<>(10);
		Vector<String> customerId=new Vector<>(10);
		customerName.add("Rupa");
		customerName.add("sri");
		customerId.add("123");
		customerId.add("412");
		if (customerId.contains(s)&&customerName.contains(name)) {
			System.out.println("WELCOME TO THE ONLINE FOOD ORDER SYSTEM");
			Menu.choosingMenu();

		} else {
			System.out.println("Incorrect login id");
			System.out.println("OR create a login id");
		}
	}

	public static void main(String args[]) {
		
		System.out.println("ENTER THE CUSTOMER NAME");
		Scanner c=new Scanner(System.in);
		String name=c.nextLine();
		System.out.println("ENTER THE LOGIN ID");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		loginId(id,name);
		c.close();
		sc.close();

	}

}

