package com.cognizant.moviecruiser.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.moviecruiser.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

	@Query("select m from Movie m where m.active = 1")
	List<Movie> findAllByActive();
}
