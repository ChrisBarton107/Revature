package com.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptDAOImpl implements DeptDAO {

	@Override
	public void Menu() {
		System.out.println("SELECT AN OPTION\n"
				+ "1. Display Department\n"
				+ "2. Insert Department\n"
				+ "3. Modify Department\n"
				+ "4. Delete Department\n");
	}

	
	
	
	
	@Override
	public void listDept() {
		String QUERY = "select deptno,dname,loc from dept";
			try(Connection con = ConnectionUtil.getConnection();
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(QUERY))
			    {	
					while(rs.next()){
					int no = rs.getInt("deptno");
					String name = rs.getString("dname");
					String location = rs.getString("loc");
					System.out.println("Connection");
					System.out.println(no + "," +name+ "," +location );
				}//try
			} catch (SQLException e) {e.printStackTrace(); }
	}

	
	
	
	
	@Override
	public void insertDept() {
		String QUERY = "insert into dept values(80, 'Marketing', 'Reston')";
		try(Connection con = ConnectionUtil.getConnection();
				Statement stmt = con.createStatement())
			{ int result = stmt.executeUpdate(QUERY);
			System.out.println(" Result is :"+result);
		     if (result==1) 
		    	System.out.println(" Data Inserted");
		     else
		    	 System.out.println(" Issue in data insertion ");
		    } catch (SQLException e) {e.printStackTrace(); }
		
	}

	
	
	
	
	@Override
	public int deleteDept() {
		int row=0;
		String QUERY = "Delete from dept where deptno = ?";
	     try (Connection conn = ConnectionUtil.getConnection();
	             java.sql.PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) 
	     {		
	    	 preparedStatement.setInt(1, 80);
	        row = preparedStatement.executeUpdate();
	         // rows affected
	         System.out.println(row);
	    	 
	     }catch( SQLException e)
	     {
	    	 System.out.println(" Row cannot be deleted");
	     }
		   return row; 
	}

	
	
	
	
	@Override
	public int modifyDept() {
		int row=0;
		String QUERY = "UPDATE dept SET dname='IT80' WHERE deptno=?";
		 try (Connection conn = ConnectionUtil.getConnection();
	             java.sql.PreparedStatement preparedStatement = conn.prepareStatement(QUERY)) 
	     {	preparedStatement.setInt(1, 80);
	        row = preparedStatement.executeUpdate();
	         // rows affected
	         System.out.println(row);
	    	 
	     }catch( SQLException e)
	     {
	    	 System.out.println(" Row cannot be updated");
	     }
		   return row;
	}

	
	
	
	
}
