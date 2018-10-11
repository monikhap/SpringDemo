package com.spring.hibernate.SpringHibernateDemo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.hibernate.SpringHibernateDemo.dto.OfficesDTO;

@Component
public interface OfficesDAO {
	
	public List<OfficesDTO> getOffices();

}
