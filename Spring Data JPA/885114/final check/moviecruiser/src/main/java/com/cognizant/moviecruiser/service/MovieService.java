package com.cognizant.moviecruiser.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.repository.MovieRepository;

@Service
public class MovieService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieService.class);

	@Autowired
	private MovieRepository movieRepository;

	public List<Movie> getMovieListAdmin() {
		LOGGER.info("Start");
		List<Movie> list = movieRepository.findAll();
		LOGGER.info("End");

		return list;
	}

	public List<Movie> getMovieListCustomer() {
		LOGGER.info("Start");
		List<Movie> list = movieRepository.findByActiveTrueAndDateOfLaunchBefore(new Date());
		LOGGER.info("End");
		LOGGER.info("End");
		return list;
	}

	public void modifyMovie(Movie movie) {
		LOGGER.info("Start");
		movieRepository.save(movie);
		LOGGER.info("End");
	}

	public Movie getMovie(long movieId) {
		LOGGER.info("Start");
		Movie movie = movieRepository.findById(movieId).get();
		LOGGER.info("End");
		return movie;
	}

	public void save(List<Movie> movies) {
		LOGGER.info("Start");
		movieRepository.saveAll(movies);
		LOGGER.info("End");
	}

}
