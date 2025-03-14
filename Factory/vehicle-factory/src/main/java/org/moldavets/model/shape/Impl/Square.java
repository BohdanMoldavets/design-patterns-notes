package org.moldavets.model.shape.Impl;

import org.moldavets.model.shape.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}
