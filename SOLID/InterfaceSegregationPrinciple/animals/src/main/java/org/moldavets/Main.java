package org.moldavets;

import org.moldavets.model.Animal;
import org.moldavets.model.Impl.fish.Impl.Carp;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Carp();
        animal.eat();

    }
}