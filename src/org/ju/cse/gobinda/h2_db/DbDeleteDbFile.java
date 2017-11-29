package org.ju.cse.gobinda.h2_db;

import java.sql.SQLException;

import org.h2.tools.DeleteDbFiles;

public class DbDeleteDbFile {

	/***********************************************************************
	 * this method will delete the database file that is location into your
	 * C:\Users\<userName> folder
	 ***********************************************************************/
	public static void deleteDatabase1() {
		try {
			DeleteDbFiles.execute("~", "test", true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/***********************************************************************
	 * this method will delete the database file that is location into your
	 * Current folder
	 ***********************************************************************/
	public static void deleteDatabase2() {
		try {
			DeleteDbFiles.execute(".", "test", true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
