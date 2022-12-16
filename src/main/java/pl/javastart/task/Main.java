package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj informację o trzech unikalnych filmach");
        MovieDatabase movieDatabase = new MovieDatabase();
        movieDatabase.add(movieDatabase.movieCreator());
    }
}