package com.spring.hibernate.SpringHibernateDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.hibernate.SpringHibernateDemo.dto.CustomersDTO;

@Service
public interface CustomersService {
	
	public List<CustomersDTO> getCustomers();
	
	public void insertCustomers(CustomersDTO customersDTO);

}
