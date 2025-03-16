package org.moldavets.model.vehicle.Impl;

import org.moldavets.model.vehicle.Vehicle;

public class Car implements Vehicle {

    private String color;

    @Override
    public void startEngine() {
        System.out.println("Car Engine Started");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}
