package com.cognizant.moviecruiser.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.dao.MovieDao;
import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.repository.MovieRepository;

@Service
public class MovieDaoService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	
	
	public List<Movie> getMovieListAdmin(){
		return movieRepository.findAll();
	}
	
	public List<Movie> getMovieListCustomer(){
		return movieRepository.findByActiveNotAndDateOfLaunchBefore(false, new Date());
	}
	
	public void modifyMovie(Movie movie) {
		Movie temp = movieRepository.getOne(movie.getId());
		temp=movie;
		movieRepository.save(temp);
	}
	
	
	public Movie getMovie(int movieId) {
		return movieRepository.getOne(movieId);
	}
}
