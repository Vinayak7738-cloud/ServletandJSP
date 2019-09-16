
package com.bv.conncetion;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnect {

	public static Connection getConnection() {
		Connection connection = null;
		// step -1. Create Properties class Object
		try {
			FileInputStream fis = new FileInputStream("C:\\Vinayak\\Connection.properties");
			Properties properties = new Properties();

			// step-2. load the properties file
			properties.load(fis);

			// get the data from properties file using key
			String driverClass = (String) properties.get("driverclass");
			String url = (String) properties.get("url");
			String username = (String) properties.get("username");
			String password = (String) properties.get("password");

			// Loading Driver Class
			Class.forName(driverClass);
			System.out.println("Driver Found");

			// Establishing new Connection
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established");
		} catch (IOException | SQLException | ClassNotFoundException e) {

			System.out.println(e);
		}
		return connection;
	}
	
}
