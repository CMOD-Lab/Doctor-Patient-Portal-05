package com.hms.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static Connection conn;
	
	public static Connection getConn() {
		
		try {
			
			// Java 21 / JDBC 4.0+: Driver auto-loading via ServiceLoader (SPI).
			// Class.forName("com.mysql.cj.jdbc.Driver") is no longer required.
			// The MySQL Connector/J driver registers itself automatically.
			
			//step: create a connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","wasim");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return conn;
	}
}
