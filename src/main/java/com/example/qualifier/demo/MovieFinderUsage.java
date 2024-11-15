package com.example.qualifier.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MovieFinderUsage {
	
	private MovieFinder movieFinder;
	private MovieService movieService;
	
	@Autowired
	public void setMovieFinder(@Qualifier("specialMovieFinder") MovieFinder movieFinder,
			@Qualifier("specialMovieService") MovieService movieService) {
		System.out.println("named movie finder injected");
		this.movieFinder = movieFinder;
		this.movieService = movieService;
	}

}
