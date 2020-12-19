package demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * I've created a utility class that contains static members.
 * 
 * This way the connection create is contained within a single entity.
 * And you can pass it your connections to close the connections; this will
 * assist with allowing us to only have a SINGLE connection for the whole httpRequest.
 */
public class MyConnectionFactory {
	
	//IF YOU WANT TO USE JDBC WITH A WAR PROJECT YOU NEED TO DO THE FOLLOWING:
		static { //(this would normally go into your dao layer)
	        try {
	            Class.forName("org.postgresql.Driver");
	        }catch(ClassNotFoundException e) {
	            e.printStackTrace();
	            System.out.println("Static block has failed me");
	        }
	    }

	public static String url = "jdbc:postgresql://"
			+System.getenv("TRAINING_DB_URL")+"/"+System.getenv("TRAINING_DB_DATABASENAME");
	public static String username= System.getenv("TRAINING_DB_USERNAME");
	public static String password=System.getenv("TRAINING_DB_PASSWORD");
	
//	public static Connection getConnection() {
//		try {
//			return DriverManager.getConnection(url, username, password);
//		} catch (SQLException e) {
//			System.out.println("There has been a failure to create a connection to: "+
//					url);
//			e.printStackTrace();
//		}
//		
//		return null;
//	}
//	
//	public static boolean closeMyConnection(Connection myConnection) {
//		try {
//			myConnection.close();
//			return true;
//		} catch (SQLException e) {
//			System.out.println("Your connection failed to close");
//			e.printStackTrace();
//		}
//		return false;
//	}
}
