package org.moldavets;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void accept(List<String> vacancies) {
        System.out.println("Dear " + name + " we have some changes in vacancies " + vacancies);
    }
}
