package com.rupa.java.jdbc;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrivedataFromDatabase {

	public static void main(String[] args) {
		try {

			Connection conn = null;
			conn = TestConnection.connect();
			File file = new File("/home/rupa/Downloads/image1.jpg");
			FileOutputStream fos = new FileOutputStream(file);
			byte b[];
			Blob blob;

			PreparedStatement ps = conn.prepareStatement("select * from person where picture is not null");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				blob = rs.getBlob("picture");
				b = blob.getBytes(1, (int) blob.length());
				fos.write(b);
				System.out.println(blob);
			}

			ps.close();
			fos.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
