package com.mks.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

class Address
{
	private String city;
	private String state;
	private String country;
	
	public Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
class Employee1
{
	private int id;
	private String name;
	private Address address;
	
	
	public Employee1(int id,String name, Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void show1() {
	
		System.out.println(id+ " "+name);
		System.out.println(address);
	}
	
	
	
}


public class TestConstructorInjectionWithDO {
	
	
		public static void main(String[] args) {
			ApplicationContext context=new FileSystemXmlApplicationContext("/resource/applicationContext.xml");
			Employee1 emp1=(Employee1)context.getBean("emp1");
			emp1.show1();
}
}
