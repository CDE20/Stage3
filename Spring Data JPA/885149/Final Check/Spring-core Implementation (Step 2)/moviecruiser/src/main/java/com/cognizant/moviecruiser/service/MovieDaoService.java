package com.cognizant.moviecruiser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.dao.MovieDao;
import com.cognizant.moviecruiser.model.Movie;

@Service
public class MovieDaoService {
	
	@Autowired
	private MovieDao movieDao;
	
	
	
	public List<Movie> getMovieListAdmin(){
		ApplicationContext appctx = new ClassPathXmlApplicationContext("spring-config.xml");
		List<Movie> movieList= (List<Movie>) appctx.getBean("movieItems");
		return movieList;
	}

}
