package com.schening.cocoon.refactoring;

import java.util.Vector;

/**
 * @author schening
 * @version 1.0
 * @date 2021/5/27 0:00
 */
public class Customer {

    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector get_rentals() {
        return rentals;
    }

    public void set_rentals(Vector rentals) {
        this.rentals = rentals;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", rentals=" + rentals +
                '}';
    }
}
