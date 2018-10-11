package com.springhibernate.jpa.SpringHibernateDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springhibernate.jpa.SpringHibernateDemo.dto.CustomersDTO;

@Service
public interface CustomersService {
	
	public List<CustomersDTO> getCustomers();

}
