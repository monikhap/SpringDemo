package com.springhibernate.jpa.SpringHibernateDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springhibernate.jpa.SpringHibernateDemo.dto.EmployeesDTO;
import com.springhibernate.jpa.SpringHibernateDemo.service.EmployeesService;

@RestController
public class EmployeesController {
	@Autowired
	EmployeesService employeesService;

	@RequestMapping("/getEmployees")
	public ResponseEntity<List<EmployeesDTO>> getTables() {
		List<EmployeesDTO> tables=employeesService.getEmployees();
		return new ResponseEntity<List<EmployeesDTO>>(tables, HttpStatus.OK);
	}

}
