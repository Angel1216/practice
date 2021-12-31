package com.example.jpa.config;

import java.time.LocalDateTime;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableCaching
@EnableScheduling
public class ApplicationConfig {
	
	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager("randomNumberCache");
	}
	
	@CacheEvict(allEntries = true, value = "randomNumberCache")
	@Scheduled(cron = "0 */1 * * * *", zone = "America/Mexico_City")
	public void evictAllCacheValues() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Limpiando Cache randomNumberCache... [" + localDateTime + "]");
	}
	
}
