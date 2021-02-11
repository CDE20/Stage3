package com.cognizant.moviecruiser.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieService;

@Controller
public class MovieController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);
	@Autowired
	private MovieService movieService;

	@GetMapping("/show-movie-list-admin")
	public String showMovieListAdmin(ModelMap model) throws Exception {
		LOGGER.info("Start");
		List<Movie> movieList = movieService.getMovieListAdmin();
		LOGGER.debug("Admin Movie List: {}", movieList);
		model.put("movieList", movieList);
		LOGGER.info("End");
		return "movie-list-admin";
	}

	@GetMapping("/show-movie-list-customer")
	public String showMovieCustomer(ModelMap model) throws Exception {
		LOGGER.info("Start");
		List<Movie> movieList = movieService.getMovieListCustomer();
		model.put("movieList", movieList);
		LOGGER.debug("Customer Movie List: {}", movieList);
		LOGGER.info("End");
		return "movie-list-customer";
	}

	@GetMapping("/edit-movie")
	public String showEditMovie(ModelMap model, @RequestParam("movieId") int id) throws ClassNotFoundException {
		LOGGER.info("Start");
		Movie movie = movieService.getMovie(id);
		model.put("movie", movie);
		LOGGER.debug("Movie:{}", movie);
		LOGGER.info("End");
		return "edit-movie";
	}

	@PostMapping("/edit-movie")
	public String editMovie(@ModelAttribute Movie movie, BindingResult bindingResult) {
		LOGGER.info("Start");
		if (bindingResult.hasErrors()) {
			LOGGER.debug("{}", bindingResult.getFieldErrors());
		}
		if(movie.getHasTeaser()==null)
				movie.setHasTeaser("No");
		movieService.editMovie(movie);
		LOGGER.info("End");
		return "edit-movie-status";
	}
}