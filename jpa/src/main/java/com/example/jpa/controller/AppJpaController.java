package com.example.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.AppJpaEntity;
import com.example.jpa.model.AppJpaRequest;
import com.example.jpa.service.AppJpaService;

@RestController
public class AppJpaController {
	
	private final AppJpaService appJpaService;
	
	@Autowired
	public AppJpaController(AppJpaService appJpaService) {
		this.appJpaService = appJpaService;
	}
	
	@PostMapping(path = "/save-user")
	public ResponseEntity<Void> addUser(@RequestBody AppJpaRequest appJpaRequest) {
		appJpaService.addUser(appJpaRequest);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(path = "/get-user/{day}/{month}/{year}")
	public ResponseEntity<List<AppJpaEntity>> getUser(@PathVariable("day") String day, @PathVariable("month") String month, @PathVariable("year") String year) {
		return new ResponseEntity<>(appJpaService.getUser(day, month, year), HttpStatus.OK);
	}
	
}
