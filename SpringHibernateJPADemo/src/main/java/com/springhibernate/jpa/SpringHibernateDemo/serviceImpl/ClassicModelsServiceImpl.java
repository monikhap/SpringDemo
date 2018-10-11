package com.springhibernate.jpa.SpringHibernateDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springhibernate.jpa.SpringHibernateDemo.dao.ClassicModelsDAO;
import com.springhibernate.jpa.SpringHibernateDemo.service.ClassicModelsService;

@Service
public class ClassicModelsServiceImpl implements ClassicModelsService {

	@Autowired
	ClassicModelsDAO modelDao;

	public List<String> getDB() {

		List<String> tables=modelDao.getDB();
		return tables;

	}

}
