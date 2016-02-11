package com.java;

import java.sql.*;

public class GetDBConnection {

	private static Connection conn = null;

	static {
		try {
			String URL = "jdbc:mysql://127.0.0.1:3301/student";
			String USER = "root";
			String PASSWORD = "";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection conn() {
		return conn;
	}
}