package com.apilab.ApiLab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apilab.ApiLab.entity.Movie;
import com.apilab.ApiLab.entity.MovieRepo;

@RestController
public class MovieController {
	
	@Autowired
	MovieRepo repo;
	
	@GetMapping("/")
	public List<Movie> listAll()  {
	List<Movie> movieList = new ArrayList<>();
	movieList = repo.findAll();
	return movieList;	
	}
	
	@GetMapping("/category")
	public List<Movie> findByCategory(@RequestParam("category") String category)  {
	List<Movie> movieList = new ArrayList<>();	
	movieList = repo.findByCategory(category);
	return movieList;
	}
	
	@GetMapping("/random")
	public Movie randomMovie()  {
	return repo.randomMovie();
	}
	
	@GetMapping("/randcat")
	public Movie randomCategory()  {
	return repo.randCategory();	
	}
	
	
	
	@GetMapping("/movierand")
	public List<Movie> movieRand(@RequestParam("movie") String movie)  {
	List<Movie> movieList = new ArrayList<>();
	movieList = repo.movieRandom(movie);
	return repo.movieRandom(movie);
	}
	
	@GetMapping("/moviepage")
	public List<Movie> findByTitle(@RequestParam("moviepage") String movie) {
	return repo.findByTitle(movie);
	}
	
	
	
	
	
	
	
	
	

}
