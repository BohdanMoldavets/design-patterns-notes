package org.moldavets;

import org.moldavets.model.Impl.Customer;

public class Main {
    public static void main(String[] args) {
        CoffeeAttendant coffeeAttendant = new CoffeeAttendant();
        Customer customer = new Customer("John", "Americano");

        coffeeAttendant.takeOrder(customer);
    }
}