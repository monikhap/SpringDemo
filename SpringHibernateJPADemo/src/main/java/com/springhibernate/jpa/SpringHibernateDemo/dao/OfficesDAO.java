package com.springhibernate.jpa.SpringHibernateDemo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springhibernate.jpa.SpringHibernateDemo.dto.OfficesDTO;

@Component
public interface OfficesDAO {
	
	public List<OfficesDTO> getOffices();

}
