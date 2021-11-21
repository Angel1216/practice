package com.example.jpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jpa.entity.AppJpaEntity;

public interface AppJpaRepository extends JpaRepository<AppJpaEntity, Integer> {
	
	@Query("select e from AppJpaEntity e where year(e.additionDate) = ?1 and month(e.additionDate) = ?2 and day(e.additionDate) = ?3")
	Optional<List<AppJpaEntity>> getByYearAndMonthAndDay(int year, int month, int day);
	
}
