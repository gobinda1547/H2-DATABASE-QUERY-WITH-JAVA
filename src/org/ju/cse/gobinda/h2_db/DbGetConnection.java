package org.ju.cse.gobinda.h2_db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbGetConnection {

	/***********************************************************************
	 * this method will searching for the database files into your C:\Users\
	 * <userName> folder if the database files aren't there then it will create
	 * the database files (basically it happens for the first time, when you are
	 * trying to make a connection with the db) but if the database files are
	 * there, then it will simply give a connection back with that db.
	 ***********************************************************************/
	public static Connection getDatabaseConnection1() {

		try {
			String dbUrl = "jdbc:h2:~/test";
			String dbUserName = "";
			String dbPassword = "";
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/***********************************************************************
	 * this method will searching for the database files into your current
	 * folder. If the database files aren't there then it will create the
	 * database files (basically it happens for the first time, when you are
	 * trying to make a connection with the db) but if the database files are
	 * there, then it will simply give a connection back with that db.
	 ***********************************************************************/
	public static Connection getDatabaseConnection2() {

		try {
			String dbUrl = "jdbc:h2:./test";
			String dbUserName = "";
			String dbPassword = "";
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
