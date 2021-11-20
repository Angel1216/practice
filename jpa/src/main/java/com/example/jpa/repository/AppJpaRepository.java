package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.AppJpaEntity;

public interface AppJpaRepository extends JpaRepository<AppJpaEntity, Integer> {

}
