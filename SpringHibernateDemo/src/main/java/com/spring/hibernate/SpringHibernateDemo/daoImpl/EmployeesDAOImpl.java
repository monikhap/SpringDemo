package com.spring.hibernate.SpringHibernateDemo.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.hibernate.SpringHibernateDemo.dao.EmployeesDAO;
import com.spring.hibernate.SpringHibernateDemo.dto.CustomersDTO;
import com.spring.hibernate.SpringHibernateDemo.dto.EmployeesDTO;
import com.spring.hibernate.SpringHibernateDemo.utils.SpringHibernateUtil;

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
	
	@Override
	public void insertEmployees(EmployeesDTO employeesDTO) {
		
		Session session=util.getSessionfactory().openSession();
		session.beginTransaction();
		session.save(employeesDTO);
		session.getTransaction().commit();
		session.close();
		
	}

}
