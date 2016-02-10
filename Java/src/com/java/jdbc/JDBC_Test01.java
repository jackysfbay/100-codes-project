package com.java.jdbc;

import java.sql.*;

public class JDBC_Test01 {

	public static Connection getConnection() {

		String URL = "jdbc:mysql://127.0.0.1:3301/student";
		String USER = "root";
		String PASSWORD = "";
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void insert() throws Exception {
		Connection conn = getConnection();
		String sqlStatment = "INSERT INTO info (id, name, sex)" + "VALUES('6', 'Tom1', 'M')";
		Statement stm = conn.createStatement();
		int count = stm.executeUpdate(sqlStatment);// executeUpdate() -> DML
													// (insert, update ,delete)
		System.out.println("Inserted " + count + " row");
		conn.close();
	}

	public static void update() throws Exception {
		Connection conn = getConnection();
		String sqlStatment = "UPDATE info SET name = 'Jon22222' WHERE id = 1";
		Statement stm = conn.createStatement();
		int count = stm.executeUpdate(sqlStatment);// executeUpdate() -> DML
													// (insert, update ,delete)
		System.out.println("Updated " + count + " row");
		conn.close();
	}

	public static void delete() throws Exception {
		Connection conn = getConnection();
		String sqlStatment = "DELETE from info where id = 2";
		Statement stm = conn.createStatement();
		int count = stm.executeUpdate(sqlStatment);// executeUpdate() -> DML
													// (insert, update ,delete)
		System.out.println("Deleted " + count + " row");
		conn.close();
	}

	public static void query(String sqlStatment) throws Exception {
		Connection conn = getConnection();
		Statement stm = conn.createStatement();
		ResultSet resultSet = stm.executeQuery(sqlStatment);
		while (resultSet.next()) {
			System.out.println(resultSet.getString("name"));
		}
		conn.close();
	}

	public static void main(String[] args) throws Exception {
		 query("select * from info");
		// insert();
		// update();
//		delete();
	}
}
