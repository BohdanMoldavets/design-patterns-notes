package org.moldavets.model.Impl.bird.Impl;

import org.moldavets.model.Impl.bird.Bird;
import org.moldavets.model.Swimmable;
import org.moldavets.model.Walkable;

public class Duck extends Bird implements Swimmable, Walkable {

    @Override
    public void eat() {
        System.out.println("Duck eat");
    }

    @Override
    public void fly() {

    }

    @Override
    public void propagate() {
        System.out.println("Duck propagate");
    }

    @Override
    public void swim() {

    }

    @Override
    public void walk() {

    }
}
