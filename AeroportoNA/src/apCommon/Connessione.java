package apCommon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connessione {
	
	public static final String URL = "jdbc:postgresql://project:5432/project";
	public static final String USER = "postgres";
	public static final String PASSWORD = "Qweasd123123!!"; 

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			throw new RuntimeException("Error connecting to the database");
		}
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			}catch (SQLException e) {
				throw new RuntimeException("Error closing the database");
			}
		}
	}
	
	public static void closeStatement(Statement statement) {
		if (statement != null) {
			try {
				statement.close();
			}catch (SQLException e) {
				throw new RuntimeException("Error closing the statement");
			}
		}
	}
	
	public static void closeResultSet(ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			}catch (SQLException e) {
				throw new RuntimeException("Error closing the result set");
			}
		}
	}
}
