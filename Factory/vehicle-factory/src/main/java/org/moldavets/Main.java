package org.moldavets;

import org.moldavets.factory.ShapeFactory;
import org.moldavets.factory.VehicleFactory;
import org.moldavets.utils.ShapeType;
import org.moldavets.utils.VehicleType;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicleFactory.create(VehicleType.CAR).startEngine();

        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.create(ShapeType.RECTANGLE).draw();
    }
}