package com.springhibernate.jpa.SpringHibernateDemo.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SpringHibernateUtil {
	
	public SessionFactory getSessionfactory() {
	
	Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=configuration.buildSessionFactory();
	
	return factory;
	
	}
	
}
