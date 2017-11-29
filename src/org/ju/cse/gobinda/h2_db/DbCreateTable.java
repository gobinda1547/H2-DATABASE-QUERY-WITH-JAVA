package org.ju.cse.gobinda.h2_db;

import java.sql.Connection;
import java.sql.Statement;

public class DbCreateTable {

	/***********************************************************************
	 * this method will create the table (named Person) normally. If there is
	 * already a table with that name, then it will give you an exception,
	 * otherwise it will do it's job successfully. so make sure that you doesn't
	 * call the same method more than one time.
	 ***********************************************************************/
	public static void createTable1() {

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("CREATE TABLE Person(");
			sql.append("id INTEGER not NULL, ");
			sql.append("first VARCHAR(255), ");
			sql.append("last VARCHAR(255), ");
			sql.append("age INTEGER, ");
			sql.append("PRIMARY KEY(id))");

			Connection conn = DbGetConnection.getDatabaseConnection2();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql.toString());
			System.out.println("Created table in given database...");

			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***********************************************************************
	 * this method will create the table (named Person) if and only if there is
	 * no table already with that name. because you can see, in the first line
	 * we checked it, that whether there is a table already or not.
	 ***********************************************************************/
	public static void createTable2() {

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("CREATE TABLE IF NOT EXISTS Person(");
			sql.append("id INTEGER not NULL, ");
			sql.append("first VARCHAR(255), ");
			sql.append("last VARCHAR(255), ");
			sql.append("age INTEGER, ");
			sql.append("PRIMARY KEY(id))");

			Connection conn = DbGetConnection.getDatabaseConnection2();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql.toString());
			System.out.println("Created table in given database...");

			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
