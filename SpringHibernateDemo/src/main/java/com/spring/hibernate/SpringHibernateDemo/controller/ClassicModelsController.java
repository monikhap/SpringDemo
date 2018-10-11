package com.spring.hibernate.SpringHibernateDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hibernate.SpringHibernateDemo.service.ClassicModelsService;

@RestController
public class ClassicModelsController {

	@Autowired
	ClassicModelsService modelService;

	@RequestMapping("/getDB")
	public ResponseEntity<List<String>> getTables() {
		List<String> tables=modelService.getDB();
		return new ResponseEntity<List<String>>(tables, HttpStatus.OK);
	}

}
