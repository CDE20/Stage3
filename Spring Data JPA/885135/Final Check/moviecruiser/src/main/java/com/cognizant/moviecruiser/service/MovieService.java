package com.cognizant.moviecruiser.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;
	
	@Transactional
	public List<Movie> getMenuListAdmin()
	{
		return movieRepository.findAll();
	}
	
	@Transactional
	public Movie getMovie(long id)
	{
		return movieRepository.findById(id).get();
	}
	
	@Transactional
	public List<Movie> getMovieListCustomer()
	{
		return movieRepository.findByActiveTrue();
	}
	@Transactional
	public void modifyMovie(Movie movie)
	{
		Movie m = movieRepository.findById(movie.getId()).get();
		m.setTitle(movie.getTitle());
		m.setActive(movie.isActive());
		m.setBoxOffice(movie.getBoxOffice());
		m.setDateOfLaunch(movie.getDateOfLaunch());
		m.setGenre(movie.getGenre());
		m.setHasTeaser(movie.isHasTeaser());
		movieRepository.save(m);
	}
	

}
