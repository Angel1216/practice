package com.example.jpa.service;

import org.springframework.stereotype.Service;

import com.example.jpa.entity.AppJpaEntity;
import com.example.jpa.repository.AppJpaRepository;

@Service
public class AppJpaServiceImpl implements AppJpaService {
	
	private final AppJpaRepository appJpaRepository;
	
	public AppJpaServiceImpl(AppJpaRepository appJpaRepository) {
		this.appJpaRepository = appJpaRepository;
	}

	@Override
	public void addUser(AppJpaEntity appJpaEntity) {
		System.out.println("Hola Mundo!!");
//		AppJpaEntity appJpaEntity = new AppJpaEntity();
//		appJpaEntity.setUserId(1);
//		appJpaEntity.setName("Angel");
//		appJpaEntity.setFirstName("Martinez");
//		appJpaEntity.setAge(35);
		appJpaRepository.save(appJpaEntity);
		System.out.println("Adios Mundo!!");
	}

}
