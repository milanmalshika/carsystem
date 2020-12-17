package com.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<User> validate(String username, String password) {
		
		ArrayList<User> user = new ArrayList<>();
		
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();	
			String sql = "SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userU = rs.getString(5);
				String passU = rs.getString(6);
				
				User u = new User(id, name, email, phone, userU, passU);
				
				user.add(u);
			} 
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return user;
		
	}
	
	public static boolean insertuser(String name, String email, String phone, String username, String password) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "INSERT INTO user VALUES(0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	public static boolean insertcar(String type, String model, String year, String priceperday) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "INSERT INTO car VALUES(0,'"+type+"','"+model+"','"+year+"','"+priceperday+"', null)";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}

	public static List<Car> view() {
		
		ArrayList<Car> car = new ArrayList<>();
		
		//validate
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();	
			String sql = "SELECT * FROM car WHERE isdeleted IS NULL ORDER BY id";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String type = rs.getString(2);
				String model = rs.getString(3);
				String productionyear = rs.getString(4);
				String rentingpriceperday = rs.getString(5);
				
				Car c = new Car(id, type, model, productionyear, rentingpriceperday);
				
				car.add(c);
			} 
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return car;
		
	}
	
	public static boolean updatecar(String id, String type, String model, String productionyear, String rentingPriceperday) {
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "UPDATE car SET type='"+type+"', model='"+model+"', productionyear='"+productionyear+"', rentingpriceperday='"+rentingPriceperday+"' WHERE id='"+id+"' LIMIT 1";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean deletecar(String id) {
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "UPDATE car SET isdeleted=1 WHERE id='"+id+"' LIMIT 1";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
}
