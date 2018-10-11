package com.spring.hibernate.SpringHibernateDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.hibernate.SpringHibernateDemo.dto.EmployeesDTO;

@Service
public interface EmployeesService {
	
	public List<EmployeesDTO> getEmployees();

}
