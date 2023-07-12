package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Employee;
@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDAO {

	@Autowired
	private DataSource dataSource;
	
	@PostConstruct
	public void init()
	{
		setDataSource(dataSource);
	}
	@Override
	public void insertEmployee(Employee e) {
		String sql="insert into employee values (?,?,?)";
		getJdbcTemplate().update(sql,new Object[] {e.getEmpName(),e.getEmpCity(),e.getEmpProject()});
		
	}

}
