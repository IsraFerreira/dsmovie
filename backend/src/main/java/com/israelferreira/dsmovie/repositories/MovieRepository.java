package com.israelferreira.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.israelferreira.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	

}
