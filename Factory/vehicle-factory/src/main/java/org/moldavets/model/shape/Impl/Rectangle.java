package org.moldavets.model.shape.Impl;

import org.moldavets.model.shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
