package com.cognizant.moviecruiser;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cognizant.moviecruiser.dao.MovieDaoSqlImpl;
import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.util.DateUtil;

@SpringBootApplication
@EntityScan(basePackages = { "com" })
@ComponentScan(basePackages = { "com.cognizant.moviecruiser.service" , "com.cognizant.moviecruiser.dao"})
@EnableJpaRepositories(basePackages = { "com.cognizant.moviecruiser.repository" })
public class MovieDaoSqlImplTest implements CommandLineRunner {
 
	
	
	@Autowired
	private MovieDaoSqlImpl moviesqlimpl;  // Service class as given in skeleton

	public static void main(String[] args) {

		SpringApplication.run(MovieDaoSqlImplTest.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
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
						System.err.println(String.format("%-3s %-20s %-15s %-8s %-30s %-18s " + "%-15s", "Id", "Title",
								"Bos Office", "Active", "Date of Launch", "Genre", "Has Teaser"));
						System.err.println();

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
						System.err.println(String.format("%-3s %-20s %-15s %-8s %-30s %-18s" + " %-15s", "Id", "Title",
								"Bos Office", "Active", "Date of Launch", "Genre", "Has Teaser"));
						System.err.println();

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
				System.err.println(String.format("%-3s %-20s %-15s %-8s %-30s %-18s %-15s", "Id", "Title", "Bos Office",
						"Active", "Date of Launch", "Genre", "Has Teaser"));
				System.err.println();

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
	
	public void testGetMovieListAdmin() {

		List<Movie> movieListAdmin = moviesqlimpl.getMovieListAdmin();
		movieListAdmin.forEach(e->System.err.println(e));

	}

	public  void testGetMovieListCustomer() {
		List<Movie> movieListCustomer = moviesqlimpl.getMovieListCustomer();
		movieListCustomer.forEach(e->System.err.println(e));
	}

	public  void testModifyMovie() {
		Movie movie = new Movie(1, "The Martian", "$2,514,512,988", true, DateUtil.convertToDate("16/08/2022"),
				"Fiction", false);
		moviesqlimpl.modifyMovie(movie);
	}

	public  void testGetMovie(long id) {

		Movie updatedMovie = moviesqlimpl.getMovie(id);
		System.err.println(updatedMovie);
	}

}
