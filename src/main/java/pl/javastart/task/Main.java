package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        MovieDatabase movieDatabase = new MovieDatabase();

        movieDatabase.run();
        System.out.println(movieDatabase);
    }
}