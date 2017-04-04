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
        String result = "Rental Record for " + getName() + "\n";
        for(Rental each : _rentals) {
/*            double thisAmount = 0;

            //replace temp with query 用查询取代临时变量
            //determine amounts for each line
            thisAmount = each.getCharge();*/
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        for(Rental each : _rentals) {
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        for(Rental each : _rentals) {
            result += each.getFrequentRenterPoints();
        }
        return result;
    }


}
