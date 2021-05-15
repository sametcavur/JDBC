package Main;

import java.util.ArrayList;
import java.util.List;

import DbHelper.DbProcces;
import Personal.Personal;

public class main {
	public static void main(String[] args) {
		DbProcces d = new DbProcces();
		Personal p1 = new Personal(1,"Mehmet", "Hakan", 1990, 132);
		Personal p2 = new Personal(2,"Murat", "Yýlmaz", 1985, 244);
		Personal p3 = new Personal(3,"Mert", "Arslan", 1976, 353);
		
		List Personal = new ArrayList();
		Personal.add(p1);
		Personal.add(p2);
		Personal.add(p3);
		
		d.connection(Personal);
	}

}
