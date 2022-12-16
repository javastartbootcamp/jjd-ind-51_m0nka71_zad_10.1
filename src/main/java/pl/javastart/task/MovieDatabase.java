package pl.javastart.task;

import java.util.Scanner;

public class MovieDatabase {
    Scanner scan = new Scanner(System.in);
    private static final int MAX_MOVIES = 3;
    private int movieCounter;

    Movie[] movies = new Movie[MAX_MOVIES];

    void add(Movie movie) {
        if (movieCounter < MAX_MOVIES) {
            movies[movieCounter] = movie;
            movieCounter++;
        } else {
            System.out.println("Brak miejsca");
        }
    }

    Movie movieCreator() {
        Movie movie = new Movie();
        System.out.println("Podaj tytuł:");
        movie.setName(scan.nextLine());
        System.out.println("Podaj rocznik:");
        movie.setYear(scan.nextInt());
        scan.nextLine();
        do {
            Movie movie1 = new Movie();
            System.out.println("Podaj tytuł:");
            movie1.setName(scan.nextLine());
            System.out.println("Podaj rocznik:");
            movie1.setYear(scan.nextInt());
            scan.nextLine();
            if (movie.equals(movie1)) {
                break;
            }
            movie = movie1;
        } while (true);
        System.out.println("Duplikat");
        return movie;
    }

    //Chyba tak nie mogę?
    @Override
    public String toString() {
        for (Movie movie : movies) {
            return "Film: " + movie.getName() + ", rocznik: " + movie.getYear();
        }
        return "";
    }
}
