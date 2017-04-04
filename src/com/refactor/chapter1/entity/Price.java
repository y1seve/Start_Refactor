package com.refactor.chapter1.entity;

/**
 * Created by Jim on 17/4/4.
 */
public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
