package com.example.jpa.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.jpa.entity.AppJpaEntity;
import com.example.jpa.model.AppJpaRequest;
import com.example.jpa.repository.AppJpaRepository;

@Service
public class AppJpaServiceImpl implements AppJpaService {
	
	private final AppJpaRepository appJpaRepository;
	
	public AppJpaServiceImpl(AppJpaRepository appJpaRepository) {
		this.appJpaRepository = appJpaRepository;
	}

	@Override
	public void addUser(AppJpaRequest appJpaRequest) {
		AppJpaEntity appJpaEntity = new AppJpaEntity();
		appJpaEntity.setUserId(appJpaRequest.getUserId());
		appJpaEntity.setName(appJpaRequest.getName());
		appJpaEntity.setFirstName(appJpaRequest.getFirstName());
		appJpaEntity.setAge(appJpaRequest.getAge());
		
		Date hoy = new Date();
		appJpaEntity.setAdditionDate(hoy);
		appJpaRepository.save(appJpaEntity);
	}

	@Override
	public List<AppJpaEntity> getUser(String day, String month, String year) {
		
		Optional<List<AppJpaEntity>> appJpaEntity = appJpaRepository.getByYearAndMonthAndDay(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		
		if(appJpaEntity.isPresent()) {
			return appJpaEntity.get();
		}
		
		return null;
	}

}
