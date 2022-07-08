package com.rupa.java.foodordersystemproject;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

//Creating a method to display the different items food
public class ItemsList {
	// This method displays for customer choosing the item "Biriyani"
	public static void biriyani() throws Exception {
		try {
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			switch (s) {
			case 1: {
				System.out.println("YOU ARE ENTERED CHICKENBIRIYANI");
				System.out.println(" COST IS 220RS...");
				FoodDetails.display(220);
				break;

			}
			case 2: {
				System.out.println("YOU ARE ENTERED VEGBIRIYANI");
				System.out.println("COST IS 150RS...");
				FoodDetails.display(150);
				break;

			}
			case 3: {
				System.out.println("YOU ARE ENTERED MUSHROOMBIRIYANI");
				System.out.println(" COST IS 260RS...");
				FoodDetails.display(260);
				break;

			}
			// Displays the message for wrong input
			default: {
				System.out.println("  *****YOU ARE ENTERED WRONG INPUT*****    ");
				FoodDetails.items();
			}

			}

			sc.close();
			// Raises the exception if input mismatches
		} catch (InputMismatchException e) {

			System.out.println(" PLEASE ENTERE INPUT AS NUMGERS   LIKE 1,2,3,....");
			Menu.itemsnames();
		}

	}

	// This method displays for customer choosing the item "Soup"
	public static void soup() throws Exception {
		try {
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			switch (s) {
			case 1: {
				System.out.println("YOU ARE ENTERED VEGSOUP");
				System.out.println(" COST IS 50RS...");
				FoodDetails.display(50);
				break;

			}
			case 2: {
				System.out.println("YOU ARE ENTERED CORNSOUP");
				System.out.println(" COST IS 30RS...");
				FoodDetails.display(30);
				break;

			}
			case 3: {
				System.out.println("YOU ARE ENTERED CHICKENSOUP");
				System.out.println(" COST IS 100RS...");
				FoodDetails.display(100);
				break;
			
			}
			// Displays the message for wrong input
			default: {
				System.out.println("  *****YOU ARE ENTERED WRONG INPUT*****    ");
				Menu.itemsnames();
			}

			}

			sc.close();
			// Raises the exception if input mismatches
		} catch (InputMismatchException e) {
			System.out.println("PLEASE ENTERE INPUT AS NUMGERS   LIKE 1,2,3,....");
			Menu.itemsnames();
		}

	}

	// This method displays for customer choosing the item "Drinks"
	public static void drinks() throws Exception {
		try {
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			switch (s) {
			case 1: {
				System.out.println("YOU ARE ENTERED THUMBSUP");
				System.out.println(" COST IS 50RS...");
				FoodDetails.display(50);
				break;

			}
			case 2: {
				System.out.println("YOU ARE ENTERED COCO COLA");
				System.out.println(" COST IS 30RS...");
				FoodDetails.display(30);
				break;

			}
			case 3: {
				System.out.println("YOU ARE ENTERED LIMCA ");
				System.out.println(" YOU ARE ENTERED CHICKENBIRIYANI");
				FoodDetails.display(100);
				break;

			}
			// Displays the message for wrong input
			default: {
				System.out.println("  *****YOU ARE ENTERED WRONG INPUT*****     ");
				FoodDetails.items();
			}

			}

			sc.close();
			// Raises the exception if input mismatches
		} catch (InputMismatchException e) {
			System.out.println(" PLEASE ENTERE INPUT AS NUMGERS   LIKE 1,2,3,....");
			Menu.itemsnames();
		}

	}
	// This method displays for customer choosing the item "Icecream"

	public static void icecream() throws Exception {
		try {
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			switch (s) {
			case 1: {
				System.out.println("YOU ARE ENTERED VANILLA");
				System.out.println(" COST IS 50RS....");
				FoodDetails.display(50);
				break;

			}
			case 2: {
				System.out.println("YOU ARE ENTERED CHOCOLATE ");
				System.out.println(" COST IS 130RS....");
				FoodDetails.display(130);
				break;

			}
			case 3: {
				System.out.println("YOU ARE ENTERED STRAWBERRY");
				System.out.println(" COST IS 100RS..");
				FoodDetails.display(100);
				break;

			}
			// Displays the message for wrong input
			default: {
				System.out.println("  *****YOU ARE ENTERED WRONG INPUT*****    ");
				FoodDetails.items();
			}

			}

			sc.close();
			// Raises the exception if input mismatches
		} catch (InputMismatchException e) {
			System.out.println(" PLEASE ENTERE INPUT AS NUMGERS   LIKE 1,2,3,....");
			Menu.itemsnames();
		}

	}

}
