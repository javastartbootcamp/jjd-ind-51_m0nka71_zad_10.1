package pl.javastart.task;

import java.util.Scanner;

public class MovieDatabase {
    Scanner scan = new Scanner(System.in);
    private static final int MAX_MOVIES = 3;
    private int movieCounter;

    Movie[] movies = new Movie[MAX_MOVIES];

    private void add(Movie movie) {
        if (movieCounter < MAX_MOVIES) {
            movies[movieCounter] = movie;
            movieCounter++;
        } else {
            System.out.println("Brak miejsca");
        }
    }

    private Movie readMovie() {
        Movie movie = new Movie();
        System.out.println("Podaj tytuł:");
        movie.setName(scan.nextLine());
        System.out.println("Podaj rocznik:");
        movie.setYear(scan.nextInt());
        scan.nextLine();
        return movie;
    }

    void run() {
        System.out.println("Podaj informację o trzech unikalnych filmach");
        while (movieCounter < MAX_MOVIES) {
            Movie movie = readMovie();

            boolean exists = checkIfMovieAlreadyExists(movie);

            if (!exists) {
                add(movie);
            } else {
                System.out.println("Duplikat");
            }
        }
    }

    private boolean checkIfMovieAlreadyExists(Movie movie) {
        for (Movie movieCheck : movies) {
            if (movie.equals(movieCheck)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Movie movie : movies) {
            result.append("\nFilm: ").append(movie.getName()).append(", rocznik: ").append(movie.getYear());
        }
        return result.toString();
    }
}
