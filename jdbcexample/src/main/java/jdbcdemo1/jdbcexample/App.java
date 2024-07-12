package jdbcdemo1.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main( String[] args ){
    String url="jdbc:mysql://localhost:3306/gvaiet_db";
    String userName="root";
    String password="root";
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, userName, password);
			
			PreparedStatement statement = connection.prepareStatement
					("select * from demo where id=?");
			statement.setInt(1, 3);
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				System.out.println("Id:" + result.getInt(1));
				System.out.println("Name:" + result.getString(2));
				System.out.println("Age:" + result.getInt(3));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
