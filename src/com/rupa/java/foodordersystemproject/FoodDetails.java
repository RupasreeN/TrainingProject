package com.rupa.java.foodordersystemproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.rupa.java.jdbc.TestConnection;

//Creating class for entering the food details
public class FoodDetails {
	public static int cost;
	public static int totalbill = 0;

	// Choosing the items of the menu
	public static void items() throws Exception {
		//try {
//			Scanner sc = new Scanner(System.in);
//			int n = sc.nextInt();
//
//			if (n != 6) {
//				switch (n) {
//				case 1: {
//					System.out.println(" YOU ARE ENTERED ITEM BIRIYANI ");
//					
//						System.out.println("   1:CHICKEN BIRIYANI    2:VEG BIRIYANI    3:FRAWN BIRIYANI");
//				
//						
//				
//					
//					ItemsList.biriyani();
//					break;
//
//				}
//				case 2: {
//					System.out.println(" YOU ARE ENTERED ITEM SOUPS");
//					System.out.println("   1:VEGSOUP     2: CORN SOUP   3:CHICKEN SOUP");
//					ItemsList.soup();
//					break;
//
//				}
//				case 3: {
//					System.out.println(" YOU ARE ENTERED ITEM DRINKS  ");
//					System.out.println("   1:THUMBSUP    2:COCACOLA    3:LIMCA");
//					ItemsList.drinks();
//					break;
//
//				}
//				case 4: {
//					System.out.println(" YOU ARE ENTERED ITEM ICECREAMS");
//					System.out.println("   1:VANILLA   2:CHOCOLATE    3:STRAWBERRY");
//					ItemsList.icecream();
//					break;
//
//				}
//				case 5: {
//					System.out.println(" ");
//					billDisplay();
//
//					break;
//
//				}
//				// If any wrong input is given
//				default: {
//					System.out.println("     *****YOU ARE ENTERED WRONG INPUT*****    ");
//					Menu.itemsnames();
//				}
//
//				}
//			}
//			sc.close();
//			// raises the exception if input mismatches
//		} catch (Exception e) {
//
		//	System.out.println(" PLEASE ENTERE INPUT AS NUMGERS   LIKE 1,2,3,....");
			Connection con = TestConnection.connect();

		PreparedStatement ps = con.prepareStatement("select * from itemdetails");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				System.out.println((rs.getInt("itemid") )+ "\t" + (rs.getString("itemtype"))+"\t" +(rs.getString("itemcost")));
			}


			//Menu.itemsnames();
		} 
//	}

	// Creating a method to enter the quantity
	public static void display(int i) throws Exception {
		System.out.println(" ENTER THE REQUIRED QUANTITY..");
		Scanner c;
		try {
			c = new Scanner(System.in);
			int number = c.nextInt();
			cost = number * i;
			System.out.println(" COST OF ITEM IS " + cost);
			totalbill(cost);
			Menu.itemsnames();
			c.close();
			// Raises the exception if input is not matched ..
		} catch (InputMismatchException e) {

			System.out.println("   PLEASE ENTER THE REQUIRED QUANTITY IN NUMBER");
			FoodDetails.display(i);
		}

	}
	// Total bill is calculated here

	private static void totalbill(int cost2) {
		totalbill = totalbill + cost;

	}

	// method is used to display the totalbill of customer
	private static void billDisplay() {
		System.out.println("      YOUR  TOTALBILL IS     " + totalbill);
		System.out.println("******THANKS FOR ORDERING ....... VISITAGAIN******");
	}
}
