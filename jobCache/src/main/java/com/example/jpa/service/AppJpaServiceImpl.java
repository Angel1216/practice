package com.example.jpa.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.jpa.model.RandomNumberResponse;


@Service
public class AppJpaServiceImpl implements AppJpaService {
	
	@Override
	@Cacheable(cacheNames = "randomNumberCache")
	public RandomNumberResponse randomNumber() {
		RandomNumberResponse response = new RandomNumberResponse();
		response.setNumber(getNumber());
		return response;
	}
	
	private Double getNumber() {
		Double number_a = Math.random()*10;
		Double number_b = Math.random()*10;
		System.out.println("Calculando numero aleatroio...");
		return number_a + number_b;
	}
	
}
