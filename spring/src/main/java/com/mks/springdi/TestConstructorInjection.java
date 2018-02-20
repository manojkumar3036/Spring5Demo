package com.mks.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/*
 * 
 * Constructor Dependency Injection
 *
 */

class Employee {
	// declaring the instance
	private String name;
	private int id;

	// invoking constructors

	public Employee() {
		System.out.println("non parameterized constructor");
	}

	public Employee(int id) {
		this.id = id;

	}

	public Employee(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println(id + " " + name);
	}
}

public class TestConstructorInjection {
	public static void main(String[] args) {

		// Resource r=new ClassPathResource("resource/applicationContext.xml");
		// BeanFactory factory=new XmlBeanFactory(r);

		ApplicationContext context = new FileSystemXmlApplicationContext("/resource/applicationContext.xml");
		Employee emp = (Employee) context.getBean("emp");
		emp.show();

	}
}
