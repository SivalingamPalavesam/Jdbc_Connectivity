package com.jdbcprogram;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcConnection {

	public static void main(String[] args) {
		try {
		Connection obj = DriverManager.getConnection("jdbc:mysql://localhost:3306//JDBC","root","root");
		
		Statement obj1 =  obj.createStatement();
		
		ResultSet obj2 = obj1.executeQuery("select * from data");
		
		while(obj2.next())
		{
			System.out.println(obj2);
		}
		}
		catch(Exception e)
		{
			System.out.println("");
		}
	}

}
