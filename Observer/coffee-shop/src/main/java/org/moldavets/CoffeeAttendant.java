package org.moldavets;

import org.moldavets.model.Impl.Customer;

import java.util.*;

public class CoffeeAttendant {

    private List<Customer> customers = new ArrayList<>();
    private List<String> completedDrinks = new ArrayList<>();

    public void takeOrder(Customer customer) {
        customers.add(customer);
    }

    public void prepareOrder(String drinkToPrepare) {
        completedDrinks.add(drinkToPrepare);
    }

    public void callOutCompletedOrder() {
        Iterator<Customer> customerIterator = customers.iterator();
        while (customerIterator.hasNext()) {
            Customer customer = customerIterator.next();
            Iterator<String> completedDrinksIterator = completedDrinks.iterator();
            while (completedDrinksIterator.hasNext()) {
                String drink = completedDrinksIterator.next();
                if(customer.getOrderedDrink().equals(drink)) {
                    customer.orderReady(drink);
                    completedDrinksIterator.remove();
                    customerIterator.remove();
                    break;
                }
            }
        }
    }
}
