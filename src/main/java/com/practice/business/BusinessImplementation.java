package com.practice.business;

import java.sql.SQLException;

import com.dao.EmpInterfaceDao;
import com.pojo.Employee;

public class BusinessImplementation implements BusinessInterface {
	
	EmpInterfaceDao dao;
	
	public void setDao(EmpInterfaceDao dao) {
		this.dao = dao;
	}

	public int createEmployee(Employee emp) throws SQLException {
		return dao.createEmployee(emp);
	}

}
