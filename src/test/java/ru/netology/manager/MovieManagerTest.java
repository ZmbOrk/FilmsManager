package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    MovieManager manager = new MovieManager();
    private Movie first = new Movie(1,"https://Bloodshot_poster.jpg","Bloodshot","action");
    private Movie second = new Movie(2,"https://Forward_poster.jpg","forward","cartoon");
    private Movie third = new Movie(3,"https://Hotel_Belgrade_poster.jpg","Hotel Belgrade","comedy");
    private Movie four = new Movie(4,"https://Gentlemens_poster.jpg","Gentlemens","thriller");
    private Movie fifth = new Movie(5,"https://The_Invisible_Man_poster.jpg","The Invisible Man","horror");
    private Movie six = new Movie(6,"https://Trolls_World_Tour_poster.jpg","Trolls World Tour","cartoon");
    private Movie seventh = new Movie(7,"https://Number_One_poster.jpg","NumberOne","comedy");
    private Movie eigth = new Movie(8,"https://Soul_poster.jpg","Soul","cartoon");
    private Movie ninth = new Movie(9,"https://Father_poster.jpg","Fatrher","drama");
    private Movie tenth = new Movie(10,"https://One_more_poster.jpg","One more","drama");
    private Movie eleven = new Movie(11,"https://Minari_poster.jpg","Minari","drama");

    @BeforeEach
    void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(fifth);
        manager.add(six);
        manager.add(seventh);
        manager.add(eigth);
        manager.add(ninth);
        manager.add(tenth);
    }

    @Test
    void addNewFilms() {
        Movie eleven = new Movie(11,"https://Minari_poster.jpg","Minari","drama");
        manager.add (eleven);
        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{eleven, tenth, ninth, eigth, seventh, six, fifth, four, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIfExists() {
        MovieManager manager = new MovieManager(8);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(fifth);
        manager.add(six);
        manager.add(seventh);
        manager.add(eigth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] current = manager.getMovies();
        Movie[] expected = new Movie[] {tenth,ninth,eigth,seventh,six,fifth,four,third};
        assertArrayEquals(expected,current);
    }
    @Test
    void shouldFilmsOverLimit() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(fifth);
        manager.add(six);
        manager.add(seventh);
        manager.add(eigth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleven);
        Movie[] current = manager.getMovies();
        Movie[] expected = new Movie[] {eleven,tenth,ninth,eigth,seventh,six,fifth,four,third,second};
        assertArrayEquals(expected,current);
    }
    @Test
    void shouldFilmsUnderLimit() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(fifth);
        manager.add(six);
        manager.add(seventh);
        Movie[] current = manager.getMovies();
        Movie[] expected = new Movie[] {seventh,six,fifth,four,third,second,first};
        assertArrayEquals(expected,current);
    }
    @Test
    void shouldFilmsLimit() {
        MovieManager manager = new MovieManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(fifth);
        manager.add(six);
        manager.add(seventh);
        manager.add(eigth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] current = manager.getMovies();
        Movie[] expected = new Movie[] {tenth,ninth,eigth,seventh,six,fifth,four,third,second,first};
        assertArrayEquals(expected,current);
    }

}