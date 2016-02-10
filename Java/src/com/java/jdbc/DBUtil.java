package com.java.jdbc;

import java.sql.*;

public class DBUtil {
	private static final String URL="jdbc:mysql://127.0.0.1:3301/imooc";
	private static final String USER="root";
	private static final String PASSWORD="";

	public static void main(String[] args) throws Exception {
		
		// load JDBC driver
		
		Class.forName("com.mysql.jdbc.Driver");
		// Get DB connection
		Connection conn =  DriverManager.getConnection(URL, USER, PASSWORD);
		
		// 
		Statement stmt = conn.createStatement();
		
		ResultSet resultSet = stmt.executeQuery("select * from imooc_goddess");
		
		while (resultSet.next()) {
			System.err.println(resultSet.getString("user_name"));
			
		}
	}
}
