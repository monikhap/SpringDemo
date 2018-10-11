package com.springhibernate.jpa.SpringHibernateDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springhibernate.jpa.SpringHibernateDemo.dao.EmployeesDAO;
import com.springhibernate.jpa.SpringHibernateDemo.dto.EmployeesDTO;
import com.springhibernate.jpa.SpringHibernateDemo.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	@Autowired
	 EmployeesDAO  employeesDao;

	public List<EmployeesDTO> getEmployees() {

		List<EmployeesDTO> tables=employeesDao.getEmployees();
		return tables;

	}

}
