package com.spring.hibernate.SpringHibernateDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hibernate.SpringHibernateDemo.dto.CustomersDTO;
import com.spring.hibernate.SpringHibernateDemo.service.CustomersService;
import com.spring.hibernate.SpringHibernateDemo.utils.SpringHibernateUtil;

@RestController
public class CustomersController {
	
	@Autowired
	SpringHibernateUtil util;
	
	@Autowired
	CustomersService customersService;

	@RequestMapping("/getCustomers")
	public ResponseEntity<List<CustomersDTO>> getCustomers() {
		
		List<CustomersDTO> tables=customersService.getCustomers();
		
		return new ResponseEntity<List<CustomersDTO>>(tables, HttpStatus.OK);
	}
	
	@RequestMapping("/insertCustomers")
	public ResponseEntity<String> insertCustomers(@RequestBody CustomersDTO customersDTO) {
		
		customersService.insertCustomers(customersDTO);
		
		return new ResponseEntity<String>("Customer details saved", HttpStatus.OK);
	}

}
