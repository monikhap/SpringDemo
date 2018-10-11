package com.spring.hibernate.SpringHibernateDemo.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.hibernate.SpringHibernateDemo.dao.CustomersDAO;
import com.spring.hibernate.SpringHibernateDemo.dto.CustomersDTO;
import com.spring.hibernate.SpringHibernateDemo.utils.SpringHibernateUtil;

@Component
@Transactional
public class CustomersDAOImpl implements CustomersDAO {

	@Autowired
	SpringHibernateUtil util;
	
	public List<CustomersDTO> getCustomers() {
		
		Session session=util.getSessionfactory().openSession();
		session.beginTransaction();
		List<CustomersDTO> tables=session.createQuery("from CustomersDTO").list();
		return tables;

	}

}
