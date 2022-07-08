package com.rupa.java.myproject;

import java.util.Scanner;

public class Item {
	
	public static void checkItem() {
		Scanner sc=new Scanner(System.in);
		String item=sc.nextLine();
		switch(item) {
		    case "b": System.out.println("Biryani is available"); 
		    			System.out.println("Biryani cost is 220");
					    Menu.display(220);
					    break;
		    case "p":  System.out.println("Potato Curry is available"); 
		    			 System.out.println("Potato Curry cost is 180");
		                 Menu.display(180);
		                 break;
		    case "e":  System.out.println("Egg Curry is available"); 
		    			System.out.println("Egg Curry cost is 150");
		 				Menu.display(150);
		 				break;
		    case "i":  System.out.println("Ice Cream is available"); 
						System.out.println("Ice Cream cost is 80");
							Menu.display(80);
				break;		 				
		    default :	System.out.println("Item not available");
		    			Menu.choosingMenu();
		    			break;
	    }
		sc.close();
	
	}

}

