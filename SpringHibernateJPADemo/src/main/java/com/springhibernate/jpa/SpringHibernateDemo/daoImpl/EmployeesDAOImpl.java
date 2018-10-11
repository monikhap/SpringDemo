package com.springhibernate.jpa.SpringHibernateDemo.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springhibernate.jpa.SpringHibernateDemo.dao.EmployeesDAO;
import com.springhibernate.jpa.SpringHibernateDemo.dto.EmployeesDTO;
import com.springhibernate.jpa.SpringHibernateDemo.utils.SpringHibernateUtil;

@Component
public class EmployeesDAOImpl implements EmployeesDAO {

	@Autowired
	SpringHibernateUtil util;

	public List<EmployeesDTO> getEmployees() {
		
		Session session=util.getSessionfactory().openSession();
		session.beginTransaction();
		List<EmployeesDTO> tables=session.createQuery("from EmployeesDTO").list();
		return tables;

	}

}
