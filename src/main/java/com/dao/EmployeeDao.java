package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.pojo.Employee;

public class EmployeeDao implements EmpInterfaceDao {
	
	DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int createEmployee(Employee emp) throws SQLException {
		Connection conn=ds.getConnection();
		PreparedStatement statement=conn.prepareStatement("insert into employee values(?,?,?,?)");
		statement.setInt(1, emp.getId());
		statement.setString(2, emp.getName());
		statement.setString(3, emp.getEmail());
		statement.setString(4, emp.getAddress());
		int roeEffetced=statement.executeUpdate();
		conn.close();
		return roeEffetced;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
