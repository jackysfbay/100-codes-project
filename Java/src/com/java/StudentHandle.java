package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.mysql.jdbc.PreparedStatement;

public class StudentHandle {

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

	public static void insert(Student student) throws Exception {
		int i = 0;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into info (name, sex , age) values (?,?,?)";
		pstmt = (PreparedStatement) conn.prepareStatement(sql);

		pstmt.setString(1, student.getName());
		pstmt.setString(2, student.getSex());
		pstmt.setString(3, student.getAge());
		i = pstmt.executeUpdate();
		System.out.println("intsert: " + i);
		pstmt.close();
		conn.close();
	}

	public static void update(Student student) throws Exception {
		int i = 0;
		Connection conn = getConnection();
		String sql = "update info set age='" + student.getAge() + "'where name ='" + student.getName() + "'";
		PreparedStatement pstmt = null;
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		i = pstmt.executeUpdate();
		System.out.println("result " + i);
		pstmt.close();
		conn.close();
	}

	public static void select() throws Exception {
		Connection conn = getConnection();
		String sql = "select * from info";
		Statement stm = conn.createStatement();
		ResultSet resultSet = stm.executeQuery(sql);
		while (resultSet.next()) {
			System.out.println(
					resultSet.getString("name") + " " + resultSet.getString("age") + " " + resultSet.getString("sex"));
		}
		resultSet.close();
		conn.close();
	}
	
	public static void delete(String name) throws Exception {
		int i = 0;
		Connection conn = getConnection();
		String sql = "delete from info where name = '"+name+"'";
		PreparedStatement pstmt = null;
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		i = pstmt.executeUpdate();
		System.out.println("deleted " + i);
		pstmt.close();
		conn.close();
	}
	

	public static void main(String[] args) throws Exception {
//		insert(new Student("j", "m", "23"));
		
////		update(new Student("j", "m", "3333"));
//		
//		delete("j");
//		select();
	}
}
