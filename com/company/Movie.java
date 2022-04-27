package com.company;

import java.util.Arrays;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getTitle() {
        return title;
    }

    public static Movie[] getPG(Movie[] movies){
        Movie[] pgMovies = new Movie[movies.length];
        int counter = 0;
        for (Movie movie : movies) {
            if(movie.rating.equals("PG")) {
                {
                    pgMovies[counter] = movie;
                    counter ++;
                }
            }
        }
        return Arrays.copyOfRange(pgMovies, 0, counter);
    }
}