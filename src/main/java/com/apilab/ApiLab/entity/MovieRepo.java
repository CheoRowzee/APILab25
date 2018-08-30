package com.apilab.ApiLab.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepo extends JpaRepository<Movie, Long> {
	
	List<Movie> findByCategory(String category);
	
	@Query(value="SELECT * FROM Movie Order by RAND() LIMIT 1", nativeQuery = true)
	Movie randomMovie(); 
	
	@Query(value= "Select * FROM Movie Order by RAND() LIMIT 1 Order by category", nativeQuery = true)
	Movie randCategory();
	
	@Query(value= "Select * FROM Movie Order by RAND() LIMIT 1", nativeQuery = true)
	List<Movie> movieRandom(String movie);
	
	
	List<Movie> findByTitle(String movie);
	
	
	
	
	

}
