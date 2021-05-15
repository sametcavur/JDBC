package dbHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class islem {
	
	public void islem(int id) {
	DbConnec db = new DbConnec();
	Connection connection = db.openConnection();
	Logger log = LogManager.getLogger();
	
	PreparedStatement preparedStatement = null;
	ResultSet resultSet;
	try {
		String sorgu = "SELECT * FROM personal WHERE personalID= ?";
		preparedStatement = connection.prepareStatement(sorgu);
		preparedStatement.setInt(1,id);
		resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			int personalID = resultSet.getInt(1);
			String adi = resultSet.getString(2);
			String soyisim = resultSet.getString(3);
			int dogumYili = resultSet.getInt(4);
			String personelNo = resultSet.getString(5);
			System.out.print(personalID);
			System.out.print("-"+adi);
			System.out.print("-"+soyisim);
			System.out.print("-"+dogumYili);
			System.out.print("-"+personelNo);
			System.out.println(" ");
			
		}
		
		log.info("çalýþtý");
	} catch (SQLException e) {
		log.warn("Çalýþmadý");
	}
	finally {
		db.closeConnection();
	}
	}
}
