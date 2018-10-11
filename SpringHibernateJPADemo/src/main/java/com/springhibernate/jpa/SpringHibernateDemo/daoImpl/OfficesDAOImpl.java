package com.springhibernate.jpa.SpringHibernateDemo.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springhibernate.jpa.SpringHibernateDemo.dao.OfficesDAO;
import com.springhibernate.jpa.SpringHibernateDemo.dto.OfficesDTO;
import com.springhibernate.jpa.SpringHibernateDemo.utils.SpringHibernateUtil;

@Component
public class OfficesDAOImpl implements OfficesDAO {

	@Autowired
	SpringHibernateUtil util;

	public List<OfficesDTO> getOffices() {
		
		Session session=util.getSessionfactory().openSession();
		session.beginTransaction();
		List<OfficesDTO> tables=session.createQuery("from OfficesDTO").list();
		return tables;

	}

}
