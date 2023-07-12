package com.example.tescospringcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.BusinessAccount;
import coms.service.BankingService;

//@SpringBootApplication
public class TescoSpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TescoSpringCoreApplication.class, args);
		
		//initiate a container and also
		// construct the objs
		// spring follows eager loading for all the beans
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// by default it is creating and calling the constructors configured in beans
		//using the object
		BankingService bs=(BankingService)ctx.getBean("service");
		System.out.println(bs.calculate(4389));
		System.out.println(bs.hashCode());
		
		BankingService bs2=(BankingService)ctx.getBean("service");
		System.out.println(bs2.hashCode());
		
//		BusinessAccount ba=(BusinessAccount)ctx.getBean("bsa");
//		System.out.println(ba.calculate(1000));
		
		//removes from the context NOT FROM HEAP
		ctx.close();
		
	}

}
