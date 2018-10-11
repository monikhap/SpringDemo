package com.spring.hibernate.SpringHibernateDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.SpringHibernateDemo.dao.ClassicModelsDAO;
import com.spring.hibernate.SpringHibernateDemo.service.ClassicModelsService;

@Service
public class ClassicModelsServiceImpl implements ClassicModelsService {

	@Autowired
	ClassicModelsDAO modelDao;

	public List<String> getDB() {

		List<String> tables=modelDao.getDB();
		return tables;

	}

}
