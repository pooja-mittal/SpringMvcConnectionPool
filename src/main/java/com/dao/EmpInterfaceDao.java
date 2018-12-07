package com.dao;

import java.sql.SQLException;

import com.pojo.Employee;

public interface EmpInterfaceDao {
	
	public int createEmployee(Employee emp) throws SQLException;
	public boolean deleteEmployee(int empId);
	

}
