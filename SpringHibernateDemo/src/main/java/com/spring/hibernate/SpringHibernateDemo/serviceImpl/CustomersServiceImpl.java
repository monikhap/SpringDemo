package com.spring.hibernate.SpringHibernateDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.SpringHibernateDemo.dao.CustomersDAO;
import com.spring.hibernate.SpringHibernateDemo.dto.CustomersDTO;
import com.spring.hibernate.SpringHibernateDemo.service.CustomersService;

@Service
public class CustomersServiceImpl implements CustomersService {

	@Autowired
	CustomersDAO customersDao;

	public List<CustomersDTO> getCustomers() {

		List<CustomersDTO> tables=customersDao.getCustomers();
		return tables;

	}

	@Override
	public void insertCustomers(CustomersDTO customersDTO) {
		customersDao.insertCustomers(customersDTO);
		
	}

}
