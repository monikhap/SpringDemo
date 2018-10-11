package com.springhibernate.jpa.SpringHibernateDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springhibernate.jpa.SpringHibernateDemo.dto.CustomersDTO;
import com.springhibernate.jpa.SpringHibernateDemo.service.CustomersService;

@RestController
public class CustomersController {
	
	@Autowired
	CustomersService customersService;

	@RequestMapping("/getCustomers")
	public ResponseEntity<List<CustomersDTO>> getCustomers() {
		List<CustomersDTO> tables=customersService.getCustomers();
		return new ResponseEntity<List<CustomersDTO>>(tables, HttpStatus.OK);
	}

}
