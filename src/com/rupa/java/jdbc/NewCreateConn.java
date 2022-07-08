package com.rupa.java.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class NewCreateConn {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			System.out.println(" loading the driver   ");
			Class.forName("org.h2.Driver");
			System.out.println(" creating connection  ");
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			System.out.println("  creating statement");

			// insertStudent( conn);
			deleteStudent(conn);
			// updateStudent(conn);
			retrivedataStudent(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("class not found exception is found");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@SuppressWarnings("unused")
	private static void insertStudent(Connection conn) {
		Statement st = null;
		try {
			String s[] = { "sai", "suraj", "arjun", "ajay" };
			int age = 25;

			System.out.println("insertion is done ");
			for (int i = 0; i <= 3; i++) {
				age = age + i;
				st = conn.createStatement();
				st.executeUpdate("INSERT INTO STUDENT VALUES (" + i + ", '" + s[i] + "'," + age + ")");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();

			} catch (SQLException e) {

				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("unused")
	private static void updateStudent(Connection conn) {
		Statement st = null;
		try {

			st = conn.createStatement();

			st.executeUpdate("update  STUDENT set id=3 where age=32 ");
			System.out.println("insertion is done ");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();

			} catch (SQLException e) {

				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void deleteStudent(Connection conn) {
		Statement st = null;
		try {

			st = conn.createStatement();

			st.executeUpdate("delete from student  where id =1");
			System.out.println("deletion is done ");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();

			} catch (SQLException e) {

				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void  retrivedataStudent(Connection conn) {
		Statement st = null;

		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			System.out.println( "ID   Name   Age");
			
			while (rs.next()) {
				
				int id = rs.getInt("id");
				 System.out.println(id);
					
				String name = rs.getString("name");
				System.out.println(name);
				int age = rs.getInt("age");
				System.out.println(age);

			
			}
			// rs.absolute(1);
			// System.out.println(rs.getInt(1));
			// System.out.println(rs.getString(2));
			// System.out.println(rs.getInt(3));

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();

			} catch (SQLException e) {

				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
