package com.spring.hibernate.SpringHibernateDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.SpringHibernateDemo.dao.EmployeesDAO;
import com.spring.hibernate.SpringHibernateDemo.service.EmployeesService;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	@Autowired
	 EmployeesDAO  employeesDao;

	public List<String> getDB() {

		List<String> tables=employeesDao.getDB();
		return tables;

	}

}
