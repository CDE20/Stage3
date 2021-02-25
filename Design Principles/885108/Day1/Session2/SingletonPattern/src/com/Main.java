package com;

public class Main {
	
	public static void main(String[] args) {
		DBConn db = DBConn.getInstance();
		
		if(db instanceof DBConn) {
			System.out.println("Singleton Pattern");
		}
	}

}
