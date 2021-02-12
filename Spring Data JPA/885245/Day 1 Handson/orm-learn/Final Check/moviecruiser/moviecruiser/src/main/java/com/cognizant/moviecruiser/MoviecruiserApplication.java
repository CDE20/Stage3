package com.cognizant.moviecruiser;

import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieService;
import com.cognizant.moviecruiser.util.DateUtil;



@SpringBootApplication
public class MoviecruiserApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(MoviecruiserApplication.class);
	private static MovieService movieService;

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(MoviecruiserApplication.class, args);
		movieService=context.getBean(MovieService.class);
		LOGGER.info("Inside main");
		Scanner sc = new Scanner(System.in);
		String choice;

		do {
			System.err.println("Menu");
			System.err.println("****************************************");
			System.err.println("1. Admin");
			System.err.println("2. Customer");
			System.err.println("3. Exit");
			System.err.println("****************************************");

			choice = sc.nextLine();
			System.err.println("****************************************");

			switch (choice) {
			case "1": {
				String adminChoice;
				do {
					System.err.println("Admin Menu");
					System.err.println("****************************************");
					System.err.println("1. Get Movie List");
					System.err.println("2. Modify Movie");
					System.err.println("3. Get Movie");
					System.err.println("4. Main Menu");
					System.err.println("****************************************");

					adminChoice = sc.nextLine();
					System.err.println("****************************************");

					switch (adminChoice) {
					case "1": {
						System.err.println("Admin Movie List");
						System.err.println("****************************************");
						testGetMovieListAdmin();
						System.err.println("****************************************");
						break;
					}
					case "2": {
						testModifyMovie();
						System.err.println("Movie 1 is modified !! Enter 3 to display the changes.");
						System.err.println("****************************************");
						break;
					}
					case "3": {
						System.err.println("Movie 1 is displayed !!");
						System.err.println("****************************************");
						testGetMovie(1);  // Since movie 1 is modified details of movie id->1 is retrieving
						System.err.println("****************************************");
						break;
					}
					case "4": {
						break;
					}
					default: {
						System.err.println("Enter valid choice");
						System.err.println("****************************************");
					}
					}
				} while (!adminChoice.equals("4"));
				System.err.println("****Thank YOU****");
				break;
			}
			case "2": {
				System.err.println("Customer Movie List");
				System.err.println("****************************************");
				testGetMovieListCustomer();
				System.err.println("****************************************");
				break;
			}
			case "3": {
				break;
			}
			default: {
				System.err.println("Enter valid choice");
				System.err.println("****************************************");
			}
			}
		} while (!choice.equals("3"));
		System.err.println("****Thank YOU****");
		sc.close();		
	
	}
	
	private static void testGetMovieListAdmin()
	{
		LOGGER.info("Start");
		List<Movie> list=movieService.getMenuListAdmin();
		System.err.println(String.format("%-3s %-20s %-15s %-8s %-30s %-18s " + "%-15s", "Id", "Title",
				"Bos Office", "Active", "Date of Launch", "Genre", "Has Teaser"));
		System.err.println("____________________________________________________________________________________________________________________");
		list.forEach(e->System.err.println(e));
		LOGGER.info("End");
	}
	private static void testGetMovieListCustomer()
	{   
		LOGGER.info("Start");
		List<Movie> list = movieService.getMovieListCustomer();
		System.err.println(String.format("%-3s %-20s %-15s %-8s %-30s %-18s %-15s", "Id", "Title", "Bos Office",
				"Active", "Date of Launch", "Genre", "Has Teaser"));
		list.forEach(e->System.out.println(e));
		LOGGER.info("End");
	}
	
	private static void testModifyMovie()
	{
		LOGGER.info("Start");
		Movie movie=new Movie(1, "The Queen", "$2,514,512,988", true, DateUtil.convertToDate("16/08/2022"),"Fiction", false);
		movieService.modifyMovie(movie);
		LOGGER.info("End");
	}
	private static void testGetMovie(long id)
	{
		LOGGER.info("Start");
		Movie update=movieService.getMovie(id);
		System.err.println(String.format("%-3s %-20s %-15s %-8s %-30s %-18s" + " %-15s", "Id", "Title",
				"Bos Office", "Active", "Date of Launch", "Genre", "Has Teaser"));
		System.out.println(update);
		LOGGER.info("End");
		
	}

}
