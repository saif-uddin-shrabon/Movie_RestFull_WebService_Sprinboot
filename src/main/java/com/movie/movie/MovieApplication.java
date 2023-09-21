package com.movie.movie;

import com.movie.movie.model.Bean;
import com.movie.movie.model.DB;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
public class MovieApplication {



	public static void main(String[] args) {


		SpringApplication.run(MovieApplication.class, args);

		new DB();



	}



}
