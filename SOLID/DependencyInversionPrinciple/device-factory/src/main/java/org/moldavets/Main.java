package org.moldavets;

import org.moldavets.model.AbstractManufacturingProcess;
import org.moldavets.model.Impl.SmartphoneManufacturingProcess;

public class Main {
    public static void main(String[] args) {
        AbstractManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Iphone");
        manufacturer.launchProcess();
    }
}