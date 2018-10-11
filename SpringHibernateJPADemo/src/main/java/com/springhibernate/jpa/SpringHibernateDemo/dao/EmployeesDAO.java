package com.springhibernate.jpa.SpringHibernateDemo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springhibernate.jpa.SpringHibernateDemo.dto.EmployeesDTO;

@Component
public interface EmployeesDAO {
	
	public List<EmployeesDTO> getEmployees();

}
