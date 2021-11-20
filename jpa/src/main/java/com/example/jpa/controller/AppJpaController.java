package com.example.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.AppJpaEntity;
import com.example.jpa.service.AppJpaService;

@RestController
public class AppJpaController {
	
	private final AppJpaService appJpaService;
	
	@Autowired
	public AppJpaController(AppJpaService appJpaService) {
		this.appJpaService = appJpaService;
	}
	
	@PostMapping(path = "/user")
	public ResponseEntity<Void> addUser(@RequestBody AppJpaEntity appJpaEntity) {
		appJpaService.addUser(appJpaEntity);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
