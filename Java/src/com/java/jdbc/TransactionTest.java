package com.java.jdbc;

import java.sql.*;

public class TransactionTest {

	public static Connection getConnection() throws Exception {
		String URL = "jdbc:mysql://127.0.0.1:3301/student";
		String USER = "root";
		String PASSWORD = "";
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		return conn;
	}

	public static void insertUserData(Connection conn) throws Exception {
		// Connection conn = getConnection();
		String sql = "INSERT INTO info (id, name)" + "VALUES('10', 'Jason')";
		Statement stm = conn.createStatement();
		int count = stm.executeUpdate(sql);
		System.out.println("Update " + count + " row");
//		conn.close();
	}

	public static void insertUserData2(Connection conn) throws Exception {
		// Connection conn = getConnection();
		String sql = "INSERT INTO info (id, name, sex)" + "VALUES('10', 'Jason','M')";
		Statement stm = conn.createStatement();
		int count = stm.executeUpdate(sql);
		System.out.println("Update " + count + " row");
//		conn.close();
	}

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn=getConnection();
			conn.setAutoCommit(false);
			
			insertUserData(conn);
			insertUserData2(conn);
			conn.commit();
		} catch (Exception e) {
			System.out.println("+++++++SQL Exception +++++++++++");
			e.printStackTrace();

			try {
				conn.rollback();
				System.out.println("============rollback done=========");

			} catch (Exception e2) {
				e.printStackTrace();
			}
		}finally {
			try {
				if(conn !=null){
					conn.close();
				}
			} catch (SQLException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
		}
	}
}
