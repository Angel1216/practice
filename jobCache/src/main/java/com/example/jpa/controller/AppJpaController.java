package com.example.jpa.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.model.RandomNumberResponse;
import com.example.jpa.service.AppJpaService;

@RestController
public class AppJpaController {
	
	private final AppJpaService appJpaService;
	
	@Autowired
	public AppJpaController(AppJpaService appJpaService) {
		this.appJpaService = appJpaService;
	}
	
	@GetMapping(path = "/random-number")
	public ResponseEntity<RandomNumberResponse> addUser() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("--------- Controller random-number... [" + localDateTime + "]");
		return new ResponseEntity<>(appJpaService.randomNumber(), HttpStatus.OK);
	}
	
}
