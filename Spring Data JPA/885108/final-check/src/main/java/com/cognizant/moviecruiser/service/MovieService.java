package com.cognizant.moviecruiser.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	@Transactional
	public List<Movie> getAllMovie() {
		return movieRepository.findAll();
	}
	
	public List<Movie> getMovieByActiveTrue(){
		return movieRepository.findAllByActive();
	}
	
	@Transactional
	public Movie getMovie(long id) {
		return movieRepository.findById((int) id).get();
	}
	
	@Transactional
	public void modifyMovie(Movie movie) {
		Optional<Movie> result = movieRepository.findById((int)movie.getId());
		if(result.isPresent()) {
			Movie movie2 = result.get();
			movie2.setActive(movie.isActive());
			movie2.setTitle(movie.getTitle());
			movie2.setBoxOffice(movie.getBoxOffice());
			movie2.setHasTeaser((movie.isHasTeaser()));
			movie2.setGenre(movie.getGenre());
			movie2.setDateOfLaunch(movie.getDateOfLaunch());
			movieRepository.save(movie2);
		}
	}
}
