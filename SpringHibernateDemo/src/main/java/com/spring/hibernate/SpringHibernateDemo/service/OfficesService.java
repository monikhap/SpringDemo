package com.spring.hibernate.SpringHibernateDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.hibernate.SpringHibernateDemo.dto.OfficesDTO;

@Service
public interface OfficesService {
	
	public List<OfficesDTO> getOffices();

}
