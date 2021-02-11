package com.cognizant.moviecruiser;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieDaoService;

public class App 
{
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	private static MovieDaoService movieDaoService;
    public static void main( String[] args )
    {
    	ApplicationContext appctx = new ClassPathXmlApplicationContext("spring-config.xml");
		List<Movie> movieList= (List<Movie>) appctx.getBean("movieItems");
    	System.out.println(movieList);
    }
    
    
    private static void getMovieList() {
    	LOGGER.info("Start Test");
    	List<Movie> movieListAdmin = movieDaoService.getMovieListAdmin();
    	LOGGER.debug("MOvies={}",movieListAdmin);
    	LOGGER.info("Stop test");
    }
}
