package com.refactor.chapter1.entity;

import com.refactor.chapter1.action.Rental;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jim on 17/4/2.
 */
public class Customer {
    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        return "";
    }
}
