package com.dp.main;

import com.dp.DBConn;

public class Main {

	public static void main(String[] args) {
		
		DBConn dbConn = DBConn.getInstance();
		
		DBConn dbConn1 = DBConn.getInstance();
		
		
		
		System.out.println(dbConn.hashCode());
		System.out.println(dbConn1.hashCode());
	}
}
