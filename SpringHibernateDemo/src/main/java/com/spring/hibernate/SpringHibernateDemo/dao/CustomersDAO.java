package com.spring.hibernate.SpringHibernateDemo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.hibernate.SpringHibernateDemo.dto.CustomersDTO;

@Component
public interface CustomersDAO {
	
	public List<CustomersDTO> getCustomers();
	public void insertCustomers(CustomersDTO customersDTO);

}
