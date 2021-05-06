package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] movies = new Movie[0];
    private int movieCount = 10;

    public MovieManager() {
    }

    public MovieManager(int movieCount) {
        this.movieCount = movieCount;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getMovies() {
        int count = movieCount;
        if (movieCount > movies.length) {
            count = movies.length;
        }
        Movie[] result = new Movie[count];
        for (int i = 0; i < count; i++) {
            result[i] = movies[movies.length - i - 1];
        }
        return result;
    }
}