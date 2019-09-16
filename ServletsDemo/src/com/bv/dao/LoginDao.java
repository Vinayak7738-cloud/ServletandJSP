package com.bv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.http.HttpServlet;

import com.bv.conncetion.DBConnect;
import com.sun.org.apache.xerces.internal.util.Status;

public class LoginDao {
	
	/*public static boolean validUser(String username, String password)
	{
		if(username.equals("admin") && password.equals("pass"))
		return true;
		return false;
	}*/
	public static boolean validUser(String username, String password)
	{
		String sql = "select username,password from logindetails "+"where username = ? and password =?";
		boolean status = false;
		Connection con = DBConnect.getConnection();
		try {
			PreparedStatement psmt = con.prepareStatement(sql);
			
			psmt.setString(1, username);
			psmt.setString(2, password);
			
			ResultSet rs = psmt.executeQuery();
			status = rs.next();
			if(status)
			{
				return status;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	

}
