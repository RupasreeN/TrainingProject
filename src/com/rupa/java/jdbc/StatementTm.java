package com.rupa.java.jdbc;

import java.sql.*;

public class StatementTm {

	public static void main(String[] args) {
		try {
			Statement st = null;
			Connection con = null;
			con = TestConnection.connect();

			con.setAutoCommit(false);

			st = con.createStatement();
			st.executeUpdate("insert into form values(1,'abhi','ece')");
			st.executeUpdate("insert into form values(2,'umesh','cse')");
			st.executeUpdate(" delete from form where id =2");
			st.executeUpdate("insert into form values(3,'uma','mech')");
			// st.executeUpdate(" update form set name='rupa' where id =2 " );

			st.close();
			con.rollback();
			con.close();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}
}
