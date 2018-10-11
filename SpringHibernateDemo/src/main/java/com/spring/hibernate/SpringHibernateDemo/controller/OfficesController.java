package com.spring.hibernate.SpringHibernateDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hibernate.SpringHibernateDemo.dto.OfficesDTO;
import com.spring.hibernate.SpringHibernateDemo.service.OfficesService;

@RestController
public class OfficesController {
	@Autowired
	OfficesService officesService;

	@RequestMapping("/getOffices")
	public ResponseEntity<List<OfficesDTO>> getTables() {
		List<OfficesDTO> tables=officesService.getOffices();
		return new ResponseEntity<List<OfficesDTO>>(tables, HttpStatus.OK);
	}
	
	@RequestMapping("/insertOffices")
	public ResponseEntity<String> insertOffices(@RequestBody OfficesDTO officesDTO) {
		
		officesService.insertOffices(officesDTO);
		
		return new ResponseEntity<String>("Customer details saved", HttpStatus.OK);
	}

}
