package com.spring.hibernate.SpringHibernateDemo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.hibernate.SpringHibernateDemo.dto.EmployeesDTO;

@Component
public interface EmployeesDAO {
	
	public List<EmployeesDTO> getEmployees();

}
