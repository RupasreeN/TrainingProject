package com.rupa.java.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class CreateConnection {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			System.out.println(" loading the driver   ");
			Class.forName("org.h2.Driver");
			System.out.println(" creating connection  ");
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			System.out.println("  creating statement");
			st = conn.createStatement();
		String sql =  "CREATE TABLE   LODINFORM" +"(id INTEGER not NULL, " + " first VARCHAR(255), " +  
	            " last VARCHAR(255), " +  
		            " age INTEGER, " +   " PRIMARY KEY ( id ))";  
			System.out.println(" executing the statement ");
			st.executeUpdate(sql);
			sql= "INSERT INTO LOGINFORM " + "VALUES (102, 'Zaid', 'Khan', 30)"; 
			st.executeUpdate(sql);

		} catch (ClassNotFoundException e) {
			System.out.println("class not found exception is found");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { 
				st.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
