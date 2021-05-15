package com.project.DBConnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DbConnection {
	
	private static String url = null;
	private static String username = null;
	private static String password = null;
	static Logger logger = LogManager.getLogger();
	Connection connection= null;
	
	static {
	Properties pro = new Properties();
	
	try {
		InputStream inputStream = new FileInputStream("src/main/resources/database.properties");
		pro.load(inputStream);
		url = pro.getProperty("db_url");
		password = pro.getProperty("db_password");
		username = pro.getProperty("db_username");
	} catch (IOException e) {
		logger.warn("Input Stream �al��mad�" + e);	
	}
	
	}
	
	public Connection getConnection() {
		
		try {
		connection= DriverManager.getConnection(url, username, password);
		logger.info("Sql Ba�land�");
		} catch (SQLException e) {
		logger.warn("Sql Ba�lanamad�");
		}
		return connection;
	}
	public void closeConnection(Connection connection,PreparedStatement preparedStatement,ResultSet resultSet) {
		try {
			connection.close();
		} catch (SQLException e) {
			logger.warn("Connection Kapat�lamad�");
		}
		try {
			preparedStatement.close();
		} catch (SQLException e) {
			logger.warn("Prepared Statement Kapat�lamad�");
		}
		try {
			resultSet.close();
		} catch (SQLException e) {
			logger.warn("ResultSet Kapat�lamad�");
		}
	}
	
}
