package com.rupa.java.jdbc;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 

public class PreparedStatementex {

	public static void main(String[] args) throws ClassNotFoundException {
	
	         String filePath = "/home/rupa/Downloads/image.jpg";
	  
	         try {
	        	 System.out.println(" loading the driver ");
	 			Class.forName("org.h2.Driver");
	             Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
	  
	             String sql = "INSERT INTO person  values (?, ?, ?)";
	             PreparedStatement statement = conn.prepareStatement(sql);
	             statement.setString(1, "Tom");
	             statement.setString(2, "Eagar");
	             InputStream inputStream = new FileInputStream(new File(filePath));
	  
	             statement.setBlob(3, inputStream);
	  
	             int row = statement.executeUpdate();
	             if (row > 0) {
	                 System.out.println("A contact was inserted with photo image.");
	             }
	             conn.close();
	         } catch (SQLException ex) {
	             ex.printStackTrace();
	         } catch (IOException ex) {
	             ex.printStackTrace();
	         }
	     }
	 }
