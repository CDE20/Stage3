package com.cognizant.moviecruiser;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieService;
import com.cognizant.moviecruiser.util.DateUtil;

@SpringBootApplication
public class MovieCruiserApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserApplication.class);
	private static MovieService movieService;
	
	private static void testGetAllMovie() {
		LOGGER.info("start");
		List<Movie> list = movieService.getAllMovie();
		LOGGER.debug("Movie:{}",list);
		LOGGER.info("end");
	}
	
	private static void testGetMovieByActiveTrue() {
		LOGGER.info("start");
		List<Movie> list = movieService.getMovieByActiveTrue();
		LOGGER.debug("Movie:{}",list);
		LOGGER.info("end");
	}
	
	private static void testGetMovie() {
		LOGGER.info("start");
		Movie movie = movieService.getMovie(1);
		LOGGER.debug("Movie:{}",movie);
		LOGGER.info("end");
	}
	
	private static void testModifyMovie() {
		LOGGER.info("start");
		Movie movie = new Movie();
		movie.setActive(true);
		movie.setBoxOffice("$2,787,965,087");
		movie.setDateOfLaunch(DateUtil.convertToDate("15/03/2017"));
		movie.setGenre("Fiction");
		movie.setHasTeaser(true);
		movie.setTitle("Avatar");
		movieService.modifyMovie(movie);
		LOGGER.debug("Movie:{}",movie);
		LOGGER.info("end");
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MovieCruiserApplication.class, args);
		movieService = context.getBean(MovieService.class);
		//testGetAllMovie();
		//testGetMovieByActiveTrue();
		//testGetMovie();
		testModifyMovie();
	}
	

}
