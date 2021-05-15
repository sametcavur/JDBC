package DBHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBTable {
	
	
	public static void createPersonalTable() {
		DbHelper db = new DbHelper();
		Connection connection = db.openConnection();
		Logger logger = LogManager.getLogger();
		PreparedStatement statement = null;
		
		try {
			String sorgu = "CREATE TABLE personal(personalID INT PRIMARY KEY NOT NULL,adi VARCHAR(255),soyadi VARCHAR(255),dogumYili INT,personelNo VARCHAR(20))";
			statement = connection.prepareStatement(sorgu);
			statement.execute();
			logger.info("Tablo Baþarýyla Oluþturuldu");
		} catch (SQLException e) {
			logger.warn("Tablo Oluþturulamadý" + e);
		}
		finally {
			if(statement != null) {
				try {
					statement.close();
					logger.info("Statement Kapatýldý");
				} catch (SQLException e) {
					logger.warn("Statement Kapatýlamadý" + e);
				}
			}
			
			if(connection != null) {
				try {
					connection.close();
					logger.info("Baðlantý Kapatýldý");
				} catch (SQLException e) {
					logger.warn("Baðlantý Kapatýlamadý" + e);
				}
			}
		}
		
	}
}
