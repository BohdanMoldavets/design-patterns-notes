package org.moldavets;

import org.moldavets.model.Impl.Customer;

public class Main {
    public static void main(String[] args) {
        CoffeeAttendant coffeeAttendant = new CoffeeAttendant();

        coffeeAttendant.takeOrder(new Customer("John", "Americano"));
        coffeeAttendant.takeOrder(new Customer("Jack", "Cappuccino"));
        coffeeAttendant.takeOrder(new Customer("Jane", "Water"));
        coffeeAttendant.takeOrder(new Customer("Denis", "Tea"));
        coffeeAttendant.prepareOrder("Tea");
        coffeeAttendant.prepareOrder("Water");
        coffeeAttendant.prepareOrder("Americano");
        coffeeAttendant.callOutCompletedOrder();
    }
}