package com.example.qualifier.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfiguration {
	
	@Bean
	@Qualifier("specialMovieFinder")
	public MovieFinder movieFinder() {
		return new MovieFinder();
	}
	
}
