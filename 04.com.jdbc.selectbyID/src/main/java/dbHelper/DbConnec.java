package dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.Logger;

public class DbConnec {
	private String url = "jdbc:mysql://localhost:3306/jdbc-egitim?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String password = "1234";
	private String user = "root";
	Logger logger = org.apache.logging.log4j.LogManager.getLogger();
	Connection connection;

	public Connection openConnection() {
		try {
			connection = DriverManager.getConnection(url, user, password);
			logger.info("Database Baðlanýldý");
		} catch (SQLException e) {
			logger.warn("Baðlantý Kurulamadý.!" + e);
		}
		return connection;
	}
	
	public void closeConnection() {
		if(connection != null) {
		try {
			connection.close();
			logger.info("Database kapatýldý");
		} catch (SQLException e) {
			logger.info("Database Kapatýldý");
		}
		}
	}
	

}
