package com.java.jdbc1;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

import org.junit.Test;

public class GeneralJDBCConnection {

	public  Connection getConnection() throws Exception {
		String driverClass = null;
		String jdbcURL = null;
		String user = null;
		String password = null;
		
		// get jdbc info from properties -> example mysql
		InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		Properties properties = new Properties();
		properties.load(in);
		driverClass = properties.getProperty("driver");
		jdbcURL = properties.getProperty("jdbcURL");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
		
		// get jdbc driver
		Driver driver = (Driver) Class.forName(driverClass).newInstance();

		//set jdbc's username, pass
		Properties info = new Properties();
		info.put("user", user);
		info.put("password", password);
		
		//get Connection
		Connection conn = driver.connect(jdbcURL, info);

		return conn;
	}
	
	@Test
	public void getConnFromDriveManager() throws Exception
	{
		String driverClass = null;
		String jdbcURL = null;
		String user = null;
		String password = null;
		
		// get jdbc info from properties -> example mysql
		InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		Properties properties = new Properties();
		properties.load(in);
		driverClass = properties.getProperty("driver");
		jdbcURL = properties.getProperty("jdbcURL");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
		
		//register a jdbc Driver
		//DriverManager.registerDriver((Driver)Class.forName(driverClass).newInstance());
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(jdbcURL, properties);
		DatabaseMetaData data = connection.getMetaData();
		data.getDatabaseMajorVersion();
		
		System.out.println(connection);
		
	}
	@Test
	public void testConn() throws Exception {
		Connection connection = getConnection();
		

	}
}
