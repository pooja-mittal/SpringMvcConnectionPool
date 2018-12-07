package com.practice.business;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Employee;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		
		ConfigurableApplicationContext ac=new ClassPathXmlApplicationContext("com\\resource\\spring.xml");
		BusinessInterface emp=(BusinessInterface) ac.getBean("bs");
		int i=emp.createEmployee(new Employee(1,"abc", "abc@gmail.com", "bangalore"));
		System.out.println(i);
		ac.close();
		
	}

}
