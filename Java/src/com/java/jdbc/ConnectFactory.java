package com.java.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.util.*;
public class ConnectFactory {
	
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	
	
	static{
		
		Properties prop = new Properties();
		try {
			InputStream in = ConnectionFactory.class.getClassLoader().getResourceAsStream("dbconfig.properties");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
