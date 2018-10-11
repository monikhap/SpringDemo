package com.springhibernate.jpa.SpringHibernateDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springhibernate.jpa.SpringHibernateDemo.dao.OfficesDAO;
import com.springhibernate.jpa.SpringHibernateDemo.dto.OfficesDTO;
import com.springhibernate.jpa.SpringHibernateDemo.service.OfficesService;

@Service
public class OfficesServiceImpl implements OfficesService {

		@Autowired
		OfficesDAO officesDao;

		public List<OfficesDTO> getOffices() {

			List<OfficesDTO> tables=officesDao.getOffices();
			return tables;

		}

}
