package com.myorganisation.iocproject;

import com.myorganisation.iocproject.model.Address;
import com.myorganisation.iocproject.model.Department;
import com.myorganisation.iocproject.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocprojectApplication.class, args);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("App.xml");
		Address address = (Address) applicationContext.getBean("address");
		Department department = (Department) applicationContext.getBean("department");
		Employee employee = (Employee) applicationContext.getBean("employee");

		System.out.println(employee.toString());
	}

}
