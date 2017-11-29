package org.ju.cse.gobinda.h2_db;

public class Main {

	public static void main(String[] args) {

		// creating the database file in c/user/<user name> folder
		DbGetConnection.getDatabaseConnection1();
		// creating database file in current folder
		DbGetConnection.getDatabaseConnection2();

		// creating table if table if not exist
		DbCreateTable.createTable1();
		// creating table without checking the table already exist or not
		DbCreateTable.createTable2();

		// inserting data using statement object
		DbInsert.insertDataWithStatement();
		// inserting data using prepared statement object
		DbInsert.insertWithPreparedStatement();

		// updating data using statement object
		DbUpdate.updateTableData1();
		// updating data using prepared statement object
		DbUpdate.updateTableData2();

		// deleting data using statement object
		DbDelete.deleteDataUsingStatement();
		// deleting data using prepared statement object
		DbDelete.deleteDataUsingPreparedStatement();

		// selecting all the data
		DbSelect.selectAllData();
		// selecting specific data
		DbSelect.selectSpecificData();

		// deleting the database file from c/user/<user name> folder
		DbDeleteDbFile.deleteDatabase1();
		// deleting the database file from current folder
		DbDeleteDbFile.deleteDatabase2();

	}

}
