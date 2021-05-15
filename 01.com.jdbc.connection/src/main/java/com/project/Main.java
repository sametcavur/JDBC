package com.project;

import java.sql.SQLException;

import com.project.dbHelper.DbHelper;

public class Main {
	public static void main(String[] args) throws SQLException {
	
	DbHelper dbHelper = new DbHelper();
	dbHelper.openConnection();
	dbHelper.closeConnection();
	}
	}
	
