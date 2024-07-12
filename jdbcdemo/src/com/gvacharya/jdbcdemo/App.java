package com.gvacharya.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class App {
	public static void main(String[] args) throws Exception {
		
//		int id=3;
//		String name="CBC";
//		int age=28;
//		// loading Drivers
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Driver Loaded Successfully..");
//		
//		
//		// Forming Connection
//		Connection connection=
//				DriverManager
//					.getConnection("jdbc:mysql://localhost:3306/gvaiet_db", "root", "root");
//		System.out.println("Database Connected Successfully..");
//		
//		PreparedStatement statement
//				= connection
//					.prepareStatement
////					("Insert into demo values("+id+",'"+name+"',"+age+")");
//					("Insert into demo values(?,?,?)");
//		statement.setInt(1, id);
//		statement.setString(2, name);
//		statement.setInt(3, age);
//		
//		statement.execute();
		
		//Load drivers 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Connection Form
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gvaiet_db", "root", "root");
		
		PreparedStatement statement = con.prepareStatement("select * from demo");
		
		ResultSet result = statement.executeQuery();
		while(result.next()) {
			System.out.println("-------------------------------------------------");
			System.out.println("Id:" + result.getInt(1));
			System.out.println("Name:" + result.getString(2));
			System.out.println("Age:" + result.getInt(3));
//			System.out.println("-------------------------------------------------");
		}
	}

}
