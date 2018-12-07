package com.practice.business;

import java.sql.SQLException;

import com.pojo.Employee;

//business talks to database
public interface BusinessInterface {
	
	public int createEmployee(Employee emp) throws SQLException;

}
