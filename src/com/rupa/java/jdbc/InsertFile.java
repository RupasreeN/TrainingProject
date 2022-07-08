package com.rupa.java.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertFile {
	public static void main(String[] a) {
		Connection conn = null;
		String filePath1 = "/home/rupa/Documents/insertdocument";
		String filePath = "/home/rupa/Downloads/image.jpg";

		try {
			conn = TestConnection.connect();

			String sql = "INSERT INTO person  values (?,?,?,?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "Tom");
			statement.setString(2, "Eagar");
			InputStream inputStream = new FileInputStream(new File(filePath));

			statement.setBlob(3, inputStream);
		
			InputStream input = new FileInputStream(new File(filePath1));

			
			statement.setBlob(4, input);
			int row1 = statement.executeUpdate();
			if (row1 > 0) {
				System.out.println("A contact was inserted with document.");
			}

			
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
