package com.example.tescospringcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.model.Employee;
import com.service.EmployeeService;

@SpringBootApplication
public class TescoSpringCoreApplication {

	public static void main(String[] args) {
	//initiate container
		
		ApplicationContext ctx=SpringApplication.run(TescoSpringCoreApplication.class, args);
		EmployeeService service=(EmployeeService)ctx.getBean(EmployeeService.class);
	Employee emp=new Employee("admin","pune","IT");
		service.insertEmployee(emp);
		System.out.println("Data Added");
		
		((AbstractApplicationContext) ctx).close();
	}

}
