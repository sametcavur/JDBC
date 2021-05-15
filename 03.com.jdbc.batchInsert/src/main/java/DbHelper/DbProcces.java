package DbHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Personal.Personal;

public class DbProcces {

	public Connection connection(List<Personal> personal) {
		Logger logger = LogManager.getLogger();
		PreparedStatement statement = null;
		DbConnec db = new DbConnec();
		Connection connection = db.openConnection();
		String sorgu = "INSERT INTO personal(personalID,adi,soyadi,dogumYili,personelNo) VALUES (?,?,?,?,?)";
		try {
			statement = connection.prepareStatement(sorgu);
			for (Personal personel : personal) {
				statement.setInt(1, personel.getPersonalID());
				statement.setString(2, personel.getAdi());
				statement.setString(3, personel.getSoyadi());
				statement.setInt(4, personel.getDogumYili());
				statement.setInt(5, personel.getPersonalNo());
				statement.addBatch();
			}
			statement.executeBatch();
			logger.info("Sorgu Çalýþtý");
			
		} catch (SQLException e) {
			logger.warn("Sorgu Çalýþmadý" + e);
		}
		return connection;
	}

}
