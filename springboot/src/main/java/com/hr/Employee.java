package com.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	String eName="Rahul";
	int age=34;
	
	private Department department;
	private Address address;
	private Salary salary;
	
	@Autowired
	public Employee(Department department, Address address, Salary salary) {
		super();
		this.department = department;
		this.address = address;
		this.salary = salary;
	}
	public void display() {
		System.out.println("******Employee Details******");
		System.out.println("Name:"+eName);
		System.out.println("Age:"+age);
		System.out.println("Department:"+department.getName());
		System.out.println("Home Number:"+address.getHomeNumber());
		System.out.println("Street:"+address.getStreet());
		System.out.println("City:"+address.getCity());
		System.out.println("Country:"+address.getCountry());
		double totalSalary=salary.getBasic()+salary.getDa()+salary.getHra()+salary.getSa();
		System.out.println("Salary:"+totalSalary);
		System.out.println("************END**************");
	}
}
