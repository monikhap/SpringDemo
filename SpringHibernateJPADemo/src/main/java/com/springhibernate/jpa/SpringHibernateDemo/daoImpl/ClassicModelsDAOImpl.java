package com.springhibernate.jpa.SpringHibernateDemo.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springhibernate.jpa.SpringHibernateDemo.dao.ClassicModelsDAO;
import com.springhibernate.jpa.SpringHibernateDemo.utils.SpringHibernateUtil;

@Component
public class ClassicModelsDAOImpl implements ClassicModelsDAO {

	@Autowired
	SpringHibernateUtil util;

	public List<String> getDB() {
		
		Session session=util.getSessionfactory().openSession();
		session.beginTransaction();
		List<String> tables=session.createSQLQuery("show tables").list();
		return tables;

	}

}
