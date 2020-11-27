package mecanica.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDAO {
	
	private static final String USER = "postgres";
	private static final String PASSWORD = "abc123";
	
	public static Connection getConnection() throws SQLException {
		//PORTA LINUX 5433
		String url = "jdbc:postgresql://127.0.0.1:5432/Mecanica";
		
		Properties properties = new Properties();
		properties.setProperty("user", USER);
		properties.setProperty("password", PASSWORD);
		
		return DriverManager.getConnection(url, properties);
	}

}
