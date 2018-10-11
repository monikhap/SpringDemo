package com.springhibernate.jpa.SpringHibernateDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springhibernate.jpa.SpringHibernateDemo.dto.EmployeesDTO;

@Service
public interface EmployeesService {
	
	public List<EmployeesDTO> getEmployees();

}
