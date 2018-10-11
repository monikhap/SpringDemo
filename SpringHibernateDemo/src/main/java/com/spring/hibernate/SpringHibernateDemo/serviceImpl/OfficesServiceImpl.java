package com.spring.hibernate.SpringHibernateDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hibernate.SpringHibernateDemo.dao.OfficesDAO;
import com.spring.hibernate.SpringHibernateDemo.dto.OfficesDTO;
import com.spring.hibernate.SpringHibernateDemo.service.OfficesService;

@Service
public class OfficesServiceImpl implements OfficesService {

		@Autowired
		OfficesDAO officesDao;

		public List<OfficesDTO> getOffices() {

			List<OfficesDTO> tables=officesDao.getOffices();
			return tables;

		}
		
		@Override
		public void insertOffices(OfficesDTO officesDTO) {
			officesDao.insertOffices(officesDTO);
			
		}

}
