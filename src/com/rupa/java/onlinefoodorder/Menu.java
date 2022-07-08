package com.rupa.java.myproject;

import java.util.Scanner;

public class Menu {
	public static int totalBill;
	public static int cost;

	public static void choosingMenu() {
		System.out.println("SELECT THE OPTION");
		System.out.println("1.SHOW MENU 2.TOTALBILL 3.LOGOUT");
		Scanner s = new Scanner(System.in);
		int option = s.nextInt();
		if(option !=3) {
		switch (option) {
		case 1:
			System.out.println("b:Biriyani");
			System.out.println("p:Potato Curry");
			System.out.println("e:Egg Curry");
			System.out.println("i:Ice Cream");
			System.out.println("\nEnter the name of the item");
			Item.checkItem();
			break;
		case 2:
			System.out.println("Total bill is");
			billDisplay();
			break;
		default:
			System.out.println("Enter the correct option");
			break;
		}
		} else { 
			System.out.println("Thank you visit the website again");
			
		}
		s.close();
	}

	public static void display(int x) {
		System.out.println("Enter the number of Quantity required");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("You have ordered " + number + " Items");
			
			cost = number * x;
			System.out.println("Item cost is " + cost);
			totalBill(cost);
			choosingMenu();
		sc.close();
	}

	public static void deliveryBasis() {
		System.out.println("Items will be delivered on the basis of cash on delivery");
		System.out.println("Thankyou");
	}

	public static void totalBill(int cost) {
		totalBill=totalBill+cost;
		//System.out.println(totalBill);
	}
	
	public static void billDisplay() {
		System.out.println(totalBill);
		deliveryBasis();
	
	}
}

