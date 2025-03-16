package org.moldavets.utils;

import org.moldavets.model.vehicle.Impl.Car;
import org.moldavets.model.vehicle.Impl.SportCar;
import org.moldavets.model.vehicle.Impl.Truck;
import org.moldavets.model.vehicle.Vehicle;

public enum VehicleType {
    CAR,
    TRUCK,
    SPORTCAR;

    public static Vehicle getVehicle(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new Car();
            case TRUCK -> new Truck();
            case SPORTCAR -> new SportCar();
        };
    }
}
