package com.springhibernate.jpa.SpringHibernateDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springhibernate.jpa.SpringHibernateDemo.dto.OfficesDTO;
import com.springhibernate.jpa.SpringHibernateDemo.service.OfficesService;

@RestController
public class OfficesController {
	@Autowired
	OfficesService officesService;

	@RequestMapping("/getOffices")
	public ResponseEntity<List<OfficesDTO>> getTables() {
		List<OfficesDTO> tables=officesService.getOffices();
		return new ResponseEntity<List<OfficesDTO>>(tables, HttpStatus.OK);
	}

}
