package com.rupa.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	public static Connection connect() {
		Connection conn = null;

		try {
			//System.out.println(" loading the driver ");
			Class.forName("org.h2.Driver");
			//System.out.println(" creating a conection ");
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conn;
	}

}
