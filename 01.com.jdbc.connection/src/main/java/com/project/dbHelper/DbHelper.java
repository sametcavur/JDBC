package com.project.dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DbHelper {
	private String url = "jdbc:mysql://localhost/jdbc-egitim?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String password = "1234";
	private String user = "root";
	
	
	Connection connection = null;
	Logger log = LogManager.getLogger();
	public Connection openConnection() {
		try {
			connection = DriverManager.getConnection(url, user, password);
			log.info("Sql Baþarýyla Açýldý.");
		} catch (SQLException e) {
			log.warn("Sql Baðlantý Oluþmadý" + e);
		}
		return connection;
	}
	
	public void closeConnection() {
		if(connection != null) {
		try {
			connection.close();
			log.info("Sql Baþarýyla Kapatýldý.");
		} catch (SQLException e) {
			log.warn("Sql Kapatýlamadý.");
		}
		}
	}

}
