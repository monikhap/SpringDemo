package com.spring.hibernate.SpringHibernateDemo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class EmployeesDTO {
	
	@Id
	@Column(name="employeeNumber")
	public double employeeNumber;
	public String email;
	public String extension;
	public String firstName;
	public String jobTitle;
	public String lastName;	
	public String officeCode;
	public Double reportsTo	;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(double employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public Double getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(Double reportsTo) {
		this.reportsTo = reportsTo;
	}
	
}
