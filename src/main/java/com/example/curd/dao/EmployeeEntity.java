package com.example.curd.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="EMPLOYEE_TBL")
public class EmployeeEntity {
	@Id
	@GeneratedValue
	private long id;
	
	private String firstname;
	
	private String lastname;
	
	private double salary;
	
	private String emailid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ ", emailid=" + emailid + "]";
	}
}
