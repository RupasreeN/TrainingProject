package com.rupa.java.jdbc;
import java.sql.*;  
public class ResultantMetaBaseEx {
	
	
	public static void main(String args[]){  
	try{ 
		Connection con = TestConnection.connect();
//	Class.forName("oracle.jdbc.driver.OracleDriver");  
//	Connection con=DriverManager.getConnection(  
//	"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
//	  
	PreparedStatement ps=con.prepareStatement("select * from form");  
	ResultSet rs=ps.executeQuery();  
	ResultSetMetaData rsmd=rs.getMetaData();  
	  
	System.out.println("Total columns: "+rsmd.getColumnCount());  
	System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
	System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
	System.out.println(" Column name of 2nd Column :"+ rsmd.getColumnName(2));
	  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	}  


