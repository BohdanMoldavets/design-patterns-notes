package org.moldavets.model.Impl;

import org.moldavets.model.WaitingCustomer;

public class Customer implements WaitingCustomer {

    private String name;
    private String orderedDrink;

    public Customer(String name, String orderedDrink) {
        this.name = name;
        this.orderedDrink = orderedDrink;
    }

    @Override
    public void orderReady(String preparedDrink) {
        System.out.println(name+": Thank you, for " + preparedDrink);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderedDrink() {
        return orderedDrink;
    }

    public void setOrderedDrink(String orderedDrink) {
        this.orderedDrink = orderedDrink;
    }
}
