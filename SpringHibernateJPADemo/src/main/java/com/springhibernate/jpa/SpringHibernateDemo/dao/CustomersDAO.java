package com.springhibernate.jpa.SpringHibernateDemo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springhibernate.jpa.SpringHibernateDemo.dto.CustomersDTO;

@Component
public interface CustomersDAO {
	
	public List<CustomersDTO> getCustomers();

}
