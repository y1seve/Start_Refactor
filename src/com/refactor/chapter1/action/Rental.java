package com.refactor.chapter1.action;

import com.refactor.chapter1.entity.Movie;

/**
 * Created by Jim on 17/4/2.
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

}
