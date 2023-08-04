package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection connn = DB.getConnection();
		DB.closeConnection();
		
		
		
	}
}
