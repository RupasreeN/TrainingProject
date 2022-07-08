package com.rupa.java.foodordersystemproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.rupa.java.jdbc.TestConnection;

public class Menu {

	public static void main(String[] args) throws Exception {
		System.out.println("  ~~~~~~~~~~~~~WELCOME TO THE FOOD ORDERING SYSTEM~~~~~~~~~~~~~       ");

		Menu.itemsnames();

	}

	// choosing the menu items
	public static void itemsnames() throws Exception {

		// System.out.println("\t PLEASE CHOOSE THE ORDER ");
		// System.out.println(" 1.BIRIYANI 2.SOUPS 3. DRINKS 4.ICECREAMS 5.Bill
		// ");
		// System.out.println("\t PLEASE ENTER THE INPUT AS NUMBERS LIKE
		// 1,2,3...... ");
		Connection con = TestConnection.connect();

		PreparedStatement ps = con.prepareStatement("select * from menu");
		ResultSet rs = ps.executeQuery();
		System.out.println("\t PLEASE CHOOSE THE ORDER ");
		System.out.println("\t PLEASE ENTER THE INPUT AS NUMBERS LIKE 1,2,3...... ");
		System.out.println("item number itemname");
		while (rs.next()) {
			
			System.out.println(rs.getInt("itemnumber") + "\t" + (rs.getString("itemname")));
		}

		FoodDetails.items();

	}
}