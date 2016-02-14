package util;

import java.sql.*;

public class DBHelper {

	private static String URL = "jdbc:mysql://127.0.0.1:3301/shopping";
	private static String USER = "root";
	private static String PASSWORD = "";
	private static Connection conn = null;

	static { // Static block for loading mysql driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Signle Instance for creating jdbc connection
	public static Connection getConnection() throws Exception {
		if (conn == null) {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			return conn;
		}
		return conn;
	}
//	
//	public static void main(String[] args)throws Exception {
//		//Test JDBC connection with shopping db
//		Connection conn = getConnection();
//		Statement stm= conn.createStatement();
//		String sql ="select * from items";
//		ResultSet rs=  stm.executeQuery(sql);
//		while (rs.next()) {
//			System.out.println(rs.getString("name"));
//		}
//	}
}
