package com.spring.hibernate.SpringHibernateDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hibernate.SpringHibernateDemo.dto.EmployeesDTO;
import com.spring.hibernate.SpringHibernateDemo.service.EmployeesService;

@RestController
public class EmployeesController {
	@Autowired
	EmployeesService employeesService;

	@RequestMapping("/getEmployees")
	public ResponseEntity<List<EmployeesDTO>> getTables() {
		List<EmployeesDTO> tables=employeesService.getEmployees();
		return new ResponseEntity<List<EmployeesDTO>>(tables, HttpStatus.OK);
	}
	
	@PostMapping("/insertEmployees")
	public ResponseEntity<String> insertEmployees(@RequestBody EmployeesDTO employeesDTO) {
		
		employeesService.insertEmployees(employeesDTO);
		
		return new ResponseEntity<String>("Employee details saved", HttpStatus.OK);
	}

}
