package com.spring.hibernate.SpringHibernateDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.SpringHibernateDemo.dao.OfficesDAO;
import com.spring.hibernate.SpringHibernateDemo.service.OfficesService;

@Service
public class OfficesServiceImpl implements OfficesService {

		@Autowired
		OfficesDAO officesDao;

		public List<String> getDB() {

			List<String> tables=officesDao.getDB();
			return tables;

		}

}
