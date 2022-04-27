package com.company;

public class Main {

    public static void main(String[] args) {
        // Tests
//        Holiday day0 = new Holiday("test", 3, "June");
//        Holiday day1 = new Holiday("test1", 7, "June");
//        System.out.println(Holiday.inSameMonth(day0, day1));
//        System.out.println(Holiday.avgDate(new Holiday[]{day0, day1}));

        Holiday independenceDay = new Holiday("Independence Day", 4, "July");

        // Tests
//        Movie movie0 = new Movie("test", "test1", "notPG");
//        Movie movie1 = new Movie("test2", "test13");
//        Movie movie2 = new Movie("test4", "test15");
//        Movie[] pgMovies = Movie.getPG(new Movie[]{movie0,movie1,movie2});
//        System.out.println(pgMovies.length);
//        for (Movie pgMovie : pgMovies) {
//            System.out.println(pgMovie.getTitle());
//        }

        Movie casinoRoyal = new Movie("Casino Royal", "EON Productions", "PG-13");
    }
}
