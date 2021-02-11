package com.cognizant.moviecruiser.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public List<Movie> getMovieListAdmin() {
		return movieRepository.findAll();
	}

	public List<Movie> getMovieListCustomer() {
		return movieRepository.findByActiveTrueAndDateOfLaunchBefore(new Date());
	}

	public void modifyMovie(Movie movie) {
		movieRepository.save(movie);
	}

	public Movie getMovie(long Id) {
		return movieRepository.findById(Id).get();
	}

	public void save(List<Movie> moviesList) {
		movieRepository.saveAll(moviesList);
	}

}