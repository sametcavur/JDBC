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
		logger.warn("Input Stream Çalýþmadý" + e);	
	}
	
	}
	
	public Connection getConnection() {
		
		try {
		connection= DriverManager.getConnection(url, username, password);
		logger.info("Sql Baðlandý");
		} catch (SQLException e) {
		logger.warn("Sql Baðlanamadý");
		}
		return connection;
	}
	public void closeConnection(Connection connection,PreparedStatement preparedStatement,ResultSet resultSet) {
		try {
			connection.close();
		} catch (SQLException e) {
			logger.warn("Connection Kapatýlamadý");
		}
		try {
			preparedStatement.close();
		} catch (SQLException e) {
			logger.warn("Prepared Statement Kapatýlamadý");
		}
		try {
			resultSet.close();
		} catch (SQLException e) {
			logger.warn("ResultSet Kapatýlamadý");
		}
	}
	
}
