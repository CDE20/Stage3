package com.cognizant.moviecruiser;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieDaoService;
import com.cognizant.moviecruiser.util.DateUtil;
@SpringBootApplication
public class App 
{
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	private static MovieDaoService movieDaoService;
    public static void main( String[] args )
    {
    	ApplicationContext context = SpringApplication.run(App.class, args);
    	movieDaoService = context.getBean(MovieDaoService.class);
    	
    	testGetMovieListAdmin();
    	
    	testGetMovieListCustomer();
    	
    	testModifyMovie();
    	
    	
    	
    }
    
    
    private static void testGetMovieListAdmin() {
    	LOGGER.info("Start Test");
    	List<Movie> movieListAdmin = movieDaoService.getMovieListAdmin();
    	LOGGER.debug("MOvies={}",movieListAdmin);
    	LOGGER.info("Stop test");
    }
    

    private static void testGetMovieListCustomer() {
    	LOGGER.info("Start Test");
    	List<Movie> movieListAdmin = movieDaoService.getMovieListCustomer();
    	LOGGER.debug("MOvies={}",movieListAdmin);
    	LOGGER.info("Stop test");
    }
    
    private static void testModifyMovie() {
    	LOGGER.info("Start Test");
    	Movie movieitem =new Movie(2,"The Avengers Endgame","$1,518,812,988",true,DateUtil.convertToDate("2020-12-23"),"Fictional",true);
    	movieDaoService.modifyMovie(movieitem);
    	LOGGER.debug("Modified Movies={}",movieitem);
    	LOGGER.info("Stop test");
    }
    
}
