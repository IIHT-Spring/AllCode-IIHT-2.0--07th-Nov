package com.start.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	static Connection con;

	public static Connection createC() {
		try {
			// to load the drivers
			Class.forName("com.mysql.jdbc.driver");

			// create the connection
			String user = "root";
			String password = "root";

			String url = "jdbc:mysql://localhost:3306/studentmanagement";

			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
