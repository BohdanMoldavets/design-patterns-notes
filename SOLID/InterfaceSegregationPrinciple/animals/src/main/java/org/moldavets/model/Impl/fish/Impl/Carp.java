package org.moldavets.model.Impl.fish.Impl;

import org.moldavets.model.Impl.fish.Fish;
import org.moldavets.model.Propagationable;

public class Carp extends Fish implements Propagationable {
    @Override
    public void eat() {
        System.out.println("Carp eat");
    }

    @Override
    public void swim() {

    }

    @Override
    public void propagate() {

    }
}
