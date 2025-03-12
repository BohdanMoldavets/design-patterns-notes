package org.moldavets;

import org.moldavets.model.Impl.Customer;
import org.moldavets.model.WaitingCustomer;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendant {

    private List<Customer> customers = new ArrayList<>();
    private String completedDrink;

    public void takeOrder(Customer waitingCustomer) {
        customers.add(waitingCustomer);
        prepareOrder(waitingCustomer.getOrderedDrink());
    }

    public void prepareOrder(String drinkToPrepare) {
        customers.stream()
                .findFirst()
                .ifPresent(customer -> completedDrink = customer.getOrderedDrink());
        callOutCompletedOrder();
    }

    public void callOutCompletedOrder() {
        customers.stream()
                .filter(c -> c.getOrderedDrink().equalsIgnoreCase(completedDrink))
                .findFirst()
                .ifPresent(customer -> {
           customer.orderReady(completedDrink);
           completedDrink = null;
           customers.remove(customer);
        });
    }
}
