package com.springhibernate.jpa.SpringHibernateDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springhibernate.jpa.SpringHibernateDemo.dao.CustomersDAO;
import com.springhibernate.jpa.SpringHibernateDemo.dto.CustomersDTO;
import com.springhibernate.jpa.SpringHibernateDemo.service.CustomersService;

@Service
public class CustomersServiceImpl implements CustomersService {

	@Autowired
	CustomersDAO customersDao;

	public List<CustomersDTO> getCustomers() {

		List<CustomersDTO> tables=customersDao.getCustomers();
		return tables;

	}

}
