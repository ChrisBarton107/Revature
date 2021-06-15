package com.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import com.mysql.jdbc.PreparedStatement;

public class Test {
	
	static DeptDAOImpl ddInterface = new DeptDAOImpl();

	
	public static void main(String[] args) {
		
		int choice = 0;
		
		do {
			ddInterface.Menu();
			Scanner sc=new Scanner(System.in);
			choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			ddInterface.listDept();
			break;
		
		case 2: 
			ddInterface.insertDept();
			break;
		
		case 3:
			ddInterface.modifyDept();
			break;
		
		case 4: 
			ddInterface.deleteDept();
			break;
		}
		
		}while(choice != 5);}
	

	
	


}


