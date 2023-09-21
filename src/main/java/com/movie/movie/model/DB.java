package com.movie.movie.model;

import java.util.ArrayList;
import java.util.List;

public class DB {


    public static List<Bean> movie = new ArrayList<>();

    static {
        initializeMovieData();
    }
    public static void initializeMovieData(){

        movie.add(new com.movie.movie.model.Bean("1", "Pathat", "This is a Pathat movie by Shahrukh Khan", 8.9, "Action", 2022));
        movie.add(new com.movie.movie.model.Bean("2", "Action Hero", "An action-packed thriller", 7.5, "Action", 2021));
        movie.add(new com.movie.movie.model.Bean("3", "Romantic Bliss", "A heartwarming love story", 9.2, "Romance", 2023));
        movie.add(new com.movie.movie.model.Bean("4", "Sci-Fi Adventure", "Exploring the universe", 8.0, "Sci-Fi", 2020));
        movie.add(new com.movie.movie.model.Bean("5", "Comedy Central", "Laugh your heart out", 8.5, "Comedy", 2022));
        movie.add(new com.movie.movie.model.Bean("6", "Mystery Mansion", "Solving the ultimate mystery", 7.7, "Mystery", 2021));
        movie.add(new com.movie.movie.model.Bean("7", "Historical Epic", "A journey through history", 9.0, "Historical", 2019));
        movie.add(new Bean("8", "Fantasy World", "Enter a magical realm", 8.3, "Fantasy", 2022));

    }


}
