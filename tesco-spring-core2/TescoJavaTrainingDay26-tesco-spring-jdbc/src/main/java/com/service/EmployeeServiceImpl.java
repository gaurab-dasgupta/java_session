package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDAO;
import com.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public void insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		dao.insertEmployee(e);
		
	}

}
