package com.cognizant.moviecruiser.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieService;

@Service
public class MovieDaoSqlImpl implements MovieDao {

	@Autowired
	private MovieService movieService;
	
	@Override
	public List<Movie> getMovieListAdmin() {
		return movieService.getMovieListAdmin();
	}

	@Override
	public List<Movie> getMovieListCustomer() {
		return movieService.getMovieListCustomer();
	}

	@Override
	public void modifyMovie(Movie movie) {
		movieService.modifyMovie(movie);
	}

	@Override
	public Movie getMovie(long movieId) {
		return movieService.getMovie(movieId);
	}

	@Override
	public void save(List<Movie> movies) {
		movieService.save(movies);
	}

}