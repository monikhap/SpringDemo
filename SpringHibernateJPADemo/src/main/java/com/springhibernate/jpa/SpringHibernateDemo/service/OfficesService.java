package com.springhibernate.jpa.SpringHibernateDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springhibernate.jpa.SpringHibernateDemo.dto.OfficesDTO;

@Service
public interface OfficesService {
	
	public List<OfficesDTO> getOffices();

}
