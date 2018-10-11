package com.spring.hibernate.SpringHibernateDemo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface ClassicModelsDAO {
	
	public List<String> getDB();

}
