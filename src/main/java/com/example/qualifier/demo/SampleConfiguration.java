package com.example.qualifier.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Named;

@Configuration
public class SampleConfiguration {
	
	@Bean
	@Qualifier("specialMovieFinder") // <- working
//	@Named("specialMovieFinder") // <- NOT WORKING
	public MovieFinder movieFinder() {
		return new MovieFinder();
	}
	
}
