package org.moldavets.factory;

import org.moldavets.model.vehicle.Vehicle;
import org.moldavets.utils.VehicleType;

public class VehicleFactory implements Factory<Vehicle, VehicleType>{
    @Override
    public Vehicle create(VehicleType value) {
        return VehicleType.getVehicle(value);
    }
}
