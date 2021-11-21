package com.example.jpa.service;

import java.util.List;

import com.example.jpa.entity.AppJpaEntity;
import com.example.jpa.model.AppJpaRequest;

public interface AppJpaService {
	
	void addUser(AppJpaRequest appJpaRequest);
	
	List<AppJpaEntity> getUser(String day, String month, String year);

}
